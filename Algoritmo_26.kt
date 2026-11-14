fun main() {
    var data: Int
    var dia: Int
    var mes: Int
    var ano: Int
    var novaData: Int
    print("Digite data no formato DDMMAA: ")
    data = readln().toInt()
    dia = data / 10000
    mes = data % 10000 / 100
    ano = data % 100
    novaData = mes * 10000 + dia * 100 + ano
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("\nDATA NO FORMATO MMDDAA: $novaData")
}
