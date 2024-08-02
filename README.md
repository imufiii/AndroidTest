basic sample is instrumented testing
this is andriod project2 from group3
-----------------------------------------------------

Group Members: 
Shahryar Salim - 1190183,
 Mufeed Muneer - 1169878,
 Arul Sajeevkumar - 1179098
Anyang Ren- 1180042
----------------------------------------------------
//Code used to finished this project
Local Test Code:
   @Test fun emailValidator_CorrectEmailSample_ReturnsTrue (){
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
    }
    @Test fun emailValidator_CorrectEmailSubDomain_ReturnsTrue (){
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test fun emailValidator_InCorrectEmailSample_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail("23@abc"))
    }
    @Test fun emailValidator_InCorrectEmailSampleDoubleDot_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }
    @Test fun emailValidator_InCorrectEmailSampleNoUserName_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }
    @Test fun emailValidator_InCorrectEmailSampleNoDomain_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }
    @Test fun emailValidator_NoEmail_ReturnsFalse (){
        assertFalse(EmailValidator.isValidEmail(""))
    }
    @Test fun emailValidator_NullEmail_ReturnsFalse () {
        assertFalse(EmailValidator.isValidEmail(null))
    }
InstrumentedTesting Code:
package com.example.android.testing.espresso.BasicSample

import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextBehaviorKtTest {

    @get:Rule
    var activityScenarioRule
    = activityScenarioRule<MainActivity>()

    @Test
    fun sValidateNumberButton() {
        val sNumber
        = "123"
        onView(
            withId(R.id.editTextUserInput)
        )
            .perform(typeText(sNumber),
                closeSoftKeyboard())
        onView(
            withId(R.id.changeTextBt)).perform(click()
            )
        onView(
            withId(R.id.textToBeChanged)).check(matches(withText(sNumber)
            )
            )
    }

    @Test
    fun sValidateNumberActivity() {
        val sNumber
        = "123"
        onView(
            withId(R.id.editTextUserInput))
            .perform(typeText(sNumber), closeSoftKeyboard()
            )
        onView(
            withId(R.id.activityChangeTextBtn)).perform(click()
            )
        onView(
            withId(R.id.show_text_view)).check(matches(withText(sNumber)
            )
            )
    }

    @Test
    fun sValidateNullButton() {
        val sNull
        = ""
        onView(
            withId(R.id.editTextUserInput))
            .perform(typeText(sNull),
                closeSoftKeyboard()
            )
        onView(
            withId(R.id.changeTextBt)).perform(click()
            )
        onView(
            withId(R.id.textToBeChanged)).check(matches(withText(sNull)
            )
            )
    }

    @Test
    fun sValidateNullActivity() {
        val sNull
        = ""
        onView(
            withId(R.id.editTextUserInput)
        )
            .perform(typeText(sNull), closeSoftKeyboard()
            )
        onView(
            withId(R.id.activityChangeTextBtn)).perform(click()
            )
        onView(
            withId(R.id.show_text_view)).check(matches(withText(sNull)
            )
            )
    }

    @Test
    fun sValidateAlphabetButton() {
        val sAlphabet
        = "abcdef"
        onView(
            withId(R.id.editTextUserInput)
        )
            .perform(typeText(sAlphabet),
                closeSoftKeyboard())
        onView(
            withId(R.id.changeTextBt)).perform(click()
            )
        onView(
            withId(R.id.textToBeChanged)).check(matches(withText(sAlphabet)
            )
            )
    }

    @Test
    fun sValidateAlphabetActivity() {
        val sAlphabet
        = "abcdef"
        onView(
            withId(R.id.editTextUserInput)
        )
            .perform(typeText(sAlphabet),
                closeSoftKeyboard())
        onView(
            withId(R.id.activityChangeTextBtn)).perform(click()
            )
        onView(
            withId(R.id.show_text_view)).check(matches(withText(sAlphabet)
            )
            )
    }
}
