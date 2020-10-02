package `2_Control_Flow`

import java.util.Scanner

fun main(args: Array<String>){

    // factorial of given number
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var number = reader.nextInt()
    var factorial = 1

    do{
        factorial*=number // factorial = factorial * number
        number-=1
    }while(number>0)
    println("Factorial of $number is $factorial.")
    println()

    //print table of 2 using do while loop
    var num = 2
    var i = 1
    do{
        println("$num * $i = "+(num*i))
        i += 1
    }while(i<11)
}