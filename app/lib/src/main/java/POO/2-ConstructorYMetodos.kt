package POO

class CuentaBancaria(val titular: String) {
    var saldo: Double = 0.0
    fun depositar(cantidad: Double) {
    saldo += cantidad
    }
    fun retirar(cantidad: Double) {
        if (saldo - cantidad < 0){
            println("saldo insuficiente")
        } else {
            saldo -= cantidad
        }
    }
    fun mostrarSaldo() {
        println("tu saldo es de: $saldo pesos")
    }
}
fun main() {
    val cuenta = CuentaBancaria("María García")
    cuenta.depositar(1000.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0) // No debe permitirlo
    cuenta.mostrarSaldo()
}