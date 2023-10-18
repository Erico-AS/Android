package com.example.appbanco

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DAOContaCorrente {
    @Insert
    fun inserir(contaCorrente: contaCorrente)

    @Delete
    fun deletar(contaCorrente: contaCorrente)

    @Query("Select * from Contac")
    fun buscaTodos(): List<contaCorrente>

    @Query("SELECT * FROM ContaC WHERE cpf=(:cpfcc) and senha=(:senhacc)")
    fun Logar(cpfcc: String?, senhacc: String?): contaCorrente?
}