fun main() {
    println("Bem vindo ao Bytebank")
    var i = 0
    while(i < 5) {
        val titular: String = "Diogo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

//    for (i in 5 downTo 1 ) {
//        val titular: String = "Diogo $i"
//        val numeroConta: Int = 1000 + i
//        var saldo = i + 10.0
//
//        println("titular $titular")
//        println("número da conta $numeroConta")
//        println("saldo da conta $saldo")
//        println()
//    }

//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta com saldo positivo!")
    } else if (saldo == 0.0) {
        println("Conta com saldo neutro")
    } else {
        println("Conta com saldo negativo")
    }

    when {
        saldo > 0.0 -> println("Conta com saldo positivo!")
        saldo == 0.0 -> println("Conta com saldo neutro")
        else -> println("Conta com saldo negativo")
    }
}