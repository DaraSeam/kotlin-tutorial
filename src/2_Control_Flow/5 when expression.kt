package `2_Control_Flow`

import java.util.Scanner;
fun main(args: Array<String>) {

    // Using when as a statement with else –
    var reader = Scanner(System.`in`)
    print("Enter any largebody:")
    var lb = reader.next()

    when(lb) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
        else -> println("I don't know anything about it")
    }

    //Using when as a statement without else –
    var reader1 = Scanner(System.`in`)
    print("Enter name:")
    var lb1 = reader1.next()

    when(lb1) {
        "Sun" -> println("Sun is a Star")
        "Moon" -> println("Moon is a Satellite")
        "Earth" -> println("Earth is a planet")
    }

    //Using when as an expression –
    var reader2 = Scanner(System.`in`)
    print("Enter the month number:")
    var monthOfYear = reader2.nextInt()
    var month = when(monthOfYear){
        1->"January"
        2->"Febuary"
        3->"March"
        4->"April"
        5->"May"
        6->"June"
        7->"July"
        8->"August"
        9->"September"
        10->"October"
        11->"November"
        12->"December"
        else -> {
            println("Not a month of year")
        }
    }
    println(month)

    //
}