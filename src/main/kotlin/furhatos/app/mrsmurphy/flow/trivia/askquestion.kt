package furhatos.app.mrsmurphy.flow.trivia

import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.main.Robotarium
import furhatos.app.mrsmurphy.flow.main.getNLGResponseFromGPT
import furhatos.app.mrsmurphy.flow.nlu.*

import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.nlu.common.RequestRepeat
import furhatos.nlu.common.Yes
import theparser

var onetime = true
fun AskQuestion(): State = state(parent = Parent) {


    onEntry {
        furhat.listen(3000)
    }
    onResponse({ listOf(Yes(), Absolutely()) }){
        if (onetime == true) {
            onetime = false
            furhat.setSpeechRecPhrases(QuestionSet.current.speechPhrases)

            // Ask the question followed by the options
            furhat.ask(QuestionSet.current.text + " " + QuestionSet.current.getOptionsString())

        } else {
            QuestionSet.next()
            furhat.setSpeechRecPhrases(QuestionSet.current.speechPhrases)
            furhat.ask(QuestionSet.current.text + " " + QuestionSet.current.getOptionsString())
        }
    }

    // User is answering with any of the alternatives
    onResponse<AnswerOption> {
        val answer = it.intent

        // If the user answers correct, we up the user's score and congratulates the user
        if (answer.correct) {
            furhat.gesture(Gestures.Smile)

            random(
                { furhat.say("Great! That was the ${furhat.voice.emphasis("right")}  answer") },
                { furhat.say("that was ${furhat.voice.emphasis("correct")}") }
            )

            var replygpt= getNLGResponseFromGPT(("the correct answer is  "+ QuestionSet.current.makeans() +"give a brief explanation or an amusing fact about this"))
            call(theparser(replygpt))
            goto(Robotarium)
            /*
            If the user answers incorrect, we give another user the chance of answering if one is present in the game.
            If we indeed ask another player, the furhat.ask() interrupts the rest of the handler.
             */
        } else {
            furhat.gesture(Gestures.BrowFrown)
            furhat.say("Sorry, that was ${furhat.voice.emphasis("not")} correct")
            var replygpt= getNLGResponseFromGPT(("the correct answer is  "+ QuestionSet.current.makeans() +"give a brief explanation or an amusing fact about this"))
            call(theparser(replygpt))
            goto(Robotarium)

            /* Find another user that has not answered this question and if so, asks them.
             For the flow of the skill, we will continue asking the new user the next question through the
             shouldChangeUser = false flag.
             */

        }


        // The users answers that they don't know
        onResponse<DontKnow> {
            var replygpt= getNLGResponseFromGPT(("the correct answer is  "+ QuestionSet.current.makeans() +"give a brief explanation or an amusing fact about this"))
            call(theparser(replygpt))
        }

        onResponse<RequestRepeat> {
            furhat.setSpeechRecPhrases(QuestionSet.current.speechPhrases)

            // Ask the question followed by the options
            furhat.ask(QuestionSet.current.text + " " + QuestionSet.current.getOptionsString())
        }

        onResponse<RequestRepeatQuestion> {
            furhat.gesture(Gestures.BrowRaise)
            furhat.ask(QuestionSet.current.text)
        }

        // The user wants to hear the options again
        onResponse<RequestRepeatOptions> {
            furhat.gesture(Gestures.Surprise)
            random(
                { furhat.ask("They are ${QuestionSet.current.getOptionsString()}") },
                { furhat.ask(QuestionSet.current.getOptionsString()) }
            )
        }

        // If we don't get any response, we assume the user was too slow


        /* If we get a response that doesn't map to any alternative or any of the above handlers,
        we track how many times this has happened in a row and give them two more attempts and
        finally moving on if we still don't get it.
     */

    }
    onResponse {

        var replygpt= getNLGResponseFromGPT(("the correct answer is  "+ QuestionSet.current.makeans() +"give a brief explanation or an amusing fact about this"))
        call(theparser(replygpt))
        goto(Robotarium)
    }
    onNoResponse {
        furhat.listen(7000)
        goto(Robotarium) }
}