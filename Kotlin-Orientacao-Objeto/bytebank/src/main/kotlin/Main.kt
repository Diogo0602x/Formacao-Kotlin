fun main() {
    println("Bem vindo ao Bytebank")

    val contaDiogo = Conta()
    contaDiogo.titular = "Diogo"
    contaDiogo.numero = 1000
    contaDiogo.saldo = 200.0

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.saldo = 300.0

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaDiogo.titular)
    println(contaDiogo.numero)
    println(contaDiogo.saldo)

    println("Depositando na conta do Diogo")
    deposita(contaDiogo, 50.0)
    println(contaDiogo.saldo)

    println("Depositando na conta da Fran")
    deposita(contaFran, 70.0)
    println(contaFran.saldo)
}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "Joao"
    var contaMaria = Conta()
    contaMaria.titular = "Maria"
    contaJoao.titular = "Diogo"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}

fun testaLacos() {
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

    for (i in 5 downTo 1 ) {
        val titular: String = "Diogo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
    }
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