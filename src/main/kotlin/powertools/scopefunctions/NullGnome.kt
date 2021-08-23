package powertools.scopefunctions

import atomictest.trace

fun whichGnome(gnome: Gnome?) {
    trace(gnome?.name)
    gnome?.let { trace(it.who()) }
    gnome?.run { trace(who()) }
    gnome?.apply { trace(who()) }
    gnome?.also { trace(it.who()) }
}

fun main() {
    whichGnome(Gnome("Bob"))
    whichGnome(null)     // null 이면 scopeFunction 이 실행되지 않음
    trace eq """
Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
Gnome: Bob
null
    """
}