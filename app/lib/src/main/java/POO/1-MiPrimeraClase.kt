package POO

class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun saludar() {
        // TODO: Imprime el saludo
        println("Hola, me llamo $nombre y tengo $edad años.")
    }
    fun esMayorDeEdad(): Boolean {
        // TODO: Regresa true si edad >= 18
        val esMayor = edad >= 18

        if (esMayor) {
            println("$nombre es mayor de edad: true")
        } else {
            println("$nombre es mayor de edad: false")
        }
        return esMayor
    }
}
fun main() {
    val persona1 = Persona("Ana", 20, "Guadalajara")
    val persona2 = Persona("Luis", 15, "León")
    // TODO: Llama los métodos de cada persona

    persona1.saludar()
    persona1.esMayorDeEdad()
    persona2.saludar()
    persona2.esMayorDeEdad()
}