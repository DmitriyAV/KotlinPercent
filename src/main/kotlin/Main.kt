fun main() {

    val amount: Int = 10000
    val percent: Double = 0.75
    val amountMin: Int = 3500
    val errorMessage: String = "Сумма меньше 35 рублей"

    val  result = if (amount < amountMin) errorMessage else (amount - ((amount / 100) * percent))/100

    println( "$result рублей.")
}