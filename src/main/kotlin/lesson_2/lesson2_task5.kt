package lesson_2

fun main() {
    val deposit = 70_000
    val interestRate = 1.167
    val durationInYears = 20.0

    val result = deposit * Math.pow(interestRate, durationInYears)

    println(String.format("%.3f", result))
}