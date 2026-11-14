fun main() {
    var pontos1: Int
    var pontos2: Int
    var pontos3: Int
    var auxiliar: Int
    var soma: Int
    print("\nDigite os pontos do primeiro jogador: ")
    pontos1 = readln().toInt()
    print("\nDigite os pontos do segundo jogador: ")
    pontos2 = readln().toInt()
    print("\nDigite os pontos do terceiro jogador: ")
    pontos3 = readln().toInt()
    if (pontos1 < pontos2) {
        auxiliar = pontos1
        pontos1 = pontos2
        pontos2 = auxiliar
    }
    if (pontos1 < pontos3) {
        auxiliar = pontos1
        pontos1 = pontos3
        pontos3 = auxiliar
    }
    if (pontos2 < pontos3) {
        auxiliar = pontos2
        pontos2 = pontos3
        pontos3 = auxiliar
    }
    println("\npontos1 = $pontos1\npontos2 = $pontos2\npontos3 = $pontos3")
    soma = pontos1 + pontos2 + pontos3
    if (soma > 100) {
        println("\nMedia = ${String.format("%.2f", soma / 3.0)}")
    } else {
        println("\nEquipe desclassificada!")
    }
}
