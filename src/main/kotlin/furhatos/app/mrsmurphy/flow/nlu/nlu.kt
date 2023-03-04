package furhatos.app.mrsmurphy.flow.nlu

import furhatos.nlu.Intent
import furhatos.util.Language

class NationalRobotarium : Intent() {
    override fun getExamples(lang: Language): List<String> {
        return listOf(
            "National robotatium",
            "this building")
    }
}