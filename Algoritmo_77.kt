import kotlin.math.pow

fun main() {
    var a: Double
    var b: Double
    var quadradoDiferenca: Double
    var diferencaQuadrados: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    quadradoDiferenca = (a - b).pow(2)
    diferencaQuadrados = a.pow(2) - b.pow(2)
    println("\no quadrado da diferença = $quadradoDiferenca")
    println("diferença dos quadrados = $diferencaQuadrados")
}
