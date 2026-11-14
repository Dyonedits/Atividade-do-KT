fun main() {
    var a: Double
    var b: Double
    var c: Double
    var maior: Double
    var intermediario: Double
    var menor: Double
    print("\nDigite 1 numero: ")
    a = readln().toDouble()
    print("\nDigite 2 numero: ")
    b = readln().toDouble()
    print("\nDigite 3 numero: ")
    c = readln().toDouble()
    if (a > b) {
        if (c > a) {
            maior = c
            intermediario = a
            menor = b
        } else {
            if (c > b) {
                maior = a
                intermediario = c
                menor = b
            } else {
                maior = a
                intermediario = b
                menor = c
            }
        }
    } else {
        if (c > b) {
            maior = c
            intermediario = b
            menor = a
        } else {
            if (c > a) {
                maior = b
                intermediario = c
                menor = a
            } else {
                maior = b
                intermediario = a
                menor = c
            }
        }
    }
    println("\nmaior: $maior")
    println("intermediario: $intermediario")
    println("menor: $menor")
}
