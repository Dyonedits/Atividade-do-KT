fun main() {
    var data: Int
    var dia: Int
    var mes: Int
    var ano: Int
    print("Digite data no formato ddmmaa: ")
    data = readln().toInt()
    dia = data / 10000
    mes = data % 10000 / 100
    ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}
