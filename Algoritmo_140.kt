fun main() {
    var nome: String
    var letra: String
    var valorConta: Double
    print("\nDigite nome: ")
    nome = readln()
    print("\nDigite valor da conta: ")
    valorConta = readln().toDouble()
    letra = nome.take(1)
    if (letra == "A" || letra == "a" || letra == "D" || letra == "d" || letra == "M" || letra == "m" || letra == "S" || letra == "s") {
        println("\n$nome valor da conta com desconto: R$ ${String.format("%.2f", valorConta * 0.7)}")
    } else {
        println("\nQue pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará")
    }
}
