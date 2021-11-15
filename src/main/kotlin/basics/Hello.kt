package basics

fun main() {
    println("sum of 19 and 23 is ${sum(19, 23)}")
    print("hello world")
    var abdul = Student("tanveer",123,678)
    var harish : Student = Student("harish",12,43)
    println(harish.name)
    println("max of 0 and 42 is ${maxOf(0, 42)}")

}

fun sum(a: Int, b: Int) = a+b
fun maxOf(a: Int, b: Int) = if (a > b) a else b
