fun main() {
    var data: Int
    var ano: Int
    var mes: Int
    var dia: Int
    var dataValida: Int
    print("\nData no formato ddmmaaaa: ")
    data = readln().toInt()
    dia = data / 1000000
    mes = data % 1000000 / 10000
    ano = data % 10000
    if (ano >= 1) {
        dataValida = 1
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            dataValida = 0
        } else {
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                dataValida = 0
            } else {
                if (mes == 2) {
                    if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                        if (dia > 29) {
                            dataValida = 0
                        }
                    } else {
                        if (dia > 28) {
                            dataValida = 0
                        }
                    }
                }
            }
        }
    } else {
        dataValida = 0
    }
    if (dataValida == 0) {
        println("\nDATA INVALIDA")
    } else {
        println("\nDATA VALIDA")
    }
}
