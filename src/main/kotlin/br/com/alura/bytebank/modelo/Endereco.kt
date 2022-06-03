package br.com.alura.bytebank.modelo

class Endereco(
    val logradouro: String = "",
    val num: Int = 0,
    val bairro: String = "",
    val cidade: String = "",
    val estado: String = "",
    val cep: String = "",
    val complemento: String = ""
) {
    override fun toString(): String {
        return """
    Endereco(logradouro='$logradouro',
    num=$num,
    bairro='$bairro',
    cidade='$cidade',
    estado='$estado',
    cep='$cep',
    complemento='$complemento')
    """.trimIndent()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true         //verifica se a referencia é a mesma enviada, forma otimizada
        if (javaClass != other?.javaClass) return false
//other? ele verifica se o nome da classe do other é o mesmo da classe do objeto
        other as Endereco   //cast

        if (logradouro != other.logradouro) return false
        if (num != other.num) return false
        if (bairro != other.bairro) return false
        if (cidade != other.cidade) return false
        if (estado != other.estado) return false
        if (cep != other.cep) return false
        if (complemento != other.complemento) return false
//verifica os tipos e verifica cada campo
        return true
    }

    override fun hashCode(): Int {
        var result = logradouro.hashCode()
        result = 31 * result + num
        result = 31 * result + bairro.hashCode()
        result = 31 * result + cidade.hashCode()
        result = 31 * result + estado.hashCode()
        result = 31 * result + cep.hashCode()
        result = 31 * result + complemento.hashCode()
        return result
    }
//o 31 * é uma otimizacao do kotlin

}
