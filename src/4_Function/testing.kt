package `4_Function`
import java.util.Scanner


fun sum(num1:Int,num2:Int):Int{
    return num1 + num2
}
fun main(args: Array<String>){
    val reader = Scanner(System.`in`)
    print("Enter the first number: ")
    var num1 = reader.nextInt()

    val reader1 = Scanner(System.`in`)
    print("Enter the first number: ")
    var num2 = reader1.nextInt()

    val result = sum(num1,num2)
    println("Sum between number 1 and number 2 is: $result")
}


