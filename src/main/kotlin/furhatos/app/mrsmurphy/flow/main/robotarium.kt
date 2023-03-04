package furhatos.app.mrsmurphy.flow.main

import furhatos.app.mrsmurphy.flow.Parent
import furhatos.app.mrsmurphy.flow.nlu.NationalRobotarium
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Robotarium: State = state(Parent) {
    onResponse<NationalRobotarium> {

    }
}

