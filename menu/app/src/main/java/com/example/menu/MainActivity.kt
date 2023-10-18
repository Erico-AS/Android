package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.itemAdd -> {
                println("Adicionar")
                Toast.makeText(this, "Menu Add clicado", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.itemDelete -> {
                println("Adicionar")
                Toast.makeText(this, "Menu Delete clicado", Toast.LENGTH_SHORT).show()
                true
            }

            R.id.itemEdit -> {
                println("Adicionar")
                Toast.makeText(this, "Menu Edit clicado", Toast.LENGTH_SHORT).show()
                true
            }

            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }
}