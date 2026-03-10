/*
Autor: Glauber Almeida de Brito
Exercício 8: Dado um array de números, calcule somente a soma dos números pares (ex: [1,2,3,4] -> 6
 */

fun main(){
    val lista = mutableListOf<Int>()
    for (i in 1 .. 4) {
        print("Digite o ${i}º número: ")
        lista.add(readln().toInt())
    }
    val lista_pares = mutableListOf<Int>()
    for (i in 1 .. 4) {
        if (lista[i] % 2 == 0){
            lista.add(lista_pares)
        }
    }

}