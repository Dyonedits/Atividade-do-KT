fun main() {
    var palavra1: String
    var palavra2: String
    var copia: String
    var concatenacao: String
    print("digite palavra 1: ")
    palavra1 = readln()
    print("digite palavra 2: ")
    palavra2 = readln()
    println("tamanho da 1 palavra: ${palavra1.length}")
    println("concatenando sem armazenar: ${palavra1 + palavra2}")
    copia = palavra1
    println("o conteudo de copia: $copia")
    concatenacao = palavra1 + palavra2
    println("concatenacao com armazenamento: $concatenacao")
    println("primeiro caractere: ${palavra1.first()}")
    println("ultimo caractere: ${palavra1.last()}")
    println("todos menos o primeiro: ${palavra1.drop(1)}")
    println("o terceiro elemento: ${palavra1[3]}")
    println("os tres primeiros elementos: ${palavra1.take(3)}")
    println("os tres ultimos elementos: ${palavra1.takeLast(3)}")
}
