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

    val rectangle = Rectangle(5.0 , 5.0)
    println("The perimeter is ${rectangle.perimeter}")

    println(maxOf(10, 20))
    println(maxOf2(10, 20))
    forLoopTest()
    forLoopTest2()

    println(whenExpression(1))
    RangesTestFun()
    CheckIfNumberIsOutOfRange()
    LiterateOverRange()
    CollectionTest()
    LambdaTest()
    printProduct("a","b")
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

    val PI = 3.14
    var y = 0
    fun incrementY() {
        y += 1
    }
    incrementY()
    println(y)
}

fun maxOf(a: Int, b:Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun maxOf2(a: Int, b: Int) = if(a > b) a else b

fun forLoopTest() {
    val items = listOf<String>("apple","banana","kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun forLoopTest2() {
    val items = listOf<String>("apple","banana","kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whenExpression(obj: Any): String =
    when(obj) {
        1       -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }

fun RangesTestFun() {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("x is fits in range")
    }
}

fun CheckIfNumberIsOutOfRange() {
    val list = listOf<String>("a","b","c")
    if (-1 in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}

fun LiterateOverRange() {
    for (x in 1..5) {
        println(x)
    }
    // Over a progression.
    println("over a progression")
    for (x in 1..10 step 2) {
        println(x)
    }
    for (x in 9 downTo 0 step 3) {
        println(x)
    }
}

fun CollectionTest() {
    val items = listOf<String>("apple","banana","orange")
    for (item in items) {
        println(item)
    }
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine to")
    }
}

fun LambdaTest() {
    val fruits = listOf("banana","avocado","apple","kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach{println(it)}
}

fun NullableValues() {
    // A reference must be explicitly marked as nullable when null value is possible.
    // Nullable type names have ? at the end.
    // fun parseInf(str: String): Int? {
    //    return null
    // }
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // Using `x * y` yields error because the may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x*y)
    }
    else {
        println("'$arg1' or '$arg2' is not a number.")
    }
}

fun parseInt(str: String): Int? {
    return null
}

fun TypeCheckAndAutomaticCastTest() {
    // The is operator checks if an expression is an instance of a type.
    // If an immutable local variable or property is checked for a specific type,there's no need to cast it explicitly




}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun getStringLength2(obj: Any): Int? {
    if (obj !is String) return null
    // 'obj' is automatically cast to `String` in this branch
    return obj.length
}

fun getStringLength3(obj:Any): Int? {
    // `obj` is automatically cast to `String` on the right-hand side of `&&`
    if (obj is String && obj.length > 0) {
        return obj.length
    }
    return null
}