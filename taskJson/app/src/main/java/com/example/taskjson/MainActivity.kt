package com.example.taskjson

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    lateinit var j : TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        j = findViewById(R.id.txtJson)

        val jsonData = applicationContext.resources.openRawResource(
            applicationContext.resources.getIdentifier(
                "json", "raw", applicationContext.packageName
            )
        ).bufferedReader().use { it.readText() }
        val outputJsonString = JSONObject(jsonData)
        Log.d("TAG_DATA", "" + outputJsonString)

        val posts = outputJsonString.getJSONArray("times") as JSONArray

        for (i in 0  until  posts.length()) {
            val nomej = posts.getJSONObject (i).get("Nome")
            val cidadej = posts.getJSONObject (i).get("Cidade")
            val estadioj = posts.getJSONObject (i).get("Estádio")
            val fundj = posts.getJSONObject (i).get("Fundação")

            var dados = "\nNome->$nomej\nCidade->$cidadej\nEstádio->$estadioj\nFundação->$fundj\n"
            var ver = j.text
            j.text = ver.toString()+dados

        }
    }
}