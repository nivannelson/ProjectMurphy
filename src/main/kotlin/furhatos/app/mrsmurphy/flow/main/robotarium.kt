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
            var intent = "aboutmurphy"
            //response = ReadFile().getResponse(intent, "")
            response=nlgdata[intent]?.fulldesc.toString()
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
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()
            furhat.listen()
        }
    onReentry {
        var intent = "aboutmurphy"
        //response = ReadFile().getResponse(intent, "")
        response= nlgdata[intent]?.fulldesc.toString()
        call(whatCanIDo(false))
        furhat.listen()

    }

    onResponse<NationalRobotarium> {

        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()
        //goto(newfunction(response))

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<AboutMurphy>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Researches>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<WhatsNew>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<HeathCare>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Manufacturing>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Offshore>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<Agriculture>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse<ConversationalAgents>(){
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        //response = ReadFile().getResponse(intent, "")
        response=nlgdata[intent]?.fulldesc.toString()

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

 /*   onResponse<PersonInCharge>(){

        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var key = intent + " - ${it.intent.project}"
        response = ReadFile().getResponse(key, "")

        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }*/

    onResponse<DontKnow> {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<Cafe> {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        response=" there is no cafe inside robotarium -(if on further ask) presence of coffe machine in the building - cafe in the unversity like elements,piece "
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<Toilet> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=" there is toilets inside robotarium -(if on further ask) just take the left "
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<playgame> {
        UtilsLib.randomNoRepeat(
            { furhat.say("Can i ask?") },
            { furhat.say("i will ask now is that ok?") },
            { furhat.say("ok, can i ask now") } )
        call(AskQuestion())

    }
    onResponse<Appretiate> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=" aww thankyou make murphy apretiate the user back maybe even greet the user "
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<MyName> {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<Wifi> {
        var intent = ((it.intent).toString()).dropLast(2)
        response=""
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<GoodBye> {
        var intent = ((it.intent).toString()).dropLast(2)
        response= "user wants to go away do "
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<Alright> {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()
    }

    onResponse {

        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
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
    onEntry {
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen() }
    onResponse {
        var intent = ((it.intent).toString()).dropLast(2)
        println("intents triggered:"+intent)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
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
