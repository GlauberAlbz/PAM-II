/*
Autor: Glauber Almeida de Brito
Exercício 7: Dado um array de números, calcule somente a soma dos números pares (ex: [1,2,3,4] -> 6
 */

fun main(){
    val lista = mutableListOf<Int>()
    var soma = 0
    for (i in 1 .. 4) {
        print("Digite o ${i}º número: ")
        lista.add(readln().toInt())
    }
    for (i in lista) {
        if (i % 2 == 0){
            soma += i
        }
    }
    println("A soma dos números pares é $soma")

}