fun main() {

    print("Digite um número: ")
    val num = readln().toInt()

    if(num % 2 == 0){
        println("o número $num é par")
    } else {
        println("o número $num é impar")
    }
}