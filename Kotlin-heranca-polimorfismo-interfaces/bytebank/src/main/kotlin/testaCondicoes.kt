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