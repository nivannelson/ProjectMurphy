// This file reads a csv file to get the respective response and randomize it

import java.io.BufferedReader
import java.io.FileReader
import java.nio.file.Paths

val csvMap: MutableMap<String, String> = mutableMapOf()

class ReadFile(){
    fun getResponse(intent: String, entity: String): String {
        val path = Paths.get("").toAbsolutePath().toString()
        val fileName = "$path\\src\\main\\kotlin\\furhatos\\app\\mrsmurphy\\flow\\main\\Intents.csv"
        var key = intent
        var updateKey = ""
        var answerRow = 1
        if(csvMap.isEmpty()){
            val reader = BufferedReader(FileReader(fileName))
            var line = reader.readLine()
            while (line != null && line.isNotEmpty()) {
                val row = line.split(",")
                println(row)
                println(row[0])
                updateKey = row[0]
                csvMap[updateKey.trim()] = row[answerRow]
                line = reader.readLine()
            }
            reader.close()
        }
        if(entity != null && entity != "") {
            key = "$key-$entity"
        }
        println(key)
        return csvMap[key.toLowerCase()].toString()
    }
}