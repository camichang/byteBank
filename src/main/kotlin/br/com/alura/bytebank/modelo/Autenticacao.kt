package br.com.alura.bytebank.modelo

interface Autenticacao {


    fun autentica(senha: Int): Boolean
}
