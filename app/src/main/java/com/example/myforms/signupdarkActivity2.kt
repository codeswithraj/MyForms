package com.example.myforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class signupdarkActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupdark2)
        val languas = arrayOf<String>("Age","< 17","17-25","26-40","40 <")

        val statess = findViewById<Spinner>(R.id.statesss)
        val adaptes = ArrayAdapter(this,R.layout.spins, languas)
        statess.adapter = adaptes


        val langua = arrayOf<String>("Gender","Male","Female","Other")

        val statesss = findViewById<Spinner>(R.id.statessss)
        val adaptess = ArrayAdapter(this,R.layout.spins, langua)
        statesss.adapter = adaptess

        val language = arrayOf<String>("Country","United State","Germany","United kingdom","Australia")

        val state = findViewById<Spinner>(R.id.state)
        val adapt = ArrayAdapter(this,R.layout.spins, language)
        state.adapter = adapt
    }

}