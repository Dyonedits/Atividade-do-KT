fun main() {
    var idade: Int
    var nome: String
    var sexo: String
    for (i in 1..20) {
        print("\nDigite nome: ")
        nome = readln()
        print("\nDigite sexo: ")
        sexo = readln()
        print("\nDigite idade: ")
        idade = readln().toInt()
        if ((sexo.take(1) == "m" || sexo.take(1) == "M") && idade > 27) {
            println("\n$nome")
        }
    }
}
