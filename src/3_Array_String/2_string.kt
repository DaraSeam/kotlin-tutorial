package `3_Array_String`

fun main(args: Array<String>){

    // how to create an empty string
    var empty_string = String()
    println(empty_string)
    println()

    //--------------------------------------------

    // access string
    var string = "DaraSeam"
    print(string[3])
    println()

    //--------------------------------------------

    //loop through string
    var string1 = "Hello World"
    for (i in string1.indices){
        print(string1[i]+" ")
    }
    println()

    //--------------------------------------------

    //important properties and function
    var string2 = "DaraSeam"
    var string3 = "Dara"

    // length return length of the string
    println(string2.length)
    println()

    //subSequence(start,end) return
    println(string2.subSequence(2,4))
    println()

    //compareTo compare the size
    println(string3.compareTo(string2))
    println()
    //--------------------------------------------

    //string literal
    //escaped string

    val string4 = " Hello \n my \n dear \n old \n friend"
    println(string4)
    println()

    //raw string
    val string5 = """Hello
        |my
        |dear
        |old
        |friend
    """.trimMargin()
    println(string5)
    println()
}