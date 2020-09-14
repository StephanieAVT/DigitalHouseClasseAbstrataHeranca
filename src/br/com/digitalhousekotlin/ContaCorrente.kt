package br.com.digitalhousekotlin

class ContaCorrente(numero:Int, saldo:Float, titular:Cliente) : Conta(saldo,numero,titular){
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



}
