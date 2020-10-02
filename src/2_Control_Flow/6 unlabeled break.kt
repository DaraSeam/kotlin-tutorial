package `2_Control_Flow`


fun main(args: Array<String>){

    // sum of number from 1 to 10 by using while loop with unlabeled break
    var i = 1
    var sum = 0
    while(i < Int.MAX_VALUE){ // test expression
        sum+=i
        i+=1
        if(i==11){
            break
        }
    }
    print("Sum of 1 to 10 is $sum.")
}
