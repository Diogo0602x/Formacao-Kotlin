fun main() {
    println("Bem vindo ao Bytebank")

    val diogo = Funcionario(
        nome = "Diogo",
        cpf = "111.111.111-11",
        salario = 4000.0,
    )

    println("nome ${diogo.nome}")
    println("nome ${diogo.cpf}")
    println("nome ${diogo.salario}")
    println("bonificacao ${diogo.bonificacao()}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha =  1234
    )

    println("nome ${fran.nome}")
    println("nome ${fran.cpf}")
    println("nome ${fran.salario}")
    println("bonificacao ${fran.bonificacao()}")

    if(fran.autentica(1233)) {
        println("Gerente autenticado com sucesso")
    } else {
        println("Gerente não autenticado")
    }

}

