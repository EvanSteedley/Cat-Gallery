package com.example.cat_gallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cat_gallery.adapter.CatAdapter
import com.example.cat_gallery.data.Datasource
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadCats()
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.adapter = CatAdapter(this, myDataset)
        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        recyclerView.setHasFixedSize(true)
    }
}