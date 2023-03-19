package furhatos.app.mrsmurphy.flow

import furhatos.app.mrsmurphy.flow.main.Idle
import furhatos.app.mrsmurphy.flow.main.Robotarium
import furhatos.app.mrsmurphy.setting.DISTANCE_TO_ENGAGE
import furhatos.app.mrsmurphy.setting.MAX_NUMBER_OF_USERS
import furhatos.flow.kotlin.*

val Init: State = state {
    init {
        /** Set our default interaction parameters */
        users.setSimpleEngagementPolicy(DISTANCE_TO_ENGAGE, MAX_NUMBER_OF_USERS)
    }
    onEntry {
        /** start interaction */
        dialogLogger.startSession(cloudToken = "5e64b713-486d-491d-8689-b2dbe49b8434")
        when {
            furhat.isVirtual() -> goto(Robotarium) // Convenient to bypass the need for user when running Virtual Furhat
            users.hasAny() -> {
                furhat.attend(users.random)
                goto(Robotarium)
            }
            else -> goto(Idle)
        }
        dialogLogger.endSession()
    }

}
