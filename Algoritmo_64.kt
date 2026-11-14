fun main() {
    var fahrenheit: Double
    var celsius: Double
    print("\nDigite o valor da temperatura em graus centígrados: ")
    celsius = readln().toDouble()
    fahrenheit = (9 * celsius + 160) / 5
    println("\no valor da temperatura em graus fahrenheit é = $fahrenheit")
}
