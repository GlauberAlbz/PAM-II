/*
Autor: Glauber Almeida de Brito
Exercício 4: Crie uma variável numérica e exiba sua tabuada de 0 a 10.
 */

fun main() {
    print("Digite um número: ")
    val num = readln().toInt()

    for (i in 0 .. 10) {
        println("$num x $i = ${num * i}")
    }
}
