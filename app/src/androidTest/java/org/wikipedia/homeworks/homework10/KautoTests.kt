package org.wikipedia.homeworks.homework10

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class OnboardingKautomatorTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun onboarding_firstSlide_hasSkipAndContinueButtons() = run {
        step("На первом слайде отображаются кнопки Skip и Continue") {
            OnboardingUiScreen {
                skipButton.isDisplayed()
                skipButton.containsText("Skip")

                continueButton.isDisplayed()
                continueButton.containsText("Continue")
            }
        }
    }

    @Test
    fun onboarding_afterOneContinue_opensSecondSlide() = run {
        step("Нажимает Continue на первом слайде") {
            OnboardingUiScreen {
                continueButton.click()
            }
        }

        step("Проверяет, что открыт второй слайд") {
            OnboardingUiScreen {
                title.isDisplayed()
                title.containsText("New ways to explore")
            }
        }
    }

    @Test
    fun onboarding_afterTwoContinue_opensThirdSlide() = run {
        step("Нажимает Continue два раза") {
            OnboardingUiScreen {
                continueButton.click()
                continueButton.click()
            }
        }

        step("Проверяет, что открыт третий слайд") {
            OnboardingUiScreen {
                title.isDisplayed()
                title.containsText("Reading lists with sync")
            }
        }
    }

    @Test
    fun onboarding_afterThreeContinue_opensLastSlide() = run {
        step("Нажимает Continue три раза") {
            OnboardingUiScreen {
                continueButton.click()
                continueButton.click()
                continueButton.click()
            }
        }

        step("Проверяет, что открыт последний слайд и доступна кнопка Done") {
            OnboardingUiScreen {
                title.isDisplayed()
                title.containsText("Data & Privacy")

                doneButton.isDisplayed()
                doneButton.containsText("Done")
            }
        }
    }
}