fun testaLacos(){
    val titular = "Camila"
    val numeroConta = 1000
    var saldo = 100.0

    saldo += 202.0
    saldo -=100.0
    saldo -=101.0

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo da conta: $saldo")

    if(saldo > 0.0){
        println("saldo positivo")
    } else if (saldo == 0.0){
        println("sem saldo")
    }else{
        println("saldo negativo")
    }
}