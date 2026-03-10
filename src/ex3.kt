fun main() {
    print("Digite sua idade: ")
    val idade = readln().toInt()

    when (idade) {
        in 0 until 12 -> println("Criança")
        in 12 .. 17 -> println("Adolescente")
        in 18 .. 59 -> println("Adulto")
        else -> println("Idoso")

    }
}