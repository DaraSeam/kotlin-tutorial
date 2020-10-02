package `1_Basic`


// if expression
fun main(args: Array<String>){
    var a = 2
    var b = 1
    var c = 3
    var max1 = if(a>b) a else b
    var max2 = if(c>a) c else a
    println("Maximum value between $a and $b is: $max1")
    println("Maximum value between $c and $a is: $max2")
}