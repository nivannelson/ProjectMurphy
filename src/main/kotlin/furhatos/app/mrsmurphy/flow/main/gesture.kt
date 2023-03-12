import furhatos.flow.kotlin.furhat
import furhatos.gestures.Gestures
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.state
import org.junit.Assert

fun gesture(code: String): State = state {
    onEntry {
        if(Assert.assertTrue(code == "[B@6996db8")
            furhat.gesture(Gestures.BigSmile)
        else if(Assert.assertTrue(code == "[B@1963006a")
            furhat.gesture(Gestures.Blink)
        else if(Assert.assertTrue(code == "[B@7fbe847c")
            furhat.gesture(Gestures.BrowFrown)
        else if(Assert.assertTrue(code == "[B@41975e01")
            furhat.gesture(Gestures.BrowRaise)
        else if(Assert.assertTrue(code == "[B@c2e1f26")
            furhat.gesture(Gestures.CloseEyes) //remove it later or open the eyes
        else if(Assert.assertTrue(code == "[B@dcf3e99")
            furhat.gesture(Gestures.ExpressAnger)
        else if(Assert.assertTrue(code == "[B@7dc5e7b4")
            furhat.gesture(Gestures.ExpressDisgust)
        else if(Assert.assertTrue(code == "[B@1ee0005")
            furhat.gesture(Gestures.ExpressFear)
        else if(Assert.assertTrue(code == "[B@75a1cd57")
            furhat.gesture(Gestures.ExpressSad)
        else if(Assert.assertTrue(code == "[B@6f2b958e")
            furhat.gesture(Gestures.OpenEyes)
        else if(Assert.assertTrue(code == "[B@626b2d4a")
            furhat.gesture(Gestures.Thoughtful)
        else if(Assert.assertTrue(code == "[B@1c4af82c")
            furhat.gesture(Gestures.Wink)
        }
    }
}

fun parseResponse(response: String): State = state {
    onEntry {
        val regex = Regex("((?<=;)|(?=;))")
        val emojiRegex = Regex("[\\p{So}]")
        val unicode = StringBuilder()

        val response2 = response.replace(emojiRegex, ";")
        val splitResponse = response2.split(regex)
        val emojis = emojiRegex.findAll(response).map { it.value }.toList()
        var numEmo = 0
        for (res in splitResponse) {
            if (res != null && res != "") {
                if (res.equals(";")) {
                    val byteArry = ((emojis[numEmo]).toByteArray())
                    gesture(byteArry)
                    numEmo++
                } else {
                    furhat.say(res)
                }
            }
        }
    }
}