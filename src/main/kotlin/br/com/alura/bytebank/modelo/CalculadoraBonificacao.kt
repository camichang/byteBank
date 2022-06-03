package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Funcionario

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set //nao pode modificar qualquer pessoa

    fun registra(funcionario: Funcionario){     //não faz sentido utilizar o (funcionario: Any), pois queremos que o funcionario seja privado
        this.total += funcionario.bonificacao   //funcionario as funcionario - cast é pra falar que o Any que estamos usando é do funcionario

        }
    }
