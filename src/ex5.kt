/*
Autor: Glauber Almeida de Brito
Exercício 5: Dado um array de números, calcule a soma de todos eles(ex: [1,2,3,4] = 10
 */

fun main(){
    val lista = mutableListOf<Int>()
    for (i in 1 .. 4) {
        print("Digite o ${i}º número: ")
        lista.add(readln().toInt())
    }
    val resultado = lista[0] + lista[1] + lista[2] + lista[3]
    println("a soma dos números é $resultado")
}