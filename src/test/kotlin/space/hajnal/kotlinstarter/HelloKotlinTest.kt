package space.hajnal.kotlinstarter

import org.junit.jupiter.api.Test
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`

class HelloKotlinTest {

    private val underTest = HelloKotlin()

    @Test
    fun test() {
        val result = underTest.hello()

        assertThat(result, `is`("hello"))
    }

}