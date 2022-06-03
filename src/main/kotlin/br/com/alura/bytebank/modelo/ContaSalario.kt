package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Conta

class ContaSalario(
    titular: Cliente,
    numero: Int
): Conta(
    titular = titular,
    numero = numero
){
       override fun saque(valor: Double){
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}