fun main() {
    var salario: Double
    var desconto: Double
    print("\nDigite salario: ")
    salario = readln().toDouble()
    if (salario <= 600.0) {
        desconto = 0.0
    } else {
        if (salario <= 1200.0) {
            desconto = salario * 0.2
        } else {
            if (salario <= 2000.0) {
                desconto = salario * 0.25
            } else {
                desconto = salario * 0.30
            }
        }
    }
    println("\ndesconto: $desconto")
}
