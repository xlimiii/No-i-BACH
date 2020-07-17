package com.example.noibach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        buttonStart.setOnClickListener{
            val intent = Intent(this, SongActivity::class.java)
            startActivity(intent)
        }
    }
}