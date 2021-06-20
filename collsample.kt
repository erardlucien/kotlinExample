// collsample := collectionsample
fun main(){
    val items = listOf("apple", "banana", "kiwifruit")
    // Iterating over collection:
    for (item in items){
        println(item)
    }
    // Checking if a collection contains an object using in operator:
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    // Using lambda expressions to filter and map collections:
    val fruits = listOf("banana", "avocado", "apple", "kiwwifruit")
    fruits
      .filter { it.startsWith("a") }
      .sortedBy { it }
      .map { it.uppercase() }
      .forEach { println(it) }
}