package `2_Control_Flow`

fun main(args: Array<String>){

    // continue with while
    var num = 0
    while (num <= 12){
        if (num % 3 == 0){
            num++
            continue
        }
        println(num)
        num++
    }
    println()

    // continue with do while
    var num1 = 1
    do{
        if (num1 <= 5 || num1 >= 15){
            num1++
            continue
        }
        println(num1)
        num1++
    } while (num1<20)
}