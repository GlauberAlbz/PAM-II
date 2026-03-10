fun main() {

    print("Digite um número: ")
    val num = readln().toInt()

    if (num < 0) {
        println("O número $num é negativo.")
    } else if (num == 0) {
        println("O número $num é zero.")
    } else {
        println("O número $num é positivo.")
    }
}