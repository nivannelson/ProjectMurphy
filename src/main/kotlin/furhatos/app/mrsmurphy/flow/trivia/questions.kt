package furhatos.app.mrsmurphy.flow.trivia

import furhatos.app.mrsmurphy.flow.nlu.AnswerOption
import furhatos.nlu.EnumItem
import furhatos.nlu.TextBuilder
import java.util.*


var count : Int = 0

object QuestionSet {

    var current: Question = questionsEnglish[Random().nextInt(questionsEnglish.lastIndex)]
    init {
        questionsEnglish.shuffle()

    }

    fun next() {
        count++
        if (count >= questionsEnglish.size)
            count = 0
        current = questionsEnglish[count]
        AnswerOption().forget()
    }

}

/**
 * The question class gets the following parameters:
 * @text : The question as a String
 * @answer : A list containing the correct answer to the question, followed by alternative pronunciations of the correct answer
 * @alternatives A list, containing lists of other (wrong) answers. Every other answer is also followed by alternative pronunciations of the correct answer.
 */
class Question(val text: String,val desc:String, answer: List<String>, alternatives: List<List<String>>) {
    //All options, used to prime the NLU
    var options : MutableList<EnumItem> = mutableListOf()
    var answerlist : MutableList<EnumItem> = mutableListOf()
    //Only the first option of the answers, these are correctly spelled, and not alternative.
    var primeoptions : MutableList<EnumItem> = mutableListOf()

    //init loads the first item of the list into primeoptions
    //And loads everything into options
    init {
        primeoptions.add(EnumItem(AnswerOption(true, answer.first()), answer.first()))
        answer.forEach {
            options.add(EnumItem(AnswerOption(true, it), it))
            answerlist.add(EnumItem(AnswerOption(true, it), it))
        }

        alternatives.forEach {
            primeoptions.add(EnumItem(AnswerOption(false, it.first()), it.first()))
            it.forEach {
                options.add(EnumItem(AnswerOption(false, it), it))
            }
        }

        options.shuffle()
        primeoptions.shuffle()
    }

    //Returns the well formatted answer options
    fun getOptionsString() : String {
        var text = TextBuilder()
        text.appendList(primeoptions.map { it.wordString }, "or")
        return text.toString()
    }
    fun makeans() : String {
        var text = TextBuilder()
        text.appendList(answerlist.map { it.wordString }, " - ")
        var realans= text.toString().split(" - ")

        return realans[0]
    }

    //Returns the well formatted answer options
    val speechPhrases : List<String>
        get() = primeoptions.map { it.wordString ?: "" }

}