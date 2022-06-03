import br.com.alura.bytebank.modelo.*

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Camila", cpf = "", senha = 1111, endereco = Endereco(logradouro = "rua vergueiro")),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente("Danillo", cpf = "", senha = 2222, endereco = Endereco()),
        numero = 1001
    )

    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Gui", cpf = "", senha = 3333, endereco = Endereco()),
        numero = 1002
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(100.0)

    println("Endereço do titular ${contaCorrente.titular.endereco.logradouro}")
    println()

    println("saldo CC: ${contaCorrente.saldo}")
    println("saldo CP: ${contaPoupanca.saldo}")
    println("saldo CS: ${contaSalario.saldo}")
    println()

    contaCorrente.saque(100.0)
    contaPoupanca.saque(100.0)
    contaSalario.saque(200.0)

    println("saldo após saque CC: ${contaCorrente.saldo}")
    println("saldo após saque CP: ${contaPoupanca.saldo}")
    println("saldo após saque CS: ${contaSalario.saldo}")

    contaCorrente.transferencia(100.0, contaPoupanca)
    println()
    println("saldo CC após transferencia CP: ${contaCorrente.saldo}")
    println("saldo CP após transferencia CC: ${contaPoupanca.saldo}")

    contaPoupanca.transferencia(200.0, contaCorrente)
    println()
    println("saldo CP após transferencia CC: ${contaCorrente.saldo}")
    println("saldo CC após transferencia CP: ${contaPoupanca.saldo}")

    contaCorrente.transferencia(150.0, contaSalario)
    println()
    println("saldo CC após transferencia CS: ${contaCorrente.saldo}")
    println("saldo CS após transferencia CC: ${contaSalario.saldo}")

    contaPoupanca.transferencia(50.0, contaSalario)
    println()
    println("saldo CP após transferencia CS: ${contaPoupanca.saldo}")
    println("saldo CS após transferencia CP: ${contaSalario.saldo}")
}