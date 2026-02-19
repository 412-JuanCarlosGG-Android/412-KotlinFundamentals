package com.example.lib.ejercicios

class Person(val name: String, val age: Int){
    fun sayHello(language:String) {
        if (language == "Spanish") {
            println("Hola soy $name y tengo $age años")
        } else {
            println("Hello I'm $name and I'm $age years old")
        }
    }

    fun caminar(): Double{
        return 10.0
    }
}

// ABSTRACCION
abstract class Shape{
    abstract fun calculateArea(): Double
}

// EXTENDS / IMPLEMENTS
class Square(val side: Double): Shape(){
    override fun calculateArea():Double{
        return side * side
    }
}



fun main(){
    val person = Person("Juan Carlos", 19)
    val person2 = Person(age=29,name="gallegos")
    
    val square = Square(side=10.0)
    println(square.calculateArea())
}