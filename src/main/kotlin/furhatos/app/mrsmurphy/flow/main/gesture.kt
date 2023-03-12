import furhatos.flow.kotlin.furhat

fun parseResponse(response: String){
    val response = "I love pizza 🍕 and I wanna have pizza now 🤤 checking now"
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