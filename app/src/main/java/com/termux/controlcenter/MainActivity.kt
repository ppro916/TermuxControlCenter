package com.termux.controlcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.btn_usb).setOnClickListener {
            Toast.makeText(this, "USB Manager", Toast.LENGTH_SHORT).show()
        }
        
        findViewById<Button>(R.id.btn_network).setOnClickListener {
            Toast.makeText(this, "Network Tools", Toast.LENGTH_SHORT).show()
        }
    }
}
