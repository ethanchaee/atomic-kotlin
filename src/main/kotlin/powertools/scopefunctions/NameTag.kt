package powertools.scopefunctions

import atomictest.trace

val functions = listOf(
    fun(name: String?) {
        name
            ?.takeUnless { it.isBlank() }
            ?.let { trace("$it in let") }
    },
    fun(name: String?) {
        name
            ?.takeUnless { it.isBlank() }
            ?.run { trace("$this is run") }
    },
    fun(name: String?) {
        name
            ?.takeUnless { it.isBlank() }
            ?.apply { trace("$this is apply") }
    },
    fun(name: String?) {
        name
            ?.takeUnless { it.isBlank() }
            ?.also { trace("$it is also") }
    },
)

fun main() {
    functions.forEach { it(null) }
    functions.forEach { it("   ") }
    functions.forEach { it("Yumyulack") }
    trace eq """
        Yumyulack in let
        Yumyulack is run
        Yumyulack is apply
        Yumyulack is also
    """
}