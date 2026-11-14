fun main() {
    var regiao: Int
    var tipoViagem: Int
    print("\nDigite 1- Regiao Norte 2- Regiao Nordeste 3- Regiao Centro-Oeste 4- Regiao Sul: ")
    regiao = readln().toInt()
    print("\nDigite 1- Ida 2- Ida e Volta: ")
    tipoViagem = readln().toInt()
    if (regiao == 1) {
        if (tipoViagem == 1) {
            println("\nO valor da passagem de ida para R.Norte: R$500,00")
        } else {
            println("\nO valor da passagem de ida e volta para R.Norte: R$900,00")
        }
    } else {
        if (regiao == 2) {
            if (tipoViagem == 1) {
                println("\nO valor da passagem de ida para R.Nordeste: R$350,00")
            } else {
                println("\nO valor da passagem de ida e volta para R.Nordeste: R$650,00")
            }
        } else {
            if (regiao == 3) {
                if (tipoViagem == 1) {
                    println("\nO valor da passagem de ida para R.C.Oeste: R$350,00")
                } else {
                    println("\nO valor da passagem de ida e volta para R.C.Oeste: R$600,00")
                }
            } else {
                if (regiao == 4) {
                    if (tipoViagem == 1) {
                        println("\nO valor da passagem de ida para R.Sul: R$300,00")
                    } else {
                        println("\nO valor da passagem de ida e volta para R.Sul: R$550,00")
                    }
                } else {
                    println("\nOpcao Inexistente")
                }
            }
        }
    }
}
