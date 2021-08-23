package powertools

import io.kotest.core.spec.style.StringSpec



val va: (String, Int) -> String = { str, n ->
    str.repeat(n) + str.repeat(n)
}

val vb: String.(Int) -> String = {
    this.repeat(it) + repeat(it)
}