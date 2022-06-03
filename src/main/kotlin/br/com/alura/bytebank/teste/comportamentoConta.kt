import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun comportamentoConta() {
    val camila = Cliente(nome = "Camila", cpf = "111.111.111-11", senha = 1111, endereco = Endereco(logradouro = "rua vergueiro"))

    val conta = ContaCorrente(titular = camila, numero = 1000)
    conta.deposita(100.0)

    val danillo = Cliente (nome = "Danillo", cpf = "222.222.222-22", senha = 2222, endereco = Endereco())

    val conta1 = ContaPoupanca(titular = danillo, numero = 1001)
    conta1.deposita(200.0)

    val ruffos = Cliente(nome = "Ruffos", cpf = "333.333.333-33", senha = 3333, endereco = Endereco())

    val conta2 = ContaCorrente(titular = ruffos, numero = 1002)
    conta2.deposita(100.0)
    println(conta2)

    conta.deposita(100.0)
    println("Deposito: ${conta.titular} = ${conta.saldo}")
    conta.saque(150.0)
    println("Total depois do saque: ${conta.titular} = ${conta.saldo}")
    if (conta.transferencia(100.0, conta1)) {
        println("Tranferencia com sucesso")
    } else {
        println("Transferencia com falha")
    }
    println("Total depois da transferencia: ${conta.titular} = ${conta.saldo}")

    println()

    conta1.deposita(10.0)
    println("Deposito: ${conta1.titular} = ${conta1.saldo}")
    conta1.saque(50.0)
    println("Total depois do saque: ${conta1.titular} = ${conta1.saldo}")
    if (conta1.transferencia(30.0, conta)) {
        println("Tranferencia com sucesso")
    } else {
        println("Transferencia com falha")
    }
    println("Total depois da transferencia: ${conta1.titular} = ${conta1.saldo}")
}