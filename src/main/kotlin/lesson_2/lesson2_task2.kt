package lesson_2

fun main() {
    val employeeSalary = 30_000
    val internSalary = 20_000
    val employeeCount = 50
    val internCount = 30

    val totalEmployeeSalaryMonth = employeeSalary * employeeCount
    val totalSalaryMonth = employeeSalary * employeeCount + internSalary * internCount
    val averageSalary = totalSalaryMonth / (employeeCount + internCount)

    println("Расходы на выплату зарплаты постоянных сотрудников: $totalEmployeeSalaryMonth руб.")
    println("Общие расходы по ЗП после прихода стажеров: $totalSalaryMonth руб.")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageSalary руб.")
}