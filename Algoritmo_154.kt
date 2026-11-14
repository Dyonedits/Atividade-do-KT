fun main() {
    var placa: String
    var ultimo: String
    print("\nDigite placa: ")
    placa = readln()
    ultimo = placa.takeLast(1)
    if (ultimo == "1") {
        println("\njaneiro")
    } else {
        if (ultimo == "2") {
            println("\nfevereiro")
        } else {
            if (ultimo == "3") {
                println("\nmarco")
            } else {
                if (ultimo == "4") {
                    println("\nabril")
                } else {
                    if (ultimo == "5") {
                        println("\nmaio")
                    } else {
                        if (ultimo == "6") {
                            println("\njunho")
                        } else {
                            if (ultimo == "7") {
                                println("\njulho")
                            } else {
                                if (ultimo == "8") {
                                    println("\nagosto")
                                } else {
                                    if (ultimo == "9") {
                                        println("\nsetembro")
                                    } else {
                                        if (ultimo == "0") {
                                            println("\noutubro")
                                        } else {
                                            println("\nopcao invalida")
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
