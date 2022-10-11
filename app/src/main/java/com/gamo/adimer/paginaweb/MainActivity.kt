package com.gamo.adimer.paginaweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buton=findViewById<Button>(R.id.button)
        val et1=findViewById<EditText>(R.id.et1)
        buton.setOnClickListener {
            val intent=Intent(this,PaginaActivity::class.java)
            intent.putExtra("direccion",et1.text.toString())
            startActivity(intent)
        }
    }
}