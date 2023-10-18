package com.example.actbanco

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contac")
class conta (
    @PrimaryKey(autoGenerate = true)
    val uid : Int?,
    val nome : String?,
    val time : String?,
    val altura : String?,
)