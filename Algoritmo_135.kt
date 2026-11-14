fun main() {
    var idade: Int
    print("\nDigite idade: ")
    idade = readln().toInt()
    if (idade < 16) {
        println("\nNao eleitor")
    } else {
        if (idade > 65) {
            println("\nEleitor facultativo")
        } else {
            println("\nEleitor obrigatorio")
        }
    }
}
