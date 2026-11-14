fun main() {
    var tempo: Double
    var velocidade: Double
    var distancia: Double
    var litros: Double
    print("\nDigite o tempo gasto: ")
    tempo = readln().toDouble()
    print("\nDigite a velocidade média: ")
    velocidade = readln().toDouble()
    distancia = tempo * velocidade
    litros = distancia / 12
    println("\nvelocidade = $velocidade")
    println("tempo = $tempo")
    println("distancia = $distancia")
    println("litros = $litros")
}
