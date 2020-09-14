package br.com.digitalhousekotlin

class ContaPoupanca(numero:Int, saldo:Float, titular:Cliente) : Conta(saldo,numero,titular) {

    override fun depositar(valor: Float) {
       saldo += valor
        println("DEPOSITO REALIZADO COM SUCESSO")
        println("Novo valor do saldo na conta é:$saldo")
    }

    override fun sacar(valor: Float) {
        if (valor> saldo) { println("Saque nao pode ser realizado")
        } else {
            saldo -= valor
            println("SAQUE REALIZADO COM SUCESSO")
            println("Novo valor do saldo na conta é:$saldo")
        }
    }


     override fun consultarSaldo() {
        println("O saldo da conta de numero: $numeroConta é de:$saldo")
    }
    fun recolherJuros(){
        for(i in 1..12){
            saldo += saldo/100
        }
        println("O saldo atual da conta somado ao juros recolhido em 12 meses é: $saldo")
    }
}