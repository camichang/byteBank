import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaCopiasEReferencias(){
    val camila = Cliente(nome = "Camila", cpf = "", senha = 1111, endereco = Endereco())

    val contaCamila = ContaCorrente(titular = camila, numero = 1000)
    contaCamila.titular.nome = "Camila"

    val danillo = Cliente(nome = "Danillo", cpf = "", senha = 2222, endereco = Endereco())

    var contaDanillo = ContaPoupanca(titular = danillo, numero = 1001)
    contaDanillo.titular.nome = "Danillo"
    contaCamila.titular.nome = "Camila"

    println("titular conta Camila: ${contaCamila.titular}")
    println("titular conta Danillo: ${contaDanillo.titular}")

    println(contaCamila)
    println(contaDanillo)
}