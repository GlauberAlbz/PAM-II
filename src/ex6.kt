/*
Autor: Glauber Almeida de Brito
Exercício 6: Encontre o maior número dentro de um array (ex: [5,8,2,10,3] -> 10
 */

fun main(){
    val lista = mutableListOf<Int>()
    for (i in 1 .. 4) {
        print("Digite o ${i}º número: ")
        lista.add(readln().toInt())
    }
    println("O maior valor é ${lista.max()}")

}