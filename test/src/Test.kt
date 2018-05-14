fun main(args: Array<String>) {
    val valid = listOf(3,6,9)
    val x = 3
    when (x) {
        //in valid -> print("x is valid")
        in 1..10 -> print("in range")
        !in 10..20 -> print("not in rage")
        else -> print("none")
    }
}