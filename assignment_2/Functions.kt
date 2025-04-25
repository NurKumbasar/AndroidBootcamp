package com.example.assignments.assignment_2

class Functions {

    // C -> F
    fun fahrenheit(c : Double) : Double {
        var f = (c * 1.8) + 32
        return f
    }

    fun perimeter(height : Double, width: Double) : Double {
        var p = 2 * (height + width)
        return p
    }

    fun factorial(number: Int): Int {
        var result = 1
        for (i in 1..number) {
            result = result * i
        }
        return result
    }

    fun counter(word : String) : Int {
        var count = 0
        for(char in word) {
            count++
        }
        return count
    }

    // Sum of Interior Angles according to Edge number
    fun angles(edge : Int) : Int {
        var angle = (edge - 2) * 180
        return angle
    }

    fun wage(day : Int) : Int {
        if((day * 8) <= 160) {
            return day * 8 * 10
        } else {
            var work = 160 * 10
            var shift = ((day * 8) - 160) * 20
            return work + shift
        }
    }

    fun cost(gb : Int) : Int {
        var price = 100
        if(gb <= 50) {
            return price
        } else {
            price = ((gb - 50) * 4) + 100
            return price
        }
    }
}