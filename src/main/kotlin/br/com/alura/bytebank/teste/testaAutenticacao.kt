import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Camila",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1234
    )

    val diretor = Diretor(
        nome = "Danillo",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 2345,
        plr = 200.0
    )

    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 4567,
        endereco = Endereco()
    )

    val sistema = SistemaInterno()
    sistema.login(gerente, 1234)
    sistema.login(diretor, 2345)
    sistema.login(cliente, 4567)


}