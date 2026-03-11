/*
Autor: Glauber Almeida de Brito
Exercício 9: Crie uma função que receba um número e retorne o dobro dele
 */

fun dobro(numero: Int): Int {
    return (numero * 2)
}
fun main(){
    print("Digite um número: ")
    println("O dobro é ${dobro(readln().toInt())}")
}