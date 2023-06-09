package com.example.myforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner

class EcommerceActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ecommerce2)
        val langua = arrayOf<String>("State","California","Arizona","Florida",
            "Massachusetts","New York","Washington")

        val states = findViewById<Spinner>(R.id.statess)
        val adapte = ArrayAdapter(this,R.layout.spin, langua)
        states.adapter = adapte

    }
}