fun main() {
    var numero: Int
    print("\nEntre com um numero maior do que 15: ")
    numero = readln().toInt()
    if (numero >= 15) {
        for (i in 15..numero step 15) {
            print("$i ")
        }
    } else {
        print("\nNAO EXISTE")
    }
    println()
}
