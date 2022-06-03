package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaObjects() {
    val danillo = object {
        val nome: String = "Danillo"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1234

        fun autentica(senha: Int) = this.senha == senha
    }

    println("nome do cliente ${danillo.nome}")

    val camila = Cliente(nome = "Camila", senha = 1234, cpf = "111.111.111-11")
    val contaPoupanca = ContaPoupanca(titular = camila, numero = 1000)
    val contaCorrente = ContaCorrente(titular = camila, numero = 1001)

    println("Total de contas: ${Conta.total}")
}