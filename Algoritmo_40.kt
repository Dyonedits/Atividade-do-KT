fun main() {
    var quociente: Int
    var resto: Int
    var dividendo: Int
    var divisor: Int
    print("\nEntre com o dividendo: ")
    dividendo = readln().toInt()
    print("\nEntre com divisor: ")
    divisor = readln().toInt()
    quociente = dividendo / divisor
    resto = dividendo % divisor
    println("\n\n")
    println("dividendo: $dividendo")
    println("divisor: $divisor")
    println("quociente: $quociente")
    println("resto: $resto")
}
