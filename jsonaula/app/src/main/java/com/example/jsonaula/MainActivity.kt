package com.example.jsonaula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    lateinit var dadosAluno : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dadosAluno = findViewById(R.id.lblTexto)

        val jsonData = applicationContext.resources.openRawResource(
            applicationContext.resources.getIdentifier(
                "json", "raw", applicationContext.packageName
            )
        ).bufferedReader().use { it.readText() }
        val outputJsonString = JSONObject(jsonData)
        Log.d("TAG_DATA", "" + outputJsonString)

        val posts = outputJsonString.getJSONArray("dadosAluno") as  JSONArray

        for (i in 1  until  posts.length()) {
            val disciplinaj = posts.getJSONObject (i).get("disciplina")
            val nomej = posts.getJSONObject (i).get("nome")
            val turmaj = posts.getJSONObject (i).get("turma")
            val turnoj = posts.getJSONObject (i).get("turno")

            var dados = "\nDisciplina->$disciplinaj\nNome->$nomej\nTurma->$turmaj\nTurno->$turnoj\n"
            var ver = dadosAluno.text
            dadosAluno.text = ver.toString()+dados

        }
    }
}
