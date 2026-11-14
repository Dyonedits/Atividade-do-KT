fun main() {
    var a: Double
    var b: Double
    var auxiliar: Double
    print("\nDigite 1 numero com ponto: ")
    a = readln().toDouble()
    print("\nDigite 2 numero com ponto: ")
    b = readln().toDouble()
    auxiliar = a
    a = b
    b = auxiliar
    println("\na = $a")
    println("b = $b")
}
