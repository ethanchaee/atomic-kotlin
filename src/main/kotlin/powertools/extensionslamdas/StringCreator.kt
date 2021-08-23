package powertools.extensionslamdas

import atomictest.eq

private fun messy(): String {
    val built = StringBuilder()
    built.append("ABCs: ")
    ('a'..'x').forEach { built.append(it) }
    return built.toString()
}

private fun clean() = buildString {
    append("ABCs: ")
    ('a'..'x').forEach { append(it) }
}

private fun cleaner() =
    ('a'..'x').joinToString("", "ABCs: ")

fun main() {
    messy() eq "ABCs: abcdefghijklmnopqrstuvwx"
    messy() eq clean()
    messy() eq cleaner()
}