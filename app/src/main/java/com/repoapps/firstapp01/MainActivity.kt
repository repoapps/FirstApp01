package com.repoapps.firstapp01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_title_01)

        findViewById<Button>(R.id.btnBaam)
            .setOnClickListener {
                Toast.makeText(applicationContext,R.string.app_button_log,Toast.LENGTH_SHORT).show()
            }

    }
}
