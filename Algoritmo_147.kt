fun main() {
    var opcaoPrato: Int
    var opcaoSobremesa: Int
    var opcaoBebida: Int
    var calorias: Int
    calorias = 0
    print("\nDigite 1- Vegetariano 2- Peixe 3- Frango 4- Carne: ")
    opcaoPrato = readln().toInt()
    if (opcaoPrato == 1) {
        calorias = calorias + 180
    } else {
        if (opcaoPrato == 2) {
            calorias = calorias + 230
        } else {
            if (opcaoPrato == 3) {
                calorias = calorias + 250
            } else {
                if (opcaoPrato == 4) {
                    calorias = calorias + 350
                }
            }
        }
    }
    print("\nDigite 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse de chocolate: ")
    opcaoSobremesa = readln().toInt()
    if (opcaoSobremesa == 1) {
        calorias = calorias + 75
    } else {
        if (opcaoSobremesa == 2) {
            calorias = calorias + 110
        } else {
            if (opcaoSobremesa == 3) {
                calorias = calorias + 170
            } else {
                if (opcaoSobremesa == 4) {
                    calorias = calorias + 200
                }
            }
        }
    }
    print("\nDigite 1- Cha 2- Suco de laranja 3- Suco de melao 4- Refrigerante diet: ")
    opcaoBebida = readln().toInt()
    if (opcaoBebida == 1) {
        calorias = calorias + 20
    } else {
        if (opcaoBebida == 2) {
            calorias = calorias + 70
        } else {
            if (opcaoBebida == 3) {
                calorias = calorias + 100
            } else {
                if (opcaoBebida == 4) {
                    calorias = calorias + 65
                }
            }
        }
    }
    println("\nTotal de calorias: $calorias")
}
