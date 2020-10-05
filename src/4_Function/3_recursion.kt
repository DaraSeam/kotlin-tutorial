package `4_Function`

// every recursive function should have terminate condition
// else program executions enter infinite loop and results into stack overflow error.

fun fact(n: Int): Long{
    if (n >= 1){
        return n*fact(n-1)
    }
    else{
        return 1
    }
}
fun main (args: Array<String>){
    println("Factorial of 4 is: "+fact(5))
}

//first step:
//f(4)= 4*f(3)
//f(3)= 3*f(2)
//f(2)= 2*f(1)
//f(1)= 1 according to condition

//second step time to evaluate:
//f(2) = 2*1 = 2
//f(3) = 3*2 = 6
//f(4) = 4*6 = <24> correct!!!