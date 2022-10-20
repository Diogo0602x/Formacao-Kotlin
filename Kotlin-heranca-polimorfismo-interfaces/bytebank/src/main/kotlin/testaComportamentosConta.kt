fun testaComportamentosConta() {
    val contaDiogo = Conta(titular = "Diogo", numero = 1000)
    contaDiogo.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaDiogo.titular)
    println(contaDiogo.numero)
    println(contaDiogo.saldo)

    println("Depositando na conta do Diogo")
    contaDiogo.deposita(50.0)
    println(contaDiogo.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Diogo")
    contaDiogo.saca(250.0)
    println(contaDiogo.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Diogo")
    contaDiogo.saca(100.0)
    println(contaDiogo.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Diogo")

    if (contaFran.transfere(destino = contaDiogo, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaDiogo.saldo)
    println(contaFran.saldo)
}