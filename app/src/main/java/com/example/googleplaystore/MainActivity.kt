package com.example.googleplaystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //   val adapter = ItemAdapter(items)
        // Danh sách con
        val items = arrayListOf<ItemModel>()
        repeat(10) {
            val index = it + 1
            val appName = when (index) {
                1 -> "Reddit"
                2 -> "Facebook"
                3 -> "Memrise"
                4 -> "Notion"
                5 -> "Riki"
                6 -> "Tiktok"
                7 -> "Ghost"
                8 -> "Netflix"
                9 -> "Grab"
                10 -> "Sportify"
                else -> "DefaultAppName"
            }

            val appRate = when (index) {
                1 -> "4.1"
                2 -> "4.2"
                3 -> "4.6"
                4 -> "3.2"
                5 -> "4.5"
                6 -> "3.9"
                7 -> "4.7"
                8 -> "4.5"
                9 -> "4.0"
                10 -> "4.3"
                else -> "4.9"
            }
            items.add(ItemModel(
                resources.getIdentifier("img$index", "drawable", packageName), appName, appRate
            ))
        }

        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
        val adapter = ItemAdapter(items)
        recyclerView1.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView1.adapter = adapter

        val recyclerView2 = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView2.adapter = adapter

        val recyclerView3 = findViewById<RecyclerView>(R.id.recycler_view3)
        recyclerView3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView3.adapter = adapter

        val recyclerView4 = findViewById<RecyclerView>(R.id.recycler_view4)
        recyclerView4.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView4.adapter = adapter

        val recyclerView5 = findViewById<RecyclerView>(R.id.recycler_view5)
        recyclerView5.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView5.adapter = adapter

    }
}

