fun main() {
    var idade: Int
    print("\nEntre com a idade: ")
    idade = readln().toInt()
    if (idade < 5) {
        println("\nnao existe categoria para essa idade")
    } else {
        if (idade <= 7) {
            println("\ncategoria Infantil A")
        } else {
            if (idade <= 10) {
                println("\ncategoria Infantil B")
            } else {
                if (idade <= 13) {
                    println("\ncategoria Juvenil A")
                } else {
                    if (idade <= 17) {
                        println("\ncategoria Juvenil B")
                    } else {
                        println("\ncategoria Senior")
                    }
                }
            }
        }
    }
}
