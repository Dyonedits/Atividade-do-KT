fun main() {
    var idade: Int
    var nome: String
    var sexo: String
    print("\nDigite nome: ")
    nome = readln()
    print("\nDigite sexo: ")
    sexo = readln()
    print("\nDigite idade: ")
    idade = readln().toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("\n$nome ACEITA")
    } else {
        println("\n$nome NAO ACEITA")
    }
}
