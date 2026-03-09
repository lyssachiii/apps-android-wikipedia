package org.wikipedia.homeworks.homework09

import androidx.appcompat.widget.AppCompatImageButton
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object OnboardingScreen : KScreen<OnboardingScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val skipButton = KButton { withText("Skip") }
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

object CustomizeFeedScreen : KScreen<CustomizeFeedScreen>() {
    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null

    val screenTitle = KTextView {
        withText(R.string.feed_configure_activity_title)
    }

    val featuredArticleOption = KView {
        withText(R.string.feed_item_type_featured_article)
    }

    val backButton = KImageView {
        withParent { withId(R.id.toolbar) }
        isInstanceOf(AppCompatImageButton::class.java)
    }
}