package com.example.appbanco

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contac")
class contaCorrente (
    @PrimaryKey(autoGenerate = true)
    val uid : Int?,
    val nome : String?,
    val cpf : String?,
    val email : String?,
    val senha : String?
)