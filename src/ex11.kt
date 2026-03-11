/*
Autor: Glauber Almeida de Brito
Exercício 11: Faça uma função que receba uma temperatura Celsius e
              retorne o valor em Fahrenheit (fórmula: F = C x 1,8 + 32)
 */
fun conversao_temp(temperatura: Double): Double {
    return temperatura * 1.8 + 32
}

fun main() {
    print("Digite a temperatura: ")
    println("A temperatura em Fahrenheit é ${conversao_temp(readln().toDouble())}")
}