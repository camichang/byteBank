import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

public fun testaFuncionarios() {
    val camila = Analista(
        nome = "Camila",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )
    println("modelo.Funcionario: ${camila.nome}")
    println("CPF: ${camila.cpf}")
    println("Salario: ${camila.salario}")
    println("Bonificação: ${camila.bonificacao}")
    println()

    val danillo = Gerente(
        nome = "Danillo",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("modelo.Funcionario: ${danillo.nome}")
    println("CPF: ${danillo.cpf}")
    println("Salario: ${danillo.salario}")
    println("Bonificação: ${danillo.bonificacao}")

    if (danillo.autentica(1234)) {
        println("autenticação sucesso")
    } else {
        println("falha autenticação")
    }
    println()

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 1000,
        plr = 200.0
    )
    println("modelo.Funcionario: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salario: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(1000)) {
        println("autenticação sucesso")
    } else {
        println("falha autenticação")
    }

    val ruffos = Analista(
        nome = "Ruffos",
        cpf = "444.4444.444-44",
        salario = 3000.0
    )
    println()
    println("modelo.Funcionario: ${ruffos.nome}")
    println("CPF: ${ruffos.cpf}")
    println("Salario: ${ruffos.salario}")
    println("Bonificação: ${ruffos.bonificacao}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(camila)
    calculadora.registra(danillo)
    calculadora.registra(gui)
    calculadora.registra(ruffos)

    println()
    println("total da bonificação: ${calculadora.total}")
}