package id.asistem.livescore.ui.favorite

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import id.asistem.livescore.LiveScore.Companion.db
import id.asistem.livescore.R
import id.asistem.livescore.data.db.entities.EventFavorite
import id.asistem.livescore.data.model.Event
import id.asistem.livescore.ui.detail.EventDetailActivity
import id.asistem.livescore.ui.event.EventAdapter
import id.asistem.livescore.ui.event.EventPresenter
import org.jetbrains.anko.support.v4.startActivity

class FavoriteFragmentt : Fragment() {

    private lateinit var recyclerView: RecyclerView
    val fav = db.getFavoriteDao().getAll()
    private lateinit var adapter: FavoriteAdapter
    lateinit var del: FloatingActionButton;

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_favorite_fragmentt, container, false)
        recyclerView = view.findViewById(R.id.listFavorite)
        del = view.findViewById(R.id.fbDel)

        adapter = FavoriteAdapter(requireContext(), fav) {
            startActivity<EventDetailActivity>(
                "id" to "${it.eventId}",
                "idhome" to "${it.idHome}",
                "idaway" to "${it.idAway}"
            )
            Log.d("test",it.eventId.toString()+ "||" +  it.idHome.toString() + "||" +  it.idAway.toString())
        }
        recyclerView.adapter = adapter

        del.setOnClickListener {
            db.getFavoriteDao().deleteAll()
        }

        return view
    }
}