import furhatos.flow.kotlin.*
import furhatos.flow.kotlin.furhat

import furhatos.gestures.Gestures


fun textgesture(code: String): State = state {
    onEntry {
        when (code) {
            ":smiley:" -> {println("Smile")
            furhat.gesture(Gestures.Nod)}
             ":thumbsup:"-> {println("Happy")
                 furhat.gesture(Gestures.Nod)}
            ":smile:" -> {println("Smile")
                furhat.gesture(Gestures.Nod)}
                ":heart:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":broken_heart:" -> {println("Smile")
            furhat.gesture(Gestures.Nod)}

                ":joy:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}

                ":smiley:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":slight_smile:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":sweat_smile:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":laughing:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":wink:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":sweat:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":kissing_heart:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":stuck_out_tongue_winking_eye:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":disappointed:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":angry:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":cry:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":persevere:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":fearful:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":flushed:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":dizzy_face:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":ok_woman:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":innocent:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":sunglasses:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":expressionless:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":confused:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":stuck_out_tongue:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":open_mouth:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}
                ":no_mouth:" -> {println("Smile")
                    furhat.gesture(Gestures.Nod)}

            else -> "Invalid day."
        }
        print("gesture is called")
        terminate()
        }

    }

fun theparser(response: String): State = state {
    onEntry {
        println("inupe value to the funtion"+response)
        val regex = Regex(":\\w+:")
        val emojis = regex.findAll(response).map { it.value }.toList()
        val response2=  response.replace(regex, "   ^")


        println("the 2 respont ="+response2)
        val splitResponse = response2.split("^")
        var numEmo = 0
        for (res in splitResponse) {
            if(numEmo<emojis.size){
                val code = emojis[numEmo]
                println("code is :"+code)
                call(textgesture(code))
                numEmo++}
            furhat.say(res)



        }
        terminate()
    }

}



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
        println("the 2 respont ="+response2)
        val splitResponse = response2.split(";")
        println("the 2 respont ="+splitResponse[0])
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

}

