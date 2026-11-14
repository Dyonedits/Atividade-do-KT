fun main() {
    var fahrenheitMaior: Int
    var fahrenheitMenor: Int
    var decremento: Int
    var celsius: Double
    var temperatura: Int
    print("\nEntre com a temperatura maior em Fahrenheit: ")
    fahrenheitMaior = readln().toInt()
    print("\nEntre com a temperatura menor em Fahrenheit: ")
    fahrenheitMenor = readln().toInt()
    print("\nEntre com decremento: ")
    decremento = readln().toInt()
    println("\nFahrenheit\tCelsius")
    temperatura = fahrenheitMaior
    while (temperatura >= fahrenheitMenor) {
        celsius = 5.0 * (temperatura - 32) / 9
        println("$temperatura\t\t$celsius")
        temperatura = temperatura - decremento
    }
}
