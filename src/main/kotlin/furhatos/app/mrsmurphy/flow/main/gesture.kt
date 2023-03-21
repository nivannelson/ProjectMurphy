import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat

import furhatos.gestures.Gestures


fun textgesture(code: String): State = state {
    onEntry {
        when (code) {
            ":angry:" -> {println("angry")
                furhat.gesture(Gestures.ExpressSad)}
            ":broken_heart:" -> {println("broken_heart")
                furhat.gesture(Gestures.ExpressSad)}
            ":confused:" -> {println("confused")
                furhat.gesture(Gestures.Thoughtful)}
            ":cry:" -> {println("cry")
                furhat.gesture(Gestures.ExpressSad)}
            ":disappointed:" -> {println("disappointed")
                furhat.gesture(Gestures.ExpressSad)}
            ":expressionless:" -> {println("expressionless")
                furhat.gesture(Gestures.Smile)}
            ":fearful:" -> {println("fearful")
                furhat.gesture(Gestures.ExpressFear)}
            ":flushed:" -> {println("flushed")
                furhat.gesture(Gestures.BrowRaise)
                furhat.gesture(Gestures.Surprise)}
            ":heart_eyes:" -> {println("heart_eyes")
                furhat.gesture(Gestures.BigSmile)}
            ":heart:" -> {println("heart")
                furhat.gesture(Gestures.BigSmile)}
            ":innocent:" -> {println("innocent")
                furhat.gesture(Gestures.BigSmile)}
            ":joy:" -> {println("joy")
                furhat.gesture(Gestures.BigSmile)}
            ":kissing_heart:" -> {println("kissing_heart")
                furhat.gesture(Gestures.BigSmile)}
            ":laughing:" -> {println("laughing")
                furhat.gesture(Gestures.BigSmile)}
            ":no_mouth:" -> {println("no_mouth")
                furhat.gesture(Gestures.Smile)}
            ":nerd_face:" -> {println("nerd_face")
                furhat.gesture(Gestures.Smile)}
            ":ok_woman:" -> {println("ok_woman")
                furhat.gesture(Gestures.Nod)}
            ":open_mouth:" -> {println("open_mouth")
                furhat.gesture(Gestures.Oh)}
            ":persevere:" -> {println("persevere")
                furhat.gesture(Gestures.ExpressSad)}
            ":robot:" -> {println("robot")
                furhat.gesture(Gestures.Smile)}
            ":robot_head:" -> {println("robot_head")
                furhat.gesture(Gestures.Smile)}
            ":stuck_out_tongue:" -> {println("stuck_out_tongue")
                furhat.gesture(Gestures.Smile)}
            ":sunglasses:" -> {println("sunglasses")
                furhat.gesture(Gestures.BigSmile)}
            ":stuck_out_tongue_winking_eye:" -> {println("stuck_out_tongue_winking_eye")
                furhat.gesture(Gestures.Wink)
                furhat.gesture(Gestures.BigSmile)}
            ":smile:" -> {println("Smile")
                furhat.gesture(Gestures.BigSmile)}
            ":sweat:" -> {println("sweat")
                furhat.gesture(Gestures.Nod)}
            ":sweat_smile:" -> {println("sweat_smile")
                furhat.gesture(Gestures.BigSmile)}
            ":slight_smile:" -> {println("slight_smile")
                furhat.gesture(Gestures.BigSmile)}
            ":smiley:" -> {println("Smile")
                furhat.gesture(Gestures.BigSmile)}
            ":thoughtful:" -> {println("thoughtful")
                furhat.gesture(Gestures.Thoughtful)}
            ":thumbs_up:"-> {println("thumbs_up")
                furhat.gesture(Gestures.Nod)}
            ":thumbs_down:"-> {println("thumbs_down")
                furhat.gesture(Gestures.Shake)}
            ":thinking_face:"-> {println("thinking_face")
                furhat.gesture(Gestures.Thoughtful)}
            ":wink:" -> {println("wink")
                furhat.gesture(Gestures.Wink)}
            else ->{print("not in gesture list")
                furhat.gesture(Gestures.Nod)}
        }
        print("gesture is called")
        terminate()
    }
}


fun theparser(response: String): State = state {
    onEntry {
//        println("inupe value to the funtion:"+response)
        val remov = Regex("Murphy:|Gesture:")
        val regex = Regex(":\\w+:")
        val response=  response.replace(remov, "   ^")
        val emojis = regex.findAll(response).map { it.value }.toList()
        val response2=  response.replace(regex, "   ^")


//        println("the 2 respont ="+response2)
        val splitResponse = response2.split("^")
        var numEmo = 0
        for (res in splitResponse) {
            if (res.isNotEmpty()) {
                furhat.say(res)
            }
            if(numEmo<emojis.size){
                val code = emojis[numEmo]
                call(textgesture(code))
                numEmo++
            }
        }
        terminate()
    }
}
/*
fun gesture(code: String): State = state {
    onEntry {
        if((code == "[B@6996db8")){
                println("Smile")
                furhat.gesture(Gestures.BigSmile)
            }
        else if((code == "[B@1963006a")){
            println("Brinkl")
                furhat.gesture(Gestures.Blink)
            }
        else if((code == "[B@7fbe847c")){
            println("Frown")
                furhat.gesture(Gestures.BrowFrown)
            }
        else if((code == "[B@41975e01")){
            println("Browraise")
                furhat.gesture(Gestures.BrowRaise)
            }
        else if((code == "[B@c2e1f26")){
            println("Closeeyes")
                furhat.gesture(Gestures.CloseEyes) //remove it later or open the eyes
            }
        else if((code == "[B@dcf3e99")){
            println("ExpressAngr")
                furhat.gesture(Gestures.ExpressAnger)
            }
        else if((code == "[B@7dc5e7b4")){
            println("Disgust")
                furhat.gesture(Gestures.ExpressDisgust)
            }
        else if((code == "[B@1ee0005")){
            println("ExpressFear")
                furhat.gesture(Gestures.ExpressFear)
            }
        else if((code == "[B@75a1cd57")){
            println("Sad")
                furhat.gesture(Gestures.ExpressSad)
            }
        else if((code == "[B@6f2b958e")){
            println("OpenEyes")
                furhat.gesture(Gestures.OpenEyes)
            }
        else if((code == "[B@626b2d4a")){
            println("Thoughful")
                furhat.gesture(Gestures.Thoughtful)
            }
        else if((code == "[B@1c4af82c")){
            println("Wink")
                furhat.gesture(Gestures.Wink)
            }
        terminate()
    }

}

fun parseResponse(response: String): State = state {
    onEntry {
        println("inupe value to the funtion"+response)
        val regex = Regex("((?<=;)|(?=;))")
        val emojiRegex = Regex("[\\p{So}]")
        val unicode = StringBuilder()

        val response2 = response.replace(emojiRegex, ";")
        //println("the 2 respont ="+response2)
        val splitResponse = response2.split(";")
        //println("the 2 respont ="+splitResponse[0])
        val emojis = emojiRegex.findAll(response).map { it.value }.toList()
        var numEmo = 0
        for(res in splitResponse) {
            if (res != null && res != "") {
                if (res.equals(";")) {
                    println("Gesture if function triggered")
                    val byteArry = ((emojis[numEmo]).toByteArray())
                    gesture(byteArry.toString())
                    numEmo++
                } else {
                    println("the responce after filtering :"+res)
                    furhat.say(res)
                }
            }
            terminate()
    }
    }

}  */

