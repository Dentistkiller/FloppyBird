package com.fake.floppybird

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var startButton: Button
    private lateinit var timeTextView: TextView
    private lateinit var scoreTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        enableEdgeToEdge()
        val score = intent.getIntExtra("score", 0)
        val time = intent.getIntExtra("time", 0)
        Log.d("time", "$time")

        scoreTextView = findViewById(R.id.scoreTextView)
        timeTextView = findViewById(R.id.timeTextView)
        startButton = findViewById(R.id.startBtn)

        scoreTextView.text = "Score: $score"
        timeTextView.text = "Time: $time s"

        startButton.setOnClickListener{
            val i = Intent(this, GameActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}