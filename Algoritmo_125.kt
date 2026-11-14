fun main() {
    var idade: Int
    print("\nDigite sua idade: ")
    idade = readln().toInt()
    if (idade >= 65) {
        println("\nmaior de 65")
    } else {
        if (idade >= 18) {
            println("\nmaior de idade")
        } else {
            println("\nmenor de idade")
        }
    }
}
