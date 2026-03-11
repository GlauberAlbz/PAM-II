/*
Autor: Glauber Almeida de Brito
Exercício 3: Crie uma variável idade "Criança" caso seja menor de 12,
             "Adolescente" entre 12 e 17, "Adulto" entre 18 e 59 e
             "Idoso" se 60 ou mais
 */

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