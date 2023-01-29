package com.example.vibecapandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class VibeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vibe_detail)

        val toolbar = findViewById<Toolbar>(R.id.toolBar_top)
        setSupportActionBar(toolbar)
        val ab = supportActionBar!!
        ab.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(false)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            val id = item.itemId
            when (id) {
                android.R.id.home -> {
                    finish()
                    return true
                }
                else -> {}
            }
        
        return super.onOptionsItemSelected(item)
    }
}