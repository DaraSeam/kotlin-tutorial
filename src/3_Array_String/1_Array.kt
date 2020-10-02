package `3_Array_String`

fun main(args: Array<String>){

    //creating array using arrayOf()
    val num = arrayOf(1,2,3,4,5) // or arrayOf<Int>(1,2,3,4,5)
    for (i in num){
        print(" $i")
    }
    println()

    //array constructor
    val num1 = Array(5, {i -> i*1})
    for (i in num1){
        print(" $i")
    }
    println()

    //accessing and modifying array
    //using get() method
    val num2 = arrayOf(1,2,3,4,5)
    var get = num2.get(2)
    println(get)
    println()

    //using set() method
    num2.set(0,22)
    println(num2.get(0))
    println()

    //modify an array
    num2[2] = 10
    println(num2[2]) // change from 2 to 10
    println()
}