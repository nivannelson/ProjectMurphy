package furhatos.app.mrsmurphy.flow.main

import furhat.libraries.standard.UtilsLib
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.app.mrsmurphy.flow.trivia.AskQuestion
import furhatos.flow.kotlin.*
import furhatos.nlu.EnumEntity
import furhatos.nlu.common.DontKnow
import theparser
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.format.DateTimeFormatter


var firstEntry = true
val Robotarium: State = state(Parent) {
    var response=""
    onEntry {
        if(firstEntry){
            furhat.ledStrip.solid(java.awt.Color(127,0,0))
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
            furhat.ledStrip.solid(java.awt.Color(0,127,0))
            furhat.listen()
        }
        else {
            furhat.ledStrip.solid(java.awt.Color(127,0,0))
            call(whatCanIDo(false))
            random(
                { furhat.say("Are you interested in any particular aspect of our facility or would you like a general overview of what we offer?") },
                { furhat.say("Can you tell me what specifically brought you here so that I can direct you to the information you need?") }
            )
            furhat.ledStrip.solid(java.awt.Color(0,127,0))
            furhat.listen()
        }
    }
    onReentry {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        call(whatCanIDo(false))
        furhat.say("Is there anything else you would like to know more about?")
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }


    onResponse<WhereamI>{
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<NationalRobotarium> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<AboutMurphy> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<Researches> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<WhatsNew> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        var keyIntent = keypairs[intent]?.split(",")?.random()
        response=nlgdata[keyIntent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<HeathCare> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<Manufacturing> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<Offshore> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<Agriculture> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<ConversationalAgents> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

    onResponse<UpcomingEvent> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response=nlgdata[intent]?.fulldesc.toString()
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }

   onResponse<ProjectNameIntent> {
       var thename: EnumEntity? = it.intent.Pname
       var key = ""
       if (thename != null) {
       if (thename.value != null) {key = thename.value.toString()}
       else {key = thename.toText()}}
       furhat.ledStrip.solid(java.awt.Color(127,0,0))


        response=nlgdata[key]?.fulldesc.toString()  // to search in dictionary
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
       furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }


    onResponse<DontKnow> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<Cafe> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        response=" there is no cafe inside robotarium -(if on further ask) presence of coffee machine in the building - cafe in the university like elements,piece "
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<Toilet> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        response=" there is toilets inside robotarium -(if on further ask) just take the left "
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()

    }
    onResponse<playgame> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        UtilsLib.randomNoRepeat(
            { furhat.say("May I offer you some trivia about the building that you may find intriguing?") },
            { furhat.say("Are you interested in any particular information regarding the building that I can share with you?") },
            { furhat.say("Would you like to learn an interesting fact about the building?") } )
        call(AskQuestion())
    }
    onResponse<Appreciate> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        response=" aww thank you make murphy appreciate the user back maybe even greet the user based on the user's response"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<MyName> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<DateTime> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
        val current = LocalDateTime.now().format(formatter)
        val day = LocalDateTime.now().dayOfWeek
        response = "Today date and time is $current. The format is yyyy-MM-dd HH:mm, where yyyy is the year, MM is the month, dd is the day, HH is the time in hours, mm is the time in minutes. The name of the day is $day"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<Wifi> {
//        var intent = ((it.intent).toString()).dropLast(2)
//        response=""
//        var replygpt= getNLGResponseFromGPT((response))
//        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        furhat.say("Sure, the WIFI available inside National Robotarium is powered by eduroam. To connect to our WIFI, you will need to use your eduroam login credentials.")
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse<GoodBye> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response= "Visitor wants to leave the conversation. Thank the visitor for talking to Murphy"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        goto(Idle)

    }
    onResponse<Weather> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        response= "Visitor wants to know the weather at Currie, Edinbrugh,EH144AS use Edinbrugh weather forecast, website link : https://www.meteoblue.com/en/region/weather/radar/scotland_united-kingdom_2638360 to find the temperature and weather"
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.listen()

    }
    onResponse<Alright> {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var intent = ((it.intent).toString()).dropLast(2)
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onResponse {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        var replygpt= getNLGResponseFromGPT((response))
        call(theparser(replygpt))
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen()
    }
    onNoResponse {
        furhat.ledStrip.solid(java.awt.Color(127,0,0))
        UtilsLib.randomNoRepeat(
            {furhat.say("Would you like to learn some interesting facts about robotics or National Robotarium?")
                call(AskQuestion())},
            {furhat.say("Hey ... can i entertain you with some facts related to robotics")
                call(AskQuestion())},
            {furhat.say("Hey ... can i entertain you with some facts about to robotics")
                call(AskQuestion())},
            {},{},{},{},{},{},{},{},{},{}
        )
        furhat.ledStrip.solid(java.awt.Color(0,127,0))
        furhat.listen(10000)
    }
}