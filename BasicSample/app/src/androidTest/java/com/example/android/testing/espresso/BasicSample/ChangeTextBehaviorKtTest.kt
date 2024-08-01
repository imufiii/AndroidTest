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
