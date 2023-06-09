package com.example.myforms

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class signupimageActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signupimage2)

        val floats = findViewById<Button>(R.id.floatingAction)
        floats.setOnClickListener{
            val intent= Intent(this,signupdarkActivity2::class.java)
            startActivity(intent)
            finish()
        }

        val statess = findViewById<Spinner>(R.id.statesss)
        val languas = arrayOf<String>("Gender","Male","Female","Other")

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

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart Method", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume Method", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause Method", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop Method", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show()
    }

}