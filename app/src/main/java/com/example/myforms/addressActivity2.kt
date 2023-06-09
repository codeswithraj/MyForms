package com.example.myforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class addressActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address2)
        val langua = arrayOf<String>("California","Arizona","Florida","Massachusetts","New York","Washington")

        val states = findViewById<Spinner>(R.id.statess)
        val adapte = ArrayAdapter(this,R.layout.spin, langua)
        states.adapter = adapte

        val language = arrayOf<String>("United State","Germany","United Kingdom","Australia")

        val state = findViewById<Spinner>(R.id.stating)
        val adapt = ArrayAdapter(this,R.layout.spin, language)
        state.adapter = adapt


    }
}