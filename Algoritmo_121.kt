fun main() {
    var n1: Int
    var n2: Int
    var n3: Int
    var n4: Int
    var n5: Int
    var maior: Int
    var menor: Int
    print("\nDigite 1 numero: ")
    n1 = readln().toInt()
    print("\nDigite 2 numero: ")
    n2 = readln().toInt()
    print("\nDigite 3 numero: ")
    n3 = readln().toInt()
    print("\nDigite 4 numero: ")
    n4 = readln().toInt()
    print("\nDigite 5 numero: ")
    n5 = readln().toInt()
    if (n1 != n2 && n1 != n3 && n1 != n4 && n1 != n5 && n2 != n3 && n2 != n4 && n2 != n5 && n3 != n4 && n3 != n5 && n4 != n5) {
        if (n1 > n2) {
            maior = n1
            menor = n2
        } else {
            maior = n2
            menor = n1
        }
        if (n3 > maior) {
            maior = n3
        } else {
            if (n3 < menor) {
                menor = n3
            }
        }
        if (n4 > maior) {
            maior = n4
        } else {
            if (n4 < menor) {
                menor = n4
            }
        }
        if (n5 > maior) {
            maior = n5
        } else {
            if (n5 < menor) {
                menor = n5
            }
        }
        println("\nMaior = $maior")
        println("Menor = $menor")
    } else {
        println("\nOs valores devem ser diferentes")
    }
}
