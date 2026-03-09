package org.wikipedia.homeworks.homework09

import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.wikipedia.main.MainActivity

class ExploreFeedTest : TestCase() {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun disableFeaturedArticle() = run {
        step("Нажимает Skip на экране онбординга") {
            OnboardingScreen {
                skipButton.click()
            }
        }

        step("Проверяет отображение блока Featured Article") {
            ExploreScreen {
                featuredArticleBlock.isDisplayed()
            }
        }

        step("Нажимает на кнопку Customize в блоке Customize your Explore feed") {
            ExploreScreen {
                customizeButton.click()
            }
        }

        step("Отключает Featured Article") {
            CustomizeFeedScreen {
                screenTitle.isDisplayed()
                featuredArticleOption.click()
            }
        }

        step("Нажимает стрелку назад в верхнем тулбаре") {
            CustomizeFeedScreen {
                backButton.click()
            }
        }

        step("Проверяет, что блок Featured Article не отображается на экране Explore") {
            ExploreScreen {
                featuredArticleBlock.doesNotExist()
            }
        }
    }
}