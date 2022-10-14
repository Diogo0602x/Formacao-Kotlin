fun main() {
    println("Bem vindo ao Bytebank")

    val contaDiogo = Conta()
    contaDiogo.titular = "Diogo"
    contaDiogo.numero = 1000
    contaDiogo.setSaldo(200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println(contaDiogo.titular)
    println(contaDiogo.numero)
    println(contaDiogo.getSaldo())

//    println("Depositando na conta do Diogo")
//    contaDiogo.deposita(50.0)
//    println(contaDiogo.saldo)
//
//    println("Depositando na conta da Fran")
//    contaFran.deposita(70.0)
//    println(contaFran.saldo)
//
//    println("Sacando na conta do Diogo")
//    contaDiogo.saca(250.0)
//    println(contaDiogo.saldo)
//
//    println("Sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("Saque em excesso na conta do Diogo")
//    contaDiogo.saca(100.0)
//    println(contaDiogo.saldo)
//
//    println("Saque em excesso na conta da Fran")
//    contaFran.saca(500.0)
//    println(contaFran.saldo)
//
//    println("Transferência da conta da Fran para o Diogo")
//
//    if(contaFran.transfere(300.0, contaDiogo)){
//        println("Transferência sucedida")
//    } else {
//        println("Falha na transferência")
//    }
//
//    println(contaDiogo.saldo)
//    println(contaFran.saldo)
}

class Conta {
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double) {
        this.saldo += valor
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        } else {
            println("Valor maior do que disponível na conta")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(valor: Double) {
        if(valor > 0) {
            saldo = valor
        }
    }
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
    while (i < 5) {
        val titular: String = "Diogo $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        println("titular $titular")
        println("número da conta $numeroConta")
        println("saldo da conta $saldo")
        println()
        i++
    }

    for (i in 5 downTo 1) {
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