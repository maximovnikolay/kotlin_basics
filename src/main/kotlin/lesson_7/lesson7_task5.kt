package lesson_7

fun main() {
    val passwdSize = readLine()?.toInt() ?: 0;

    if (passwdSize < 6) {
        println("Размер пароля должен быть больше шести символов")
        return
    }

    val allowedChars = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    val result = StringBuilder()

    for (i in 1..passwdSize) {
        result.append(allowedChars.random())
    }

    println(result)
}