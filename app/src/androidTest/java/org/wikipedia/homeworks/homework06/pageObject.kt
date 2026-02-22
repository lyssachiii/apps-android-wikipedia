package org.wikipedia.homeworks.homework06

import androidx.appcompat.widget.AppCompatImageView
import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.check.KCheckBox
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

object ThemeScreen: KScreen<ThemeScreen>() {

    override val layoutId: Int? = null
    override val viewClass: Class<*>? = null


    val topReading = KTextView {
        withId(R.id.textSettingsCategory)
    }

    val fontSizePercent = KTextView {
        withId(R.id.text_size_percent)
    }

    val smallFontButton = KTextView {
        withId(R.id.buttonDecreaseTextSize)
    }

    val bigFontButtonButton = KTextView {
        withId(R.id.buttonIncreaseTextSize)
    }

    val textSizeSlider = KView {
        withId(R.id.text_size_seek_bar)
    }

    val sansSerifButton = KButton {
        withId(R.id.button_font_family_sans_serif)
    }

    val serifButton = KButton {
        withId(R.id.button_font_family_serif)
    }

    val specsIcon = KImageView {
        withParent {
            withId(R.id.readingFocusModeContainer)
        }
        isInstanceOf(AppCompatImageView::class.java)
    }

    val focusModeSwitch = KCheckBox {
        withId(R.id.theme_chooser_reading_focus_mode_switch)
    }

    val focusModeDescription = KTextView {
        withId(R.id.theme_chooser_reading_focus_mode_description)
    }

    val themeTitle = KTextView {
        withText(R.string.color_theme_select)
    }

    val lightThemeButton = KTextView {
        withId(R.id.button_theme_light)
    }

    val sepiaThemeButton = KTextView {
        withId(R.id.button_theme_sepia)
    }

    val darkThemeButton = KTextView {
        withId(R.id.button_theme_dark)
    }

    val blackThemeButton = KTextView {
        withId(R.id.button_theme_black)
    }

    val matchSystemThemeSwitch = KCheckBox {
        withId(R.id.theme_chooser_match_system_theme_switch)
    }

    val imageDimmingSwitch = KCheckBox {
        withId(R.id.theme_chooser_dark_mode_dim_images_switch)
    }
}