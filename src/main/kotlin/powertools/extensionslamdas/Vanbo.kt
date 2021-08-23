package powertools.extensionslamdas

import atomictest.eq

fun main() {
    va("hello", 2) eq "hellohellohellohello"
    va("hello", 2) eq "hellohellohellohello"
    vb("hello", 2) eq "hellohellohellohello"
    // "hello".va(2) doesn't compile
}

val va: (String, Int) -> String = { str, n ->
    str.repeat(n) + str.repeat(n)
}
val vb: String.(Int) -> String = {
    this.repeat(it) + repeat(it)
}