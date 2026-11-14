fun main() {
    var idade: Int
    var peso: Double
    var miligramasPorGota: Double
    print("\nDigite peso: ")
    peso = readln().toDouble()
    print("\nDigite idade: ")
    idade = readln().toInt()
    miligramasPorGota = 500.0 / 20
    if (peso < 5.0) {
        println("\nnao pode tomar o remedio porque nao tem peso. Consulte medico.")
    } else {
        if (idade >= 12) {
            if (peso >= 60.0) {
                println("\nTomar ${1000 / miligramasPorGota} gotas")
            } else {
                println("\nTomar ${875 / miligramasPorGota} gotas")
            }
        } else {
            if (peso <= 9.0) {
                println("\nTomar ${125 / miligramasPorGota} gotas")
            } else {
                if (peso <= 16.0) {
                    println("\nTomar ${250 / miligramasPorGota} gotas")
                } else {
                    if (peso <= 24.0) {
                        println("\nTomar ${375 / miligramasPorGota} gotas")
                    } else {
                        if (peso <= 30.0) {
                            println("\nTomar ${500 / miligramasPorGota} gotas")
                        } else {
                            println("\nTomar ${750 / miligramasPorGota} gotas")
                        }
                    }
                }
            }
        }
    }
}
