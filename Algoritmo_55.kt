fun main() {
    var diagonalMaior: Double
    var diagonalMenor: Double
    var area: Double
    print("\nMedida da diagonal maior: ")
    diagonalMaior = readln().toDouble()
    print("\nMedida da diagonal menor: ")
    diagonalMenor = readln().toDouble()
    area = (diagonalMaior * diagonalMenor) / 2
    println("\narea = $area")
}
