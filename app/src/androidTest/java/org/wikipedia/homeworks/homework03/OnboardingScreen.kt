package org.wikipedia.homeworks.homework03

import android.widget.FrameLayout
import org.wikipedia.R
import android.widget.LinearLayout
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.views.AppTextView

val fullView = listOf(
    NestedScrollView::class.java,
    R.id.scrollView
)

val contentLayout = listOf(
    LinearLayout::class.java,
    R.id.scrollViewContainer
)

val wikiSphereImage = listOf(
    AppCompatImageView::class.java,
    R.id.imageViewCentered,
)

val introText = listOf(
    AppTextView::class.java,
    R.id.primaryTextView,
    R.string.onboarding_welcome_title_v2
)

val foundLanguagesHeading = listOf(
    AppTextView::class.java,
    R.id.secondaryTextView,
)

val foundLanguagesList = listOf(
    RecyclerView::class.java,
    R.id.languagesList
)

val englishLanguage = listOf(
    AppTextView::class.java,
    R.id.option_label,
    R.string.onboarding_multilingual_secondary_text
)

val addOrEditLanguagesButton = listOf(
    MaterialButton::class.java,
    R.id.addLanguageButton,
    R.string.onboarding_multilingual_add_language_text
)

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button,
    R.string.onboarding_skip
)

val tabLayout = listOf(
    TabLayout::class.java,
    R.id.view_onboarding_page_indicator
)

val continueButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_forward_button,
    R.string.onboarding_continue
)