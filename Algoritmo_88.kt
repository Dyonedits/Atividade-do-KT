fun main() {
    var opcao: String
    var a: Double
    var b: Double
    print("\n\n\t\t\t\t*************\n")
    print("\t\t\t\t*CALCULADORA*\n")
    print("\t\t\t\t*************\n")
    print("\n\t\t\t\t+ para somar\n")
    print("\n\t\t\t\t- para subtrair\n")
    print("\n\t\t\t\t* para multiplicar\n")
    print("\n\t\t\t\t/ para dividir\n")
    print("\n\n\t\t\t\tDigite opcao: ")
    opcao = readln()
    if (opcao == "+") {
        print("\nDigite 1 numero com ponto: ")
        a = readln().toDouble()
        print("\nDigite 2 numero com ponto: ")
        b = readln().toDouble()
        println("\nSOMA: ${a + b}")
    } else {
        if (opcao == "-") {
            print("\nDigite 1 numero com ponto: ")
            a = readln().toDouble()
            print("\nDigite 2 numero com ponto: ")
            b = readln().toDouble()
            println("\nSUBTRACAO: ${a - b}")
        } else {
            if (opcao == "*") {
                print("\nDigite 1 numero com ponto: ")
                a = readln().toDouble()
                print("\nDigite 2 numero com ponto: ")
                b = readln().toDouble()
                println("\nMULTIPLICACAO: ${a * b}")
            } else {
                if (opcao == "/") {
                    print("\nDigite 1 numero com ponto: ")
                    a = readln().toDouble()
                    print("\nDigite 2 numero com ponto: ")
                    b = readln().toDouble()
                    println("\nDIVISAO: ${a / b}")
                } else {
                    println("\nOPÇÃO NÃO DISPONÍVEL!")
                }
            }
        }
    }
}
