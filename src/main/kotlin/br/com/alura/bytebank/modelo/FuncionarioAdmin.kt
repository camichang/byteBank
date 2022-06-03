package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticacao
import br.com.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticacao {

    override fun autentica(senha: Int): Boolean{
        if (this.senha == senha) {
            return true
        }
        return false
    }
}