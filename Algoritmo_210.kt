fun main() {
    var termo1: Int
    var termo2: Int
    var termo: Int
    print("\nEntre com 1 termo: ")
    termo1 = readln().toInt()
    print("\nEntre com 2 termo: ")
    termo2 = readln().toInt()
    print("\n$termo1 $termo2 ")
    for (i in 3..10) {
        if (i % 2 == 0) {
            termo = termo2 - termo1
        } else {
            termo = termo2 + termo1
        }
        print("$termo ")
        termo1 = termo2
        termo2 = termo
    }
    println()
}
