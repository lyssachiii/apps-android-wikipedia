package org.wikipedia.homeworks.homework08

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.pager2.KViewPagerItem
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class CustomizeItem(matcher: Matcher<View>) : KViewPagerItem<CustomizeItem>(matcher) {
    val headerImage = KImageView(matcher) {
        withId(R.id.view_announcement_header_image)
    }

    val headTextView = KTextView(matcher){
        withId(R.id.view_announcement_text)
    }
    val customizeButton = KButton(matcher){
        withId(R.id.view_announcement_action_positive)
    }

    val gotItButton = KButton(matcher){
        withId(R.id.view_announcement_action_negative)
    }





}