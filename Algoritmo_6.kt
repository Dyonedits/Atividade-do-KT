fun main() {
    println("pegar faca, bacia e batatas")
    println("colocar água na bacia")
    var haBatatas = true
    while (haBatatas) {
        println("descascar batatas")
        print("Ainda há batatas? (s/n): ")
        haBatatas = readln().trim().lowercase() == "s"
    }
}
