package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticacao

class SistemaInterno {

    fun login(admin: Autenticacao, senha: Int){
        if (admin.autentica(senha)){
            println("Bem vindo ao ByteBank")
        }else{
            println("Falha na autenticação")
        }
    }

}