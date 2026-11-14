fun main() {
    println("TESTANDO HIERARQUIA")
    println("\n12 + 5 / 2 é igual a: ${12 + 5 / 2.0}")
    println("É DIFERENTE DE (12 + 5) / 2 que é igual a: ${(12 + 5) / 2.0}, logo / tem HIERARQUIA MAIOR do que + ou -")
    println("\n64**1/4 é igual a: ${Math.pow(64.0, 1.0) / 4}")
    println("É DIFERENTE de 64**(1/4) que é igual a: ${Math.pow(64.0, 1.0 / 4)}, logo ** tem HIERARQUIA MAIOR do que * ou /")
    println("\n3*7 % 5 é igual a: ${3 * (7 % 5)}")
    println("É DIFERENTE de (3 * 7) % 5 que é igual a: ${(3 * 7) % 5}, logo % tem HIERARQUIA MAIOR do que *")
    println("\n3 * 7 div 5 é igual a: ${(3 * 7) / 5}")
    println("É IGUAL a (3 * 7) div 5: ${(3 * 7) / 5}, logo div tem a MESMA HIERARQUIA de * ou /")
}
