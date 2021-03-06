package com.moviles.kanoa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val SPLASH_TIME_OUT = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed(object : Runnable{
            override fun run() {
                val home = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(home)
                finish()
            }
        }, SPLASH_TIME_OUT.toLong())



    }
}
