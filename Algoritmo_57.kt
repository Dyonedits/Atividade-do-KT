fun main() {
    var nota1: Double
    var nota2: Double
    var mediaFinal: Double
    print("\nDigite PR1: ")
    nota1 = readln().toDouble()
    print("\nDigite PR2: ")
    nota2 = readln().toDouble()
    mediaFinal = (nota1 + nota2) / 2
    println("\nmedia truncada = ${Math.round((mediaFinal - 0.5) + 0.001)}")
    println("media arredondada = ${Math.round(mediaFinal + 0.001)}")
}
