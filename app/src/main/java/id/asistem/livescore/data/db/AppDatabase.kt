package id.asistem.livescore.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import id.asistem.livescore.data.db.dao.FavoriteDao
import id.asistem.livescore.data.db.entities.EventFavorite

@Database(
    entities = [EventFavorite::class],
    version = 2
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun getFavoriteDao(): FavoriteDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: builDatabase(context).also {
                instance = it
            }
        }

        private fun builDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            "LiveScore"
        ).allowMainThreadQueries().build()
    }
}