/*
Autor: Glauber Almeida de Brito
Exercício 2: Crie uma variável numérica e exiba se o número é posítivo, negativo ou zero
 */

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