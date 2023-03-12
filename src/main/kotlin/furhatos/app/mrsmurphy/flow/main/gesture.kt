import furhatos.flow.kotlin.furhat
import furhatos.gestures.Gestures

fun gesture(code: String){
    when (code) {
        "[B@6996db8" -> furhat.gesture(Gestures.BigSmile)
        "[B@1963006a" -> furhat.gesture(Gestures.Blink)
        "[B@7fbe847c" -> furhat.gesture(Gestures.BrowFrown)
        "[B@41975e01" -> furhat.gesture(Gestures.BrowRaise)
        "[B@c2e1f26" -> furhat.gesture(Gestures.CloseEyes) //remove it later or open the eyes
        "[B@dcf3e99" -> furhat.gesture(Gestures.ExpressAnger)
        "[B@7dc5e7b4" -> furhat.gesture(Gestures.ExpressDisgust)
        "[B@1ee0005" -> furhat.gesture(Gestures.ExpressFear)
        "[B@75a1cd57" -> furhat.gesture(Gestures.ExpressSad)
        "[B@6f2b958e" -> furhat.gesture(Gestures.OpenEyes)
        "[B@626b2d4a" -> furhat.gesture(Gestures.Thoughtful)
        "[B@1c4af82c" -> furhat.gesture(Gestures.Wink)
        else -> { // Note the block
            return
        }
    }
}

fun parseResponse(response: String){
    val regex = Regex("((?<=;)|(?=;))")
    val emojiRegex = Regex("[\\p{So}]")
    val unicode = StringBuilder()

    val response2 = response.replace(emojiRegex, ";")
    val splitResponse = response2.split(regex)
    val emojis = emojiRegex.findAll(response).map { it.value }.toList()
    var numEmo = 0
    for (res in splitResponse) {
        if(res != null && res != ""){
            if(res.equals(";")){
                val byteArry = ((emojis[numEmo]).toByteArray())
                println(((emojis[numEmo]).toByteArray()))
                println(emojis[numEmo])
                numEmo++
            }
            else{
                furhat.say(res)
            }
        }
    }
}