package id.asistem.livescore.ui.favorite

import id.asistem.livescore.data.db.entities.EventFavorite

interface ClickListener {
    fun onClickListener(eventFavorite: EventFavorite)
}