import kotlin.math.abs
import kotlin.math.exp
import kotlin.math.ln
import kotlin.math.PI
import kotlin.math.sin
import kotlin.math.sqrt

fun realInt(valor: Double): Int {
    return Math.rint(valor).toInt()
}

fun formatar(valor: Double, casas: Int): String {
    return String.format("%.${casas}f", valor).replace(',', '.')
}

fun main() {
    println("raiz: ${sqrt(64.0)}")
    println("raiz com exp e log e realint: ${realInt(exp(1.0 / 2 * ln(64.0)))}")
    println("raiz com exp e log sem realint: ${exp(1.0 / 2 * ln(64.0))}")
    println(formatar(sin(45 * PI / 180) + 0.0001, 3))
    println("potencia com exp e log e formatar: ${formatar(exp(3 * ln(8.0)) + 0.001, 3)}")
    println("potencia com exp e log sem formatar: ${exp(3 * ln(8.0))}")
    println("potencia com operador ** e formatar: ${formatar(Math.pow(8.0, 3.0), 3)}")
    println("raiz cubica: ${exp(1.0 / 3 * ln(8.0))}")
    println("absoluto: ${abs(-8)}")
    println("absoluto: ${abs(8)}")
    println("convertendo para inteiro 5.5: ${realInt(5.5)}")
    println("convertendo para inteiro 6.5: ${realInt(6.5)}")
    println("convertendo para inteiro 6.5 + 0.0001: ${realInt(6.5 + 0.0001)}")
    println("convertendo para inteiro 5.45: ${realInt(5.45)}")
    println("convertendo para inteiro 5.51: ${realInt(5.51)}")
    println("convertendo para real 87: ${87.toDouble()}")
    println("convertendo para int 3/4: ${realInt(3.0 / 4)}")
}
