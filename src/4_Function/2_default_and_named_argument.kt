package `4_Function`

// There are 2 types of arguments in kotlin

// First: Default argument
// there are 3 cases of default arguments

// --1 no arguments are passed while calling a function
//fun formula_1(brand_1:String="Mercedes", brand_2: String="Ferrari", brand_3: String="RB Racing"){
//    println("Fastest car on the grid is: $brand_1")
//    println("Second fastest car on the grid is: $brand_2")
//    println("Third fastest car on the grid is: $brand_3")
//}
//fun main(args: Array<String>){
//    var midfield_brand_1 = "Mcleren"
//    var midfield_brand_2 = "Renault"
//    var midfield_brand_3 = "Alfa Tauri"
//    formula_1()               //<--- Here no arguments are passed so, the default arguments that mention above are used
//}

// --2 some arguments are passed while calling a function
//fun formula_1(brand_1:String="Mercedes", brand_2: String="Ferrari", brand_3: String="RB Racing"){
//    println("Fastest car on the grid is: $brand_1")
//    println("Second fastest car on the grid is: $brand_2")
//    println("Third fastest car on the grid is: $brand_3")
//}
//fun main(args: Array<String>){
//    var midfield_brand_1 = "Mcleren"
//    var midfield_brand_2 = "Renault"
//    var midfield_brand_3 = "Alfa Tauri"
//    formula_1(midfield_brand_1, midfield_brand_2)   // <--- the third parameter does not called, so the default arguments is used
//}

// --3 all arguments are passed while calling a function
fun formula_1(brand_1:String="Mercedes", brand_2: String="Ferrari", brand_3: String="RB Racing"){
    println("Fastest car on the grid is: $brand_1")
    println("Second fastest car on the grid is: $brand_2")
    println("Third fastest car on the grid is: $brand_3")
}
fun main(args: Array<String>){
    var midfield_brand_1 = "Mcleren"
    var midfield_brand_2 = "Renault"
    var midfield_brand_3 = "Alfa Tauri"
    formula_1(midfield_brand_1, midfield_brand_2,midfield_brand_3) // <--- all the parameters are called so it overwrite the default arguments
}
