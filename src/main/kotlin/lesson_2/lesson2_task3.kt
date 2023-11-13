package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val arrivalHour = departureHour + travelTimeInMinutes / 60
    val arrivalMinute = (departureMinute + travelTimeInMinutes) % 60

    println(String.format("%2d:%2d", arrivalHour, arrivalMinute))
}