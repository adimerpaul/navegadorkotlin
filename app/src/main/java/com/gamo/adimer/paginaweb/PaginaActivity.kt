package com.gamo.adimer.paginaweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button
import android.widget.Toast

class PaginaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina)
        val button=findViewById<Button>(R.id.button2)
        val web=findViewById<WebView>(R.id.web)

        val bundle=intent.extras
        val dato=bundle?.getString("direccion")

        Toast.makeText(this,dato,Toast.LENGTH_SHORT).show()
        web.loadUrl("https://${dato}")


        button.setOnClickListener {
            finish()
        }
    }
}