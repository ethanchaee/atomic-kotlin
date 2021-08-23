package powertools.extensionslamdas

import atomictest.eq

fun main() {
    lambdaUnitReturn()
}

fun unitReturn(lambda: A.() -> Unit) =
    A().lambda()

fun nonUnitReturn(lambda: A.() -> String) =
    A().lambda()

fun lambdaUnitReturn() {
    unitReturn {
        "Unit ignores the return value" +
                "So it can be anything..."
    } eq Unit
    unitReturn { 1 } eq Unit
    unitReturn {  } eq Unit
    nonUnitReturn {
        "Must return the proper type"
    } eq "Must return the proper type"
    // nonUnitReturn {  } Not an option
}
