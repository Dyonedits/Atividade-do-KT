fun main() {
    println("TESTANDO HIERARQUIA")
    println("\n18 / 6 % 2 é igual a: ${18.0 / (6 % 2)}")
    println("Uma operação de divisão fora de parênteses não pode ser um dos operandos de uma expressao com %.")
    println("\n20 / 4 div 2 é igual a: ${(20 / 4) / 2}")
    println("É IGUAL a (20 / 4) div 2: ${(20 / 4) / 2}, logo div tem a MESMA HIERARQUIA da /")
    println("\n30 / 4 div 2 é igual a: ${Math.round(30.0 / 4 / 2)}")
    println("É IGUAL a (30 / 4) div 2: ${Math.round(30.0 / 4 / 2)}, logo div tem a MESMA HIERARQUIA da /")
    println("\n7. div 4: ${Math.round(7.0 / 4)}")
    println("7 div 4: ${7 / 4}")
    println("6. div 4: ${Math.round(6.0 / 4)}")
    println("6 div 4: ${6 / 4}")
}
