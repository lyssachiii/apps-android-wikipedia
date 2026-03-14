package org.wikipedia.homeworks.homework11

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object OnboardingScreen : KScreen<OnboardingScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton { withText("Skip") }
}

object OnboardingRuScreen : KScreen<OnboardingRuScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton { withText("Пропустить") }
}

object ExploreScreen : KScreen<ExploreScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val featuredArticleBlock = KTextView {
        withText(R.string.view_featured_article_card_title)
    }

    val customizeButton = KButton {
        withText(R.string.feed_configure_onboarding_action)
    }
}