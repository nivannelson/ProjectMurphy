import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat

import furhatos.gestures.Gestures
import furhatos.gestures.ARKitParams
import furhatos.gestures.BasicParams
import furhatos.gestures.defineGesture

val thinker = defineGesture("thinker") {
    frame(0.32, 1.72) {
        ARKitParams.BROW_OUTER_UP_LEFT to 1
    }
    frame(0.2, 1.72){
        ARKitParams.EYE_LOOK_OUT_LEFT to .3
//        ARKitParams.EYE_LOOK_OUT_RIGHT to -5.0
        ARKitParams.MOUTH_UPPER_UP_LEFT
        BasicParams.NECK_TILT to -10
        BasicParams.NECK_PAN to -10

    }
    frame(0.16, 0.72){
//        ARKitParams.EYE_LOOK_OUT_LEFT to .1
        BasicParams.NECK_TILT to -.1
        ARKitParams.BROW_OUTER_UP_LEFT to .1
    }
    reset(2.0)
}
val thumbsdown = defineGesture("thumbsdown") {
    frame(0.1, 1.5) {
        BasicParams.NECK_TILT to 1
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.7
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.7
    }
    frame(0.8, 1.2) {
        BasicParams.NECK_PAN to 10
    }
    frame(1.2, 1.6) {
        BasicParams.NECK_PAN to -10
    }
    frame(1.6, 2.0) {
        BasicParams.NECK_PAN to 0
    }
    frame(2.0, 2.4) {
        BasicParams.NECK_TILT to 0
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.2
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.2

    }
    reset(2.4)
}
val thumbsup = defineGesture("thumbsup") {
    frame(0.1, 1.5) {
        BasicParams.NECK_TILT to 10
        ARKitParams.BROW_OUTER_UP_LEFT to 0.7
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.7
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.7
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.7
    }
    frame(1.0, 1.5) {
        BasicParams.NECK_TILT to 0
    }
    frame(1.5, 2.0) {
        BasicParams.NECK_TILT to 5
        ARKitParams.BROW_OUTER_UP_LEFT to 0.5
        ARKitParams.BROW_OUTER_UP_RIGHT to 0.5
        ARKitParams.EYE_LOOK_DOWN_LEFT to 0.2
        ARKitParams.EYE_LOOK_DOWN_RIGHT to 0.2

    }
    reset(2.0)
}
fun textgesture(code: String): State = state {
    onEntry {
        when (code) {
            ":angry:" -> {println("angry")
                furhat.gesture(Gestures.ExpressSad)}

            ":broken_heart:" -> {println("broken_heart")
                furhat.gesture(Gestures.ExpressSad)}

            ":confused:" -> {println("confused")
                furhat.gesture(thinker)}
            ":cry:" -> {println("cry")
                furhat.gesture(Gestures.ExpressSad)}

            ":disappointed:" -> {println("disappointed")
                furhat.gesture(Gestures.ExpressSad)}

            ":expressionless:" -> {println("expressionless")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":fearful:" -> {println("fearful")
                furhat.gesture(Gestures.ExpressFear)}
            ":flushed:" -> {println("flushed")
                furhat.gesture(Gestures.BrowRaise)
                furhat.gesture(Gestures.Surprise)}

            ":heart_eyes:" -> {println("heart_eyes")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":heart:" -> {println("heart")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":hug:" -> {println("hug")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":hugging:" -> {println("hugging")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":innocent:" -> {println("innocent")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":joy:" -> {println("joy")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":kissing_heart:" -> {println("kissing_heart")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":laughing:" -> {println("laughing")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}

            ":no_mouth:" -> {println("no_mouth")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":nerd_face:" -> {println("nerd_face")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}


            ":open_mouth:" -> {println("open_mouth")
                furhat.gesture(Gestures.Oh)}

            ":persevere:" -> {println("persevere")
                furhat.gesture(Gestures.ExpressSad)}
            ":point_up:"-> {println("point_up")
                furhat.gesture(thumbsup)}
            ":raised_eyebrow:" -> {println("raised eyebrow")
                furhat.gesture(Gestures.BrowRaise)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":robot:" -> {println("robot")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":robot_head:" -> {println("robot_head")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":sad:" -> {println("sad")
                furhat.gesture(thumbsdown)}
            ":sadface:" -> {println("sadface")
                furhat.gesture(thumbsdown)}
            ":stuck_out_tongue:" -> {println("stuck_out_tongue")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":sunglasses:" -> {println("sunglasses")
                furhat.gesture(Gestures.BigSmile(0.5))}
            ":stuck_out_tongue_winking_eye:" -> {println("stuck_out_tongue_winking_eye")
                furhat.gesture(Gestures.Wink)
                furhat.gesture(Gestures.BigSmile(0.5))}
            ":smile:" -> {println("Smile")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":sweat:" -> {println("sweat")
                furhat.gesture(Gestures.Nod(0.5))}
            ":sweat_smile:" -> {println("sweat_smile")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":slight_smile:" -> {println("slight_smile")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile (0.5,2.0))}
            ":smiley:" -> {println("Smile")
                furhat.gesture(Gestures.Smile)
                furhat.gesture(Gestures.BigSmile(0.5,2.0))}

            ":thoughtful:" -> {println("thoughtful")
                furhat.gesture(thinker)
            }
            ":thinking:" -> {println("thinking")
                furhat.gesture(thinker)
            }
            ":thumbsup:"-> {println("thumbs_up")
                furhat.gesture(thumbsup)}
            ":thumbs_up:"-> {println("thumbs_up")
                furhat.gesture(thumbsup)}
            ":thumbsdown:"-> {println("thumbsdown")
                furhat.gesture(thumbsdown)}
            ":thumbs_down:"-> {println("thumbs_down")
                furhat.gesture(thumbsdown)}
            ":thinking_face:"-> {println("thinking_face")
                furhat.gesture(Gestures.BrowRaise)
                furhat.gesture(Gestures.Thoughtful)}

            ":wink:" -> {println("wink")
                furhat.gesture(Gestures.Wink)}
            ":wave:" -> {println("wink")
                furhat.gesture(Gestures.Wink)}
            else ->{print("not in gesture list")
                furhat.gesture(Gestures.Nod(0.1))}
        }
        print("gesture is called")
        terminate()
    }
}


fun theparser(response: String): State = state {
    onEntry {
        // println("inupe value to the funtion:"+response)
        val rmv = Regex("Murphy:|Gesture:")
        val regex = Regex(":\\w+:")
        val response=  response.replace(rmv, "   ^")
        val emojis = regex.findAll(response).map { it.value }.toList()
        // println("full list of emojis found"+emojis)
        val response2=  response.replace(regex, "   ^")

        val splitResponse = response2.split("^")
        var res = 0
        if (splitResponse[res].trim().isNotEmpty()) {
            furhat.say(splitResponse[res].trim())
        }
        for (emo in emojis) {
            if(emo.isNotEmpty()){
                val code = emo
                call(textgesture(code))
            }
            res+=1
            if (splitResponse[res].trim().isNotEmpty()) {
                furhat.say(splitResponse[res].trim())
            }
        }
        terminate()
    }
}