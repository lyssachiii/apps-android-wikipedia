package org.wikipedia.homeworks.homework08

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import org.wikipedia.R
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher

class NewsRecycler(matcher: Matcher<View>) : KRecyclerItem<NewsRecycler>(matcher) {
    val scrollText = KTextView (matcher){
        withId(R.id.horizontal_scroll_list_item_text)
    }

    val image = KImageView(matcher){
        withId(R.id.horizontal_scroll_list_item_image)
    }
}