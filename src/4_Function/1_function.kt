package `4_Function`

import kotlin.math.sqrt

// function is a unit code that performs a special tasks.
// there are 2 types of function:

fun main(args: Array<String>){
    // 1 standard library function

    var sum = arrayOf(1,2,3,4,5,6,7).sum()
    println("sum of all arrays is $sum")
    println()

    var num1 = 8
    var num2 = 4
    var reminder = num1.rem(num2)
    println("reminder of num1 over num2 is: $reminder")
    println()

    // 2 user defined function
    // first example

    fun mul(a:Int,b:Int):Int{
        return a.times(b)
    }
    var mul = mul(3,4)
    println("Multiply of a and b is: $mul")
    println()

    // second example

    fun student_info(name: String, age: Int, gender: Char) {
        println("Student's name: $name")
        println("Student's age: $age")
        println("Student's gender: $gender")
    }
    student_info("Dara Seam", 18, 'M')
}

















