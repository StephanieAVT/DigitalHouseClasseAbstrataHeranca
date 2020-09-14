package br.com.digitalhousekotlin

 abstract class Conta(open var saldo:Float = 0f,open val numeroConta:Int,open val cliente: Cliente) {

     init {
         println("Informações da conta: Numero da conta: $numeroConta./n Titular: ${cliente.nomeCliente }${cliente.sobrenomeCliente}"
         )
     }
     abstract fun depositar(valor: Float)
     abstract fun sacar(valor: Float)
     abstract fun consultarSaldo()


}