fun main() {
    val items = listOf("apple", "banana", "kiwifruit")
    println("For-loop example without indices:")
    for (item in items){
        println(item)
    }
    // or
    println("For-loop example with indices:")
    for(index in items.indices){
        println("item at $index is ${items[index]}")
    }

    println("While-loop example:")

    var index = 0
    while(index < items.size){
        println("item at $index is ${items[index]}")
        index++
    }
}