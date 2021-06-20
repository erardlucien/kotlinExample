// Give the big-one as result.
fun maxOf0(a: Int, b: Int): Int{
    if(a > b){
        return a
    }else{
        return b
    }
}
// Give the big-one as result.
// 'if' is use here as expression.
fun maxOf1(a: Int, b: Int) = if(a > b) a else b

fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

fun printProduct(arg1: String, arg2: String){
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // 'x * y' yields error because they hold nulls.
    if(x != null && y != null){
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }
    else{
        println("'$arg1' or '$arg2' is not a number")
    }
}

fun main(){
    println(" max of 0 and 42 is ${maxOf0(0, 42)}")
    println(" max of 0 and 42 is ${maxOf1(0, 42)}")
    printProduct("6", "7")
    printProduct("a", "7")
    printProduct("a", "b")
    var varB = 234;
    val constVarB = varB.toString().length
    val hello = "Hello World!\nHow are you doing?"
    println("Lenght of '$varB':$constVarB ${"\n"}Lenght of '$hello': ${"\n"} ${hello.length}")
}
