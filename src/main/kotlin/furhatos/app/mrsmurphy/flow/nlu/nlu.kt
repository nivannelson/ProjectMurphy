package furhatos.app.mrsmurphy.flow.nlu

import furhatos.app.mrsmurphy.flow.trivia.QuestionSet
import furhatos.nlu.EnumEntity
import furhatos.nlu.EnumItem
import furhatos.nlu.Intent
import furhatos.nlu.common.Number
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
            "where am I",
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
            "okay Murphy can you give me an explanation about this building"
            )
    }
}

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
            "Sure why not",
            "i am interested",
            "tell me facts",
            "nice I want to know it",
            " yeah sure ask away"

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
            "any interesting updates about the robortarium",
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
            "Researches in healthcare"
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
            "Whats happening in the Conversational Agents project",
            "Whats happening in the Conversational Agents research",
            "could you tell me about the Conversational Agents research",
            "could you tell me about the Conversational Agents research",
            "Researches in Conversational Agents"
        )
    }
}

class ProjectName : EnumEntity(){
    override fun getEnum(lang: Language): List<String> {
        return listOf("HeathCare","Manufacturing","offshore","Agriculture","Conversational Agents")
    }
}

class PersonInCharge(
    val project: String? = null) : Intent() {

    override fun getExamples(lang: Language): List<String> {
        return listOf("ProjectName",
            "Who is the in-charge of ProjectName",
            "Who is leading the ProjectName",
            "heed of ProjectName",
            "Whom should I contact to get more info about ProjectName",
            "Whom should I contact to get more information about ProjectName"
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
            "what was the question again"
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