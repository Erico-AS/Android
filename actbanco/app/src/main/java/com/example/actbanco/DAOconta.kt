package com.example.actbanco

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAOConta {
    @Insert
    fun inserir(conta: conta)

    @Delete
    fun deletar(conta: conta)

    @Query("Select * from Contac")
    fun buscaTodos(): List<conta>

    @Query("SELECT * FROM ContaC WHERE nome=(:nomecc) and time=(:timecc) and altura=(:alturacc)")
    fun Logar(nomecc: String?, timecc: String?, alturacc: String?): conta?
}