fun main() {
    var termo1: Int
    var termo2: Int
    var termo: Int
    var quantidade: Int
    var soma: Int
    print("\nEntre com 1 termo: ")
    termo1 = readln().toInt()
    print("\nEntre com 2 termo: ")
    termo2 = readln().toInt()
    print("\nEntre com n termos: ")
    quantidade = readln().toInt()
    soma = termo1 + termo2
    if (quantidade >= 3) {
        print("\n$termo1 $termo2 ")
        for (i in 1..(quantidade - 2)) {
            termo = termo1 + termo2
            termo1 = termo2
            termo2 = termo
            print("$termo  ")
            soma = soma + termo
        }
        println("\nSoma: $soma")
    } else {
        println("\nnao tem serie")
    }
}
