package furhatos.app.mrsmurphy.flow.main


import com.theokanning.openai.service.OpenAiService
import com.theokanning.openai.completion.CompletionRequest
import furhatos.flow.kotlin.*


val serviceKey = ""

fun getNLGResponseFromGPT(input: String, histval: Int = 10): String {

    val service = OpenAiService(serviceKey)
    val history = Furhat.dialogHistory.all.takeLast(histval).mapNotNull {
        when (it) {
            is DialogHistory.ResponseItem -> {
                "Visitor: ${it.response.text}"
            }
            is DialogHistory.UtteranceItem -> {
                "Murphy: ${it.toText()}"
            }
            else -> null
        }
    }.joinToString(separator = "\n")


    //Formal prompt
/*
    var conversationInput= "The following is a conversation with an AI assistant. The assistants name is Murphy who is serious and informative. Murphy works as a receptionist in a building called the National Robotarium. Murphy has to talk to Visitor.Murphy has to talk to Visitor.If the Visitor ask only then give additional information.\n"
    if (input.trim().isNotEmpty()) {
        conversationInput += "Here are some additional information which may be used if required :\n"
        conversationInput += input
    }
    conversationInput+= "\n Here are the past conversations between Murphy and Visitor :\n"
    conversationInput+=history
    conversationInput+="\n Murphy should now produce a formal response. Response should be no longer than 3 sentences and murphy is not required to greet Visitor and murphy should try to summarise whatever it says.Dont try to repeat what was told in previous conversations. Also if the question is asked out of the context, Murphy should ask the user to confirm the visitor's question which is most related to the information given above in a very formal way. Do not attempt to fabricate or hallucinate any answers. Murphy: ?"
*/


    //Informal prompt
    var conversationInput= "The following is a conversation with an AI assistant. The assistants name is Murphy who is helpful, creative, clever, and very friendly. Murphy works as a receptionist in a building called the National Robotarium. Murphy has to talk to Visitor.If the Visitor ask only then give additional information.\n"
    if (input.trim().isNotEmpty()) {
        conversationInput += "Here are some additional information which may be used if required :\n"
        conversationInput += input
    }
    conversationInput+= "\n Here are the past conversations between Murphy and Visitor :\n"
    conversationInput+=history
    conversationInput+="\n Murphy should now produce a casual and engaging response with appropriate gestures of format \":gesture:\". The gestures can be added to appropriate places between or in the end. Response should be no longer than 3 sentences and murphy is not required to greet Visitor the response must be short and concise as possible omitting unwanted information . Also if the question is asked out of the context, Murphy should ask the user to confirm the visitor's question which is most related to the information given above in an informal way with gestures. Do not attempt to fabricate or hallucinate any answers. Murphy: ?"


    var response = ""
    val lengthofprompt = conversationInput.length
    // Read more about these settings: https://beta.openai.com/docs/introduction
    var temperature = 0.7 // Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.
    var maxTokens =  100// Length of output generated. 1 token is on average ~4 characters or 0.75 words for English text
    var topP = 0.6 // 1.0 is default. An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.
    var frequencyPenalty = 0.0 // Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.
    var presencePenalty = 0.3 // Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.
    val completionRequest = CompletionRequest.builder()
        .model("text-davinci-003")
        .temperature(temperature)
        .topP(topP)
        .frequencyPenalty(frequencyPenalty)
        .presencePenalty(presencePenalty)
        .maxTokens(maxTokens)
        .prompt(conversationInput)
        .echo(true)
        .build();


    try {
        val completion = service.createCompletion(completionRequest).choices.first().text
        response = completion.trim()

    } catch (e: Exception) {
        println("Problem with connection to OpenAI" + e.message)
        response="Unfortunately I am unable to connect to OpenAI services.Can you please repeat the question again?"
        return response
    }
    //println(response)
//    println("-------------------------------------------------")
//    println(response)
    return response.drop(lengthofprompt)
}


