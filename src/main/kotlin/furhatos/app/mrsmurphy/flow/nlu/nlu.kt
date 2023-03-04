package furhatos.app.mrsmurphy.flow.nlu

import furhatos.nlu.EnumEntity
import furhatos.nlu.Intent
import furhatos.nlu.common.Number
import furhatos.nlu.wikidata.City
import furhatos.util.Language

class NationalRobotarium : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "National Robotarium",
            "Robotarium",
            "what is National robotarium?",
            "what is this building?",
            "where am I?",
            "can you talk about this building?",
            "can you talk about this robotarium?",
            "can you talk about this National robotarium?",
            "Explain the brief history of this building",
            "Explain the brief history of National robotarium",
            "Explain the brief history of robotarium",
            "What do you know about this building?",
            "What do you know about National robotarium?",
            "What do you know about robotarium?"
            )
    }
}

class AboutMurphy : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Who are you?",
            "what can you do?",
            "Why are you here?",
            "can you talk about yourself?",
            "Whats your purpose?",
            "talk about you!",
            "Explain yourself"

        )
    }
}
class Researches : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Researches",
            "Research",
            "can you list the researches going on here?",
            "Ongoing researches?",
            "Can you tell me about the Ongoing researches?",
            "what you Know about the Ongoing researches in this building?",
            "Can you tell me about the current researches in this building?",
            "Can you tell me about the current researches in National robotarium?",
            "What are the researches going on the robotarium?",
            "Major researches in the National Robotarium"

        )
    }
}
class WhatsNew : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "I was wondering if you could tell me about the latest news from the National robotarium?",
            "Hello,I was wondering if you could tell me about the latest news from this building?",
            "could you tell me about the latest news from the National robotarium?",
            "any recent news?",
            "any recent update about robotarium?",
            "any interesting updates about the robortarium",
            "any recent updates about this building?",
            "whats latest updates in here?"

        )
    }
}
class HeathCare : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Healthcare",
            "Whats happening in the healthcare project",
            "Whats happening in the healthcare research?",
            "could you tell me about the healthcare research?",
            "could you tell me about the healthcare research?",
            "Researches in healthcare?"
            )
    }
}
class Manufacturing : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Manufacturing",
            "Whats happening in the Manufacturing project",
            "Whats happening in the Manufacturing research?",
            "could you tell me about the Manufacturing research?",
            "could you tell me about the Manufacturing research?",
            "Researches in Manufacturing?"
        )
    }
}

class Offshore : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Offshore",
            "Whats happening in the Offshore project",
            "Whats happening in the Offshore research?",
            "could you tell me about the Offshore research?",
            "could you tell me about the Offshore research?",
            "Researches in Offshore?"
        )
    }
}

class Agriculture : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Agriculture",
            "Whats happening in the Agriculture project",
            "Whats happening in the Agriculture research?",
            "could you tell me about the Agriculture research?",
            "could you tell me about the Agriculture research?",
            "Researches in Agriculture?"
        )
    }
}

class ConversationalAgents : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "Conversational Agents",
            "Whats happening in the Conversational Agents project",
            "Whats happening in the Conversational Agents research?",
            "could you tell me about the Conversational Agents research?",
            "could you tell me about the Conversational Agents research?",
            "Researches in Conversational Agents?"
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
        return listOf("@ProjectName",
            "Who is the in-charge of @ProjectName?",
            "Who is leading the @ProjectName?",
            "heed of @ProjectName?",
            "Whom should I contact to get more info about @ProjectName?",
            "Whom should I contact to get more information about @ProjectName?"
            )
    }

}
