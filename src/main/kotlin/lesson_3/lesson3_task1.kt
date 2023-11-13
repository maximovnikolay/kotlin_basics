package lesson_3

import java.util.Calendar

fun main() {
    val name = readLine() ?: ""
    println(createHelloMessage(name))
}

fun createHelloMessage(personName: String) :String {
    val now = Calendar.getInstance()
    val helloMessage = when (now.get(Calendar.HOUR_OF_DAY)) {
        in 5 until 10 -> "Доброе утро"
        in 10 until 18 -> "Добрый день"
        in 18 until 23 -> "Добрый вечер"
        else -> "Доброй ночи"
    }
    return "$helloMessage, ${if (personName.isEmpty()) "Незнакомец" else personName}!"
}