package furhatos.app.mrsmurphy.flow.nlu

import furhatos.app.mrsmurphy.flow.trivia.QuestionSet
import furhatos.nlu.EnumEntity
import furhatos.nlu.EnumItem
import furhatos.nlu.Intent
import furhatos.nlu.WildcardEntity
import furhatos.nlu.common.Number
import furhatos.nlu.common.Time
import furhatos.nlu.wikidata.City
import furhatos.util.Language

class NationalRobotarium : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "could you tell me something about this building",
            "National Robotarium",
            "Robotarium",
            "what is National robotarium",
            "what is this building",
            "can you talk about this building",
            "can you talk about this robotarium",
            "can you talk about this National robotarium",
            "Explain the brief history of this building",
            "Explain the brief history of National robotarium",
            "Explain the brief history of National Laboratory",
            "Explain the brief history of robotarium",
            "What do you know about this building",
            "What do you know about National robotarium",
            "What do you know about robotarium",
            "What is the National Robotarium",
            "Can you give me an explanation about this building"
            )
    }
}

class WhereamI : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Where am I","Can you tell me where am I","","","see you")}}

class AboutMurphy : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Who are you",
            "what can you do",
            "Why are you here",
            "can you talk about yourself",
            "Whats your purpose",
            "talk about you",
            "Explain yourself"
        )
    }
}

class Absolutely: Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Ask away",
            "i am interested",
            "tell me facts",
            "nice I want to know it",
            "Yeah sure ask away"
        )
    }
}


class Researches : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Researches",
            "Research",
            "can you list the researches going on here",
            "Ongoing researches",
            "Can you tell me about the Ongoing researches",
            "what you Know about the Ongoing researches in this building",
            "Can you tell me about the current researches in this building",
            "Can you tell me about the current researches in National robotarium",
            "What are the researches going on the robotarium",
            "Major researches in the National Robotarium",
            "What is the primary focus of research at the National Robotarium"
        )
    }
}
class WhatsNew : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "I was wondering if you could tell me about the latest news from the National robotarium",
            "Hello I was wondering if you could tell me about the latest news from this building",
            "could you tell me about the latest news from the National robotarium",
            "any recent news",
            "any recent update about robotarium",
            "any interesting updates about the robotarium",
            "any recent updates about this building",
            "whats latest updates in here"
        )
    }
}
class HeathCare : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Healthcare",
            "Whats happening in the healthcare project",
            "Whats happening in the healthcare research",
            "could you tell me about the healthcare research",
            "could you tell me about the healthcare research",
            "Researches in healthcare",
            "can you tell me about the researches in medical field"
            )
    }
}
class Manufacturing : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Manufacturing",
            "Whats happening in the Manufacturing project",
            "Whats happening in the Manufacturing research",
            "could you tell me about the Manufacturing research",
            "could you tell me about the Manufacturing research",
            "Researches in Manufacturing",
            "95 Charing"
        )
    }
}

class Offshore : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Offshore",
            "Whats happening in the Offshore project",
            "Whats happening in the Offshore research",
            "could you tell me about the Offshore research",
            "could you tell me about the Offshore research",
            "Researches in Offshore"
        )
    }
}

class Agriculture : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Agriculture",
            "Whats happening in the Agriculture project",
            "Whats happening in the Agriculture research",
            "could you tell me about the Agriculture research",
            "could you tell me about the Agriculture research",
            "Researches in Agriculture"
        )
    }
}

class ConversationalAgents : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Conversational Agents",
            "What is happening in the Conversational Agents project",
            "What is happening in the Conversational Agents research",
            "could you tell me about the Conversational Agents research",
            "could you tell me about the Conversational Agents research",
            "Researches in Conversational Agents"
        )
    }
}

class UpcomingEvent : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Upcoming events",
            "Future events",
            "What are the upcoming events",
            "What are the future events",
            "Can you tell me about the upcoming events",
            "What's happening around here in the coming weeks?",
            "Are there any interesting events coming up soon?",
            "What events are on the calendar for the next few weeks?",
            "Is there anything special happening in the near future?",
            "Can you tell me about any upcoming events or activities?",
            "What's on the schedule for the next couple of weeks?",
            "Are there any upcoming events that I should be aware of?",
            "Can you give me some information about events that are planned for the future?",
            "What events do you have planned in the upcoming weeks?",
            "Is there anything exciting happening soon that I don't want to miss?"
        )
    }
}

class Personname : EnumEntity(speechRecPhrases = true) {
    override fun getEnum(lang: Language): List<String> {
        return listOf(
            "Helen Hastie:helen hastie,professor helen hastie,hastie,halen,helen,miss helen,miss hastie,u k r i,ukri,t a s,trustworthy autonomous systems",
            "Yvan Petillot:yvan petillot,proffesor yvan petillot,uvan petillot,proffessor petilot,director of the institute for sensor signals and systems,director of the institute for sensor signals,director of sensor signals",
            "Oliver Lemon:oliver lemon,mister lemon,mister oliver",
            "Lynne Baillie:human robot interaction,lynne baillie,miss lynne,miss lin,miss bailey",
            "Duncan Hand:applied photonics,director of the medical device manufacturing centre,multi modal medical device manufacturing",
            "Sethu Vijayakumar:vijayakumar,sethu vijayakumar,mister sethu",
            "Nick Taylor:nick taylor,taylor,nick",
            "Mauro Dragone:mauro dragone, mister dragone, proffesor dragone",
            "Christian Dondrup:donrup,christian dondrup,professor christian dondrup",
            "Mustafa Suphi:mustafa suphi",
            "Patricia  A Vargas:patricia  a vargas, patricia",
            "Wei Pang:wei pang,pang,professor wei pang",
            "Carlos Mastalli:carlos mastalli",
            "Michael Lones:michael lones",
            "Mustafa Suphi Erden:mustafa suphi erden",
            "Fernando Auat Cheein:fernando auat cheein,fernando auat,auat fernando",
            "Alistair McConnell:alistair mc connel",
            "Nick Taylor:nick taylor,nick",
            "Subramanian Ramamoorthy:subramanian ramamoorthy",
            "Stewart Miller:stewart miller,national robotarium,robotarium,national laboratory"

        )
    }
}
class ProjectNameIntent(val Pname: Personname? = null) : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Who is the in charge of @Pname",
            "Who is @Pname",
            "who is the @Pname",
            "who is the director of @Pname",
            "how to meet @Pname",
            "Who is leading the @Pname",
            "head of @Pname",
            "who is the ceo of @Pname",
            "Whom should I contact to get more info about @Pname",
            "Whom should I contact to get more information about @Pname"
        )
    }
}



class AnswerOption : EnumEntity {

    var correct: Boolean = false

    // Every entity and intent needs an empty constructor.
    constructor() {
    }

    // Since we are overwriting the value, we need to use this custom constructor
    constructor(correct: Boolean, value: String) {
        this.correct = correct
        this.value = value
    }

    override fun getEnumItems(lang: Language): List<EnumItem> {
        return QuestionSet.current.options;
    }
}

class RequestRepeatQuestion : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "what was the question",
            "can you repeat the question",
            "what was the question again",
            "can you please repeat the question"
        )
    }
}

class RequestRepeatOptions : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "what are the options",
            "can you repeat the options",
            "what was the options"
        )
    }
}

class DontKnow : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "I don't know",
            "don't know",
            "no idea",
            "I have no idea"
        )
    }
}

class NotInterested : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "no i dont want",
            "no im not",
            "im not interested",
            "maybe later",
            "no I'm not interested"
        )
    }
}

class Wifi() : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("wifi", "internet", "I need to connect to the wifi", "Can I connect to the internet?" ,"I need internet connexion to check my emails?", "I don't have internet on my phone", "I need wifi to get the Q R code", "I need to connect to the wifi", "I need Wi-Fi to check my emails", "I need Wi-Fi to get the key")
    }
}

class AllRight() : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("it's all right", "it's okay", "I am just typing my name", "I am looking for the email" ,"I am slow", "I am entering my details", "I found the options", "I am good", "I am typing", "I am almost done", "Let me check", "I will check", "I need to check my emails", "I will check my emails", "hold on a second", "I am checking", "I need to check", "fine")
    }
}

class Cafe() : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("cafe", "tea", "I need a coffee", "Do you have a restaurant?", "Do you have a cafe?", "Where is the closest cafe?", "Which way is the cafe?", "is there a cafe in the building?")
    }
}

class Toilet() : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf("Loo","Bathroom", "toilet", "Where is the closest bathroom?", "Which way is the toilet?", "Do you have a toilet?", "Where is the closest toilet?", "Which way is the showers?", "is there a bathroom around here?", "yes I need the way to the" )
    }
}

class playgame : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("can we play a game","I am bored","Do you have any games","can we play something i dont have anything to do","play a game maybe","can you ask me some questions","can you give another question","can you ask another question","question please","ask another question","another question","quest","can you ask another fact")}}

class Appreciate : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Appreciate","Cheers mate","Wow that is interesting","Wow that's really good Murphy","that's a fun fact","cool","that was awesome","interesting","i love you","love","lovely","amazing")}}

class MyName : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Loo","Bathroom", "toilet", "Where is the closest bathroom?", "Which way is the toilet?", "Do you have a toilet?", "Where is the closest toilet?", "Which way is the showers?", "is there a bathroom around here?", "yes I need the way to the" )
    }
}

class Alright : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("alright","Fine","ok","good","fine","its ok","no worries","no issues","cheers")}}

class DateTime : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "What day is today?",
            "Tell me the date today",
            "date",
            "time",
            "what time",
            "what date",
            "what is the time now",
            "whats is todays date")
    }
}

class Weather : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "could you tell me what is today's temperature",
            "What is todays weather",
            "weather",
            "can i know the weather",
            "is it too rainy",
            "raining outside",
            "forecast",
            "isnt it too cold aint it",
            "drizzly",
            "is it sunny",
            "windy",
            "foggy",
            "can you tell me what is the temperature here"

        )
}}

class GoodBye : Intent(){
    override fun getExamples(lang: Language): List<String> {
        return listOf("Thank you for your time","Goodbye","bye","cya","see you")}}

