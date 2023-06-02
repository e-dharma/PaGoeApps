package com.example.pagoeapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View.OnCreateContextMenuListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pagoeapps.adapter.Adapter
import com.example.pagoeapps.database.database
import com.example.pagoeapps.tarian.TarianNusantara
import java.util.Objects

class MainActivity : AppCompatActivity() {

    private lateinit var rvTariMain: RecyclerView
    private var list: ArrayList<TarianNusantara> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "PaGo Apps"
        rvTariMain = findViewById(R.id.rvTarian)
        rvTariMain.setHasFixedSize(true)
        list.addAll(database.listData)
        showRecycleList()

    }

    private fun showRecycleList(){
        rvTariMain.layoutManager = LinearLayoutManager(this)
        rvTariMain.adapter = Adapter(list)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.about_page){
            val aboutpage = Intent(this@MainActivity, AboutActivity::class.java)
            startActivity(aboutpage)
        }
        return super.onOptionsItemSelected(item)
    }
}