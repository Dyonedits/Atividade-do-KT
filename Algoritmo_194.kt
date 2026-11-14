fun main() {
    var numero: Int
    var produto: Int
    produto = 1
    print("\nDigite um numero: ")
    numero = readln().toInt()
    for (i in 1..numero) {
        produto = produto * i
        print("$i  ")
    }
    println("\nProduto de 1 a $numero: $produto")
}
