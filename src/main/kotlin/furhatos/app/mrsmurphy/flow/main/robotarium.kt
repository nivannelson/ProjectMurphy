package furhatos.app.mrsmurphy.flow.main

import ReadFile
import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.*
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Robotarium: State = state(Parent) {
    onEntry { furhat.listen() }
    onResponse<NationalRobotarium> {
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<AboutMurphy>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(response)
    }

    onResponse<Researches>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<WhatsNew>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<HeathCare>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<Manufacturing>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<Offshore>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<Agriculture>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<ConversationalAgents>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var response = ReadFile().getResponse(intent, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }

    onResponse<PersonInCharge>(){
        var intent = ((it.intent).toString()).dropLast(2)
        var key = intent + " - ${it.intent.project}"
        var response = ReadFile().getResponse(key, "")
        furhat.ask(getNLGResponseFromGPT(response))
    }
}

