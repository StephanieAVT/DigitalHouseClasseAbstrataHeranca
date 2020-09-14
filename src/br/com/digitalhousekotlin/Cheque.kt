package br.com.digitalhousekotlin

class Cheque(var valor:Float,var bancoEmissor:String,var dataDePagamento:String) {
    fun depositarCheque(conta: Conta){
        conta.depositar(valor)
        println("Data do pagamento foi: $dataDePagamento")
        println("Banco emissor do pagamento foi: $bancoEmissor")
        
    }
}