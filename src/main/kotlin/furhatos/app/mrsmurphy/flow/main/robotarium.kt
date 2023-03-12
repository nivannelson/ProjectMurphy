package furhatos.app.mrsmurphy.flow.main

import ReadFile
import furhat.libraries.standard.UtilsLib
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.app.mrsmurphy.flow.trivia.AskQuestion
import furhatos.flow.kotlin.*
import furhatos.gestures.Gestures
import furhatos.nlu.common.DontKnow
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes
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
            var intent = "aboutmurphy"
            response = ReadFile().getResponse(intent, "")
            UtilsLib.randomNoRepeat(
            { furhat.say("Welcome to the National Robotarium!") },
            { furhat.say("") },
            { furhat.say("") },
            { furhat.say("") },
            { furhat.say("") }
        )
            firstEntry = false
        call(whatCanIDo(true))
        furhat.listen()}
        var intent = "aboutmurphy"
        response = ReadFile().getResponse(intent, "")
            furhat.listen()
        }
    onReentry {
        var intent = "aboutmurphy"
        response = ReadFile().getResponse(intent, "")
        call(whatCanIDo(false))
        furhat.listen()

    }

    onResponse<NationalRobotarium> {

        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        //goto(newfunction(response))
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<AboutMurphy>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<Researches>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<WhatsNew>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<HeathCare>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<Manufacturing>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<Offshore>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<Agriculture>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<ConversationalAgents>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response = ReadFile().getResponse(intent, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<PersonInCharge>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var key = intent + " - ${it.intent.project}"
        response = ReadFile().getResponse(key, "")
        parseResponse(getNLGResponseFromGPT(response))
    }

    onResponse<DontKnow> {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        furhat.say(getNLGResponseFromGPT(response))
        furhat.listen()

    }

    onResponse {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        furhat.say(getNLGResponseFromGPT(response))
        furhat.listen()

    }
    onNoResponse {
        UtilsLib.randomNoRepeat(
            {furhat.say("if your interested can i ask you a trivia question?")
                call(AskQuestion())
            },
            {furhat.say("are you interest in knowing some facts about this building")
                call(AskQuestion())},
            {},{},{},{},{},{}
        )

        furhat.listen(10000)
    }

}

fun newfunction(response: String) : State = state(Parent){
    onEntry {parseResponse(getNLGResponseFromGPT(response))  }
    onResponse {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        furhat.say(getNLGResponseFromGPT(response))
        furhat.listen()

    }
    onNoResponse {
        furhat.listen(5000)
        UtilsLib.randomNoRepeat(
            {furhat.say("if your interested can i ask you a trivia question?")
            furhat.listen(3000)
            onResponse<Yes> { call(AskQuestion()) }
            onResponse {}
            onNoResponse {}
            },
            {furhat.say("are you interest in knowing some facts about this building")
            furhat.listen(3000)
            onResponse<Yes> { call(AskQuestion()) }
            onResponse {}
            onNoResponse {}},
            {},{},{},{},{},{}
            )

        furhat.listen(500)
    }

}
