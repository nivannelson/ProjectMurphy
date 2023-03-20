package furhatos.app.mrsmurphy.flow.main

import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.state

fun whatCanIDo(firstTime: Boolean = false) : State = state {
    onEntry {
        if (firstTime) {
            random(
                { furhat.say("My name is Murphy. I am a receptionist here at the National Robotarium.") },
                { furhat.say("I'm Murphy, and I work as a receptionist here at the National Robotarium.") }
            )
            random(
                { furhat.say("I'm happy to provide you with information about the building and current research and news on robotics.") },
                { furhat.say("I'm here to give you a detailed overview of the building and the advancements in robotics happening here.") },
                { furhat.say("I'm happy to talk about the building and the latest developments in robotics that are taking place here.") },
                { furhat.say("I'm available to discuss the building, share exciting updates, and chat about robotics.") }
            )
        }
        else {
            random(
                {
                    furhat.say(
                        "I can tell you all about the building, " +
                                "share few exciting news and researches happening here, " +
                                "and even give you a general talk about robotics."
                    )
                },
                {
                    furhat.say(
                        "I can provide you with information about " +
                                "the facilities at National Robotarium, updates on exciting " +
                                "research projects taking place here, and " +
                                "even offer a brief overview of robotics in general."
                    )
                }
            )
        }

        terminate()
    }
}