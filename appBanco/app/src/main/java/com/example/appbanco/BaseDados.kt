package com.example.appbanco

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [contaCorrente::class], version = 1, exportSchema = false)
abstract class BaseDados: RoomDatabase() {
    abstract fun getMeuMetodoDao(): DAOContaCorrente
    companion object {
        var INSTANCE: BaseDados? = null
        fun getInstance(context: Context): BaseDados {
            if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(
                context.applicationContext,
                BaseDados::class.java,
                "BancoConta.db").build()
        }
            return INSTANCE !!
        }
    }
}