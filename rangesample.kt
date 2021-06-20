fun main(){
    val varX = 10
    var varY = 9
    // Check if a number is within a range using in operator:
    if (varX in 1 .. varY+1){
        println("fits in range")
    }
    // Check if a number is out of range:
    val list = listOf("a", "b", "c")

    if(-1 in 0..list.lastIndex){
        println("-1 is out of range")
    }
    if(list.size !in list.indices){
        println("list size is out of valid list indices range, too")
    }
    // Iterating over a range
    for(x in 1..5){
        print("$x ")
    }
    // or over a progression:
    println()
    for(x in 1..10 step 2){
        print("$x ")
    }
    println()
    for (x in 9 downTo 0 step 3){
        print("$x ")
    }
}