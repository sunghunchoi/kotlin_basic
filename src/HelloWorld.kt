fun main(args: Array<String>) {
    print("Hello ")
    print("World!")
    println("Hello World!")
    println(42)
    println(sum(2, 3))
    println(sum2(3,5))
    voidFuncEx(10,20)
    makeReadOnlyLocalVariables()
    makeReassignedVar()
}

fun sum(a: Int, b: Int):Int {
    return a + b
}

fun sum2(a: Int, b:Int) = a + b

fun voidFuncEx(a: Int, b:Int) {
    println("sum of $a and $b is ${a+b}")
}

fun makeReadOnlyLocalVariables() {
    println("running makeReadOnlyLocalVariables keyword by val")
    val a: Int = 1
    val b = 2
    // b = 4
    // val can't be reassigned
    val c: Int
    c = 3
    println(a)
    println(b)
    println(c)
}

fun makeReassignedVar() {
    var x = 5
    x += 1
    println(x)
}