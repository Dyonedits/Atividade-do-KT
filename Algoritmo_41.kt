fun main() {
    var a: Double
    var b: Double
    var c: Double
    var d: Double
    var mediaPonderada: Double
    print("\nEntre com 1 numero: ")
    a = readln().toDouble()
    print("\nEntre com 2 numero: ")
    b = readln().toDouble()
    print("\nEntre com 3 numero: ")
    c = readln().toDouble()
    print("\nEntre com 4 numero: ")
    d = readln().toDouble()
    mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("\nmédia ponderada: $mediaPonderada")
}
