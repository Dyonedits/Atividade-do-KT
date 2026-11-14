fun main() {
    var peso: Int
    var pesoEmGramas: Int
    var novoPeso: Int
    print("\nEntre com seu peso, só a parte inteira: ")
    peso = readln().toInt()
    pesoEmGramas = peso * 1000
    novoPeso = (pesoEmGramas * 1.12).toInt()
    println("\npeso em gramas: $pesoEmGramas")
    println("novo peso: $novoPeso")
}
