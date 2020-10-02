package `2_Control_Flow`


fun main(args: Array<String>){

    //print number from 1 to 10
    var num = 1
    while (num<=10){
        println(num)
        num+=1
    }
    println()

    // print element of an array using while loop
    var car = arrayOf("Ferrari","Mercedes","RB racing","Mclaren","Renault","William")
    var index = 0

    while(index<car.size){
        println(car[index])
        index+=1
    }
}