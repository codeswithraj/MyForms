package com.example.myforms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class profiledataActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiledata2)
        val languages = arrayOf<String>("State","AL","AK","AR","CA","FL","GA","IL","IN","MA","MI","NE","NY","IL","IN","MA","MI","NE","NY")

        val spining = findViewById<Spinner>(R.id.spining)
        val adapter = ArrayAdapter(this,R.layout.spin, languages)
        spining.adapter = adapter


    }
}