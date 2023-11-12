package lesson_1

fun main() {
    val secondsInHour = 3600
    val minutesInHour = 60
    val secondsInSpace: Short = 6480
    val hours = secondsInSpace / secondsInHour
    val minutes = (secondsInSpace % secondsInHour) / minutesInHour
    val seconds = secondsInSpace % minutesInHour

    print(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}