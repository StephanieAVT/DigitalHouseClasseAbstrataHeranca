package br.com.digitalhousekotlin

class Teste {
}

fun main() {
    val titular1 = Cliente(1, "Joao", "Silva", "mg123", 1234)
    val conta1 = ContaPoupanca(1,200.50f,titular1)
    val conta2 = ContaCorrente(2,100f,titular1)

    conta1.depositar(100f)
    conta1.sacar(5f)
    conta1.consultarSaldo()
    conta1.recolherJuros()

    val cheque1 = Cheque(1000.0f,"Caixa","14/9/2020")
    conta2.consultarSaldo()
    cheque1.depositarCheque(conta2)







}