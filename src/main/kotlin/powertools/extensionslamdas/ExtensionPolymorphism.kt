package powertools.extensionslamdas

import atomictest.eq

open class Base {
    open fun f() = 1
}

class Derived : Base() {
    override fun f(): Int = 99
}

fun Base.g() = f()

fun Base.h(x1: Base.() -> Int) = x1()

fun main() {
    val b: Base = Derived() // upcast
    b.g() eq 99
    b.h { f() } eq 99
}