package com.example.assignments.assignment_2

fun main() {
    val f = Functions()

    var Fahrenheit = f.fahrenheit(1.5)
    println("Fahrenheit: $Fahrenheit")

    var Perimeter = f.perimeter(1.2, 1.3)
    println("Perimeter of Rectangle: $Perimeter")

    var Factorial = f.factorial(5)
    println("Factorial: $Factorial")

    var Letter = f.counter("Nur Kumbasar")
    println("Number of letter in Word: $Letter")

    var Angle = f.angles(8)
    println("Sum of Interior Angles according to Edge number: $Angle")

    var Wage = f.wage(25)
    println("Wage: $Wage")

    var Cost = f.cost(100)
    println("GB Cost: $Cost")

}