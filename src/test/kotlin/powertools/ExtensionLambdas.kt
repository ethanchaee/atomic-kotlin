package powertools

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class ExtensionLambdas : StringSpec({
    "test" {
        1 + 2 shouldBe 3
    }
})