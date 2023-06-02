package com.example.pagoeapps

import android.annotation.SuppressLint
import android.content.ActivityNotFoundException
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.coroutines.flow.combineTransform

@Suppress("DEPRECATION")
class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_ASAL = "extra_asal"
        const val EXTRA_DETAIL = "extra_detail"
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_acticity)
        supportActionBar?.title = "Detail Tarian"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_detail_acticity)
        val tPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)
        val imgSetPhoto: ImageView = findViewById(R.id.imgDetail)
        Glide.with(this)
            .load(tPhoto)
            .apply(RequestOptions().override(500, 500))
            .into(imgSetPhoto)
        val tName = findViewById<TextView>(R.id.tvDetail_Nama)
        val tvSetName = intent.getStringExtra(EXTRA_NAME)
        tName.text = tvSetName

        val tDetail = findViewById<TextView>(R.id.tvIsi_Detail)
        val tSetDetail = intent.getStringExtra(EXTRA_DETAIL)
        tDetail.text = tSetDetail

        val tAsal = findViewById<TextView>(R.id.tvDetail_Asal)
        val tSetAsal = intent.getStringExtra(EXTRA_ASAL)
        tAsal.text = tSetAsal

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        val forBtn = findViewById<Button>(R.id.btnaction_share)
        forBtn.setOnClickListener {
            val shareContent = "Ini merupakan contoh pesan untuk di bagikan. Jika ada pertanyaan, hubungi media sosial saya: https://www.instagram.com/yud.dharma/"
            val shareContentSub = "PaGo Apps - Learning and Education for Tarian Tradisional"

            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_SUBJECT, shareContentSub)
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareContent)

            startActivity(shareIntent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

// Code untuk menampilkan Menu About pada halaman ini
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu_about, menu)
//        return super.onCreateOptionsMenu(menu)
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.about_page) {
            val about = Intent(this@DetailActivity, AboutActivity::class.java)
            startActivity(about)
        }
        return super.onOptionsItemSelected(item)
    }
}
