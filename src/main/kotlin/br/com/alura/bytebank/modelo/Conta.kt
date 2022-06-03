package br.com.alura.bytebank.modelo


abstract class Conta (
    var titular: Cliente,
    val numero: Int
) {
        var saldo = 0.0
            protected set
        companion object Contador{
            var total = 0
                private set

    }
        init {
            println("Criando conta")
            total++
        }

        fun deposita(valor: Double) {
            this.saldo += valor
        }

        abstract fun saque(valor: Double)

        fun transferencia(valor: Double, destino: Conta): Boolean{
            if (saldo >= valor) {
                saldo -= valor
                destino.deposita(valor)
                return true
            }
            return false
        }
}

class ContaCorrente(
    titular: Cliente,
    numero: Int
): ContaTransfere(
    titular = titular,
    numero = numero
){
    override fun saque(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa){
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransfere(
    titular = titular,
    numero = numero
) {
    override fun saque(valor: Double) {
        if (this.saldo >= valor){
            this.saldo -= saldo
        }
    }
}