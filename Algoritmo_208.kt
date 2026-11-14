fun main() {
    var anterior: Int
    var atual: Int
    var proximo: Int
    anterior = 0
    atual = 1
    for (i in 1..10) {
        println("\n$atual    ")
        proximo = anterior + atual
        anterior = atual
        atual = proximo
    }
}
