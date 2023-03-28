package com.example.masakanku

import android.content.Intent
import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setLogo(R.drawable.ic_back1)
        supportActionBar?.setDisplayUseLogoEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnShare: Button = findViewById(R.id.btn_share)
        btnShare.setOnClickListener(this)

        val btnadd: Button = findViewById(R.id.btn_add)
        btnadd.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, Ikuti::class.java)
                startActivity(moveIntent)


            }
            R.id.btn_share -> {
                val moveIntent = Intent(this@MainActivity, share::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_add -> {
                val moveIntent = Intent(this@MainActivity, add::class.java)
                startActivity(moveIntent)
            }
        }
    }
}


