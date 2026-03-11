/*
Autor: Glauber Almeida de Brito
Exercício 10: Faça uma função que receba 3 notas e retorne a média do aluno
 */

fun media(n1: Double, n2: Double, n3: Double): Double{
    return (n1 + n2 + n3) / 3
}
fun main() {
    val notas = mutableListOf<Double>()

    for (i in 1 .. 3) {
        print("Digite a ${i}° Nota: ")
        notas.add(readln().toDouble())
    }

    println("A média das notas é ${media(notas[0], notas[1], notas[2])}")
}