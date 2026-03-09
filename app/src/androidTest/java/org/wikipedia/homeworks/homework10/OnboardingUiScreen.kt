package org.wikipedia.homeworks.homework10

import com.kaspersky.components.kautomator.screen.UiScreen
import com.kaspersky.components.kautomator.component.text.UiButton
import com.kaspersky.components.kautomator.component.text.UiTextView
import com.kaspersky.components.kautomator.component.common.views.UiView

object OnboardingUiScreen : UiScreen<OnboardingUiScreen>() {

    override val packageName: String = "org.wikipedia.alpha"

    val skipButton = UiButton {
        withId(this@OnboardingUiScreen.packageName, "fragment_onboarding_skip_button")
    }

    val continueButton = UiButton {
        withId(this@OnboardingUiScreen.packageName, "fragment_onboarding_forward_button")
    }

    val doneButton = UiButton {
        withId(this@OnboardingUiScreen.packageName, "fragment_onboarding_done_button")
    }

    val title = UiTextView {
        withId(this@OnboardingUiScreen.packageName, "primaryTextView")
    }

    val pageIndicator = UiView {
        withId(this@OnboardingUiScreen.packageName, "view_onboarding_page_indicator")
    }
}