package org.wikipedia.homeworks.homework08

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class TopReadRecycler(matcher: Matcher<View>) : KRecyclerItem<TopReadRecycler>(matcher) {

    val listCardNumber = KTextView(matcher){
        withId(R.id.numberView)
    }
    val itemTitle = KTextView(matcher){
        withId(R.id.itemTitle)
    }

    val itemSubtitle = KView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }

    val  itemGraph = KView(matcher){
        withId(R.id.view_list_card_item_graph)
    }

    val itemPageView = KTextView(matcher){
        withId(R.id.view_list_card_item_pageviews)
    }

    val itemImage = KImageView(matcher){
        withId(R.id.view_list_card_item_image)
    }
}