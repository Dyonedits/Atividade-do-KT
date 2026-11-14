fun main() {
    var hora: Int
    var minuto: Int
    var totalMinutos: Int
    print("\nEntre com hora atual: ")
    hora = readln().toInt()
    print("\nEntre com minutos: ")
    minuto = readln().toInt()
    totalMinutos = hora * 60 + minuto
    println("\nAté agora se passaram: $totalMinutos minutos")
}
