fun main() {
    var pontos1: Int
    var pontos2: Int
    var pontos3: Int
    var auxiliar: Int
    var nome1: String
    var nome2: String
    var nome3: String
    var nomeAuxiliar: String
    print("\nDigite 1 nome: ")
    nome1 = readln()
    print("\nDigite pontos: ")
    pontos1 = readln().toInt()
    print("\nDigite 2 nome: ")
    nome2 = readln()
    print("\nDigite pontos: ")
    pontos2 = readln().toInt()
    print("\nDigite 3 nome: ")
    nome3 = readln()
    print("\nDigite pontos: ")
    pontos3 = readln().toInt()
    if (pontos1 < pontos2) {
        auxiliar = pontos1
        pontos1 = pontos2
        pontos2 = auxiliar
        nomeAuxiliar = nome1
        nome1 = nome2
        nome2 = nomeAuxiliar
    }
    if (pontos1 < pontos3) {
        auxiliar = pontos1
        pontos1 = pontos3
        pontos3 = auxiliar
        nomeAuxiliar = nome1
        nome1 = nome3
        nome3 = nomeAuxiliar
    }
    if (pontos2 < pontos3) {
        auxiliar = pontos2
        pontos2 = pontos3
        pontos3 = auxiliar
        nomeAuxiliar = nome2
        nome2 = nome3
        nome3 = nomeAuxiliar
    }
    println("\nVencedor:           $nome1 $pontos1 ptos")
    println("Segundo colocado:   $nome2 $pontos2 ptos")
    println("Terceiro colocado:  $nome3 $pontos3 ptos")
}
