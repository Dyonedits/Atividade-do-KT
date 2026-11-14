fun main() {
    var numero: Int
    print("\nDigite um numero de 1 - 12: ")
    numero = readln().toInt()
    if (numero == 1) {
        println("\njaneiro")
    } else {
        if (numero == 2) {
            println("\nfevereiro")
        } else {
            if (numero == 3) {
                println("\nmarço")
            } else {
                if (numero == 4) {
                    println("\nabril")
                } else {
                    if (numero == 5) {
                        println("\nmaio")
                    } else {
                        if (numero == 6) {
                            println("\njunho")
                        } else {
                            if (numero == 7) {
                                println("\njulho")
                            } else {
                                if (numero == 8) {
                                    println("\nagosto")
                                } else {
                                    if (numero == 9) {
                                        println("\nsetembro")
                                    } else {
                                        if (numero == 10) {
                                            println("\noutubro")
                                        } else {
                                            if (numero == 11) {
                                                println("\nnovembro")
                                            } else {
                                                if (numero == 12) {
                                                    println("\ndezembro")
                                                } else {
                                                    println("\nnao existe mes correspondente")
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
    }
}
