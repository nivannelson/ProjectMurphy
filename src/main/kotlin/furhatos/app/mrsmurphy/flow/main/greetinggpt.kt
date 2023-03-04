package furhatos.app.mrsmurphy.flow.main


import furhatos.app.mrsmurphy.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Greetingpt: State = state(Parent) {
    onEntry {
        furhat.ask("Should I say Hello World?")
    }

    onResponse<Yes> {
        goto(GPT)
        furhat.say("Hello World! ")
    }

    onResponse<No> {
        goto(GPT)
        furhat.ask("Ok.")
    }
    onResponse {
        goto(GPT)
        furhat.ask(" ")
    }

}
