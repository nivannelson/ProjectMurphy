    package furhatos.app.mrsmurphy

import furhatos.app.mrsmurphy.flow.Init
import furhatos.flow.kotlin.Flow
import furhatos.skills.Skill

class MrsmurphySkill : Skill() {
    override fun start() {
        Flow().run(Init)
    }
}

fun main(args: Array<String>) {
    Skill.main(args)
}
