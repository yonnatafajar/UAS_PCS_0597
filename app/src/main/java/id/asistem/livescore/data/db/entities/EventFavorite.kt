package id.asistem.livescore.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "favorite")
data class EventFavorite(
    @PrimaryKey(autoGenerate = false)

    @SerializedName("idEvent")
    var eventId: Int?,

    @SerializedName("dateEvent")
    var eventDate: String? = null,

    @SerializedName("strTime")
    var eventTime: String? = null,

    //home

    @SerializedName("idHomeTeam")
    var idHome: String? = null,

    @SerializedName("strHomeTeam")
    var teamHome: String? = null,

    @SerializedName("intHomeScore")
    var scoreHome: String? = null,

    @SerializedName("strHomeFormation")
    var formationHome: String? = null,

    @SerializedName("strHomeGoalDetails")
    var goalHome: String? = null,

    @SerializedName("intHomeShots")
    var shotHome: String? = null,

    @SerializedName("strHomeLineupGoalkeeper")
    var gkHome: String? = null,

    @SerializedName("strHomeLineupDefense")
    var defHome: String? = null,

    @SerializedName("strHomeLineupMidfield")
    var midHome: String? = null,

    @SerializedName("strHomeLineupForward")
    var forwHome: String? = null,

    //away

    @SerializedName("idAwayTeam")
    var idAway: String? = null,

    @SerializedName("strAwayTeam")
    var teamAway: String? = null,

    @SerializedName("intAwayScore")
    var scoreAway: String? = null,

    @SerializedName("strAwayFormation")
    var formationAway: String? = null,

    @SerializedName("strAwayGoalDetails")
    var goalAway: String? = null,

    @SerializedName("intAwayShots")
    var shotAway: String? = null,

    @SerializedName("strAwayLineupGoalkeeper")
    var gkAway: String? = null,

    @SerializedName("strAwayLineupDefense")
    var defAway: String? = null,

    @SerializedName("strAwayLineupMidfield")
    var midAway: String? = null,

    @SerializedName("strAwayLineupForward")
    var forwAway: String? = null


    )
