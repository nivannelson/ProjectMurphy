package furhatos.app.mrsmurphy.flow

import furhatos.app.mrsmurphy.flow.main.Idle
import furhatos.app.mrsmurphy.flow.main.Greeting
import furhatos.app.mrsmurphy.flow.main.Robotarium
import furhatos.app.mrsmurphy.setting.DISTANCE_TO_ENGAGE
import furhatos.app.mrsmurphy.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users

val Init: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        when {
            furhat.isVirtual() -> goto(Robotarium) // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(Robotarium)
            }
            else -> goto(Idle)
        }
    }

}
