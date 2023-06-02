package com.example.pagoeapps

import android.app.Activity
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView




class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = "Profile"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tekantombol = findViewById<View>(R.id.btnInstagram) as View
        tekantombol.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://www.instagram.com/yud.dharma/")
            val instagram = Intent(Intent.ACTION_VIEW, uri)
            instagram.setPackage("com.instagram.android")
            try {
                startActivity(instagram)
            } catch (e: ActivityNotFoundException) {
                startActivity(
                    Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/yud.dharma/")
                    )
                )
            }
        })
    }



    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
