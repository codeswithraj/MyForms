package com.example.myforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class withiconActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withicon2)
        val languages = arrayOf<String>("Phone Type")

        val spining = findViewById<Spinner>(R.id.spining)
        val adapter = ArrayAdapter(this,R.layout.spin, languages)
        spining.adapter = adapter
        val lang = arrayOf<String>("Email Type")

        val spin = findViewById<Spinner>(R.id.spini)
        val adapt = ArrayAdapter(this,R.layout.spin, lang)
        spin.adapter = adapt
    }
}