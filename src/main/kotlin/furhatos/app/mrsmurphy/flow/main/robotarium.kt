package furhatos.app.mrsmurphy.flow.main

import furhat.libraries.standard.UtilsLib
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.app.mrsmurphy.flow.trivia.AskQuestion
import furhatos.flow.kotlin.*
import furhatos.nlu.common.DontKnow
import theparser
import java.time.LocalTime


var firstEntry = true
val Robotarium: State = state(Parent) {
    var response=""
    onEntry {
        if(firstEntry){
            UtilsLib.randomNoRepeat(
                { furhat.say("Hi") },
                { furhat.say("hello") },
                { furhat.say("Hello there!") },
                { val time = LocalTime.now()
                    val greeting = when (time.hour) {
                        in 6..11 -> "Good morning!"
                        in 12..17 -> "Good afternoon!"
                        else -> "Good evening!"
                    }
                    furhat.say(greeting)
                })
            furhat.say("Welcome to the National Robotarium!")
            call(whatCanIDo(true))
            firstEntry = false
            furhat.say("Is there something specific you would like to know more about the place?")
            furhat.listen()
        }
        else {
            call(whatCanIDo(false))
            random(
                { furhat.say("Are you interested in any particular aspect of our facility or would you like a general overview of what we offer?") },
                { furhat.say("Can you tell me what specifically brought you here so that I can direct you to the information you need?") }
            )
            furhat.listen()
        }
    }
    onReentry {
        call(whatCanIDo(false))
        furhat.say("Is there anything else you would like to know more about?")
        furhat.listen()
    }

    onResponse<NationalRobotarium> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<AboutMurphy> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Researches> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<WhatsNew> {
        var intent = ((it.intent).toString()).dropLast(2)
        var keyIntent = keypairs[intent]?.split(",")?.random()
        response=nlgdata[keyIntent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<HeathCare> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Manufacturing> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Offshore> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Agriculture> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<ConversationalAgents> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<UpcomingEvent> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

   onResponse<ProjectNameIntent> {
        var intent = ((it.intent).toString()).dropLast(2)
        var key = it.intent.which.toString()
        response=nlgdata[key]?.fulldesc.toString()  // to search in dictionary
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<DontKnow> {
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }
    onResponse<Cafe> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=" there is no cafe inside robotarium -(if on further ask) presence of coffee machine in the building - cafe in the university like elements,piece "
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }
    onResponse<Toilet> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=" there is toilets inside robotarium -(if on further ask) just take the left "
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<playgame> {
        UtilsLib.randomNoRepeat(
            { furhat.say("May I offer you some trivia about the building that you may find intriguing?") },
            { furhat.say("Are you interested in any particular information regarding the building that I can share with you?") },
            { furhat.say("Would you like to learn an interesting fact about the building?") } )
        call(AskQuestion())
    }
    onResponse<Appreciate> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=" aww thank you make murphy appreciate the user back maybe even greet the user based on the user's response"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }
    onResponse<MyName> {
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }
    onResponse<Wifi> {
//        var intent = ((it.intent).toString()).dropLast(2)
//        response=""
//        var replygpt= getNLGResponseFromGPT((response))
//        call(theparser(replygpt))
        furhat.say("Sure, the WIFI available inside National Robotarium is powered by eduroam. To connect to our WIFI, you will need to use your eduroam login credentials.")
        furhat.listen()

    }
    onResponse<GoodBye> {
        var intent = ((it.intent).toString()).dropLast(2)
        response= "Visitor wants to leave the conversation. Thank the visitor for talking to Murphy"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        //furhat.listen()

    }
    onResponse<Alright> {
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse {
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }
    onNoResponse {
        UtilsLib.randomNoRepeat(
            {furhat.say("Would you like to learn some interesting facts about the National Robotarium through a quiz?")
                call(AskQuestion())},
            {},{},{},{},{},{},{},{}
        )
        furhat.listen(10000)
    }
}