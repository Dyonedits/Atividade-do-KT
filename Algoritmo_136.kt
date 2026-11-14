fun main() {
    var idade: Int
    var nome: String
    print("\nEntre com nome: ")
    nome = readln()
    print("\nEntre com a idade: ")
    idade = readln().toInt()
    if (idade <= 10) {
        println("\n$nome pagara R$ 30,00")
    } else {
        if (idade <= 29) {
            println("\n$nome pagara R$ 60,00")
        } else {
            if (idade <= 45) {
                println("\n$nome pagara R$ 120,00")
            } else {
                if (idade <= 59) {
                    println("\n$nome pagara R$ 150,00")
                } else {
                    if (idade <= 65) {
                        println("\n$nome pagara R$ 250,00")
                    } else {
                        println("\n$nome pagara R$ 400,00")
                    }
                }
            }
        }
    }
}
