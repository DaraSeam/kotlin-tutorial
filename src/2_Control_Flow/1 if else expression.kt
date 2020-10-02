package `2_Control_Flow`

import java.util.Scanner
// if else expression
fun main(args: Array<String>){
    var a=10
    var b=11
    if (a>b){
        println("$a is greater than $b.")
    }
    else{
        println("$b is greater than $a.")
    }
    println()
    // if else as ternary operator
    var c=2
    var d=3
    var max = if(c>d){
        println("Greater number is: ")
        c
    }
    else{
        println("Greater number is: ")
        d
    }
    println(max)
    println()

    //if-else-if ladder
    //determine whether the number is positive, negative or equal to zero
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    var number = reader.nextInt()
    if (number>0){
        println("The given input is Positive.")
    }
    else if(number<0){
        println("The given input is Negative.")
    }
    else{
        println("The given the number is equal to zero.")
    }
    println()

    //find the largest number between 3 numbers
    val reader1 = Scanner(System.`in`)
    print("Enter 3 numbers: ")
    var num1 = reader1.nextInt()
    var num2 = reader1.nextInt()
    var num3=  reader1.nextInt()

    if(num1>num2){
        if(num1>num3){
            println("$num1 is the greater number.")
        }
        else{
            println("$num3 is the greater number.")
        }
    }
    else if(num2>num1){
        if(num2>num3){
            println("$num2 is the greater number.")
        }
        else{
            println("$num3 is the greater number.")
        }
    }
}