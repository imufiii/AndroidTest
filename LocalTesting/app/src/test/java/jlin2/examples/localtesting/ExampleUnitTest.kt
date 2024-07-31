package jlin2.examples.localtesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test fun emailValidator_CorrectEmailSample_ReturnsTrue (){
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }
    @Test fun emailValidator_CorrectEmailSubDomain_ReturnsTrue (){
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test fun emailValidator_InCorrectEmailSample_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail("23@abc"))
    }
}