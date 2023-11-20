package com.example.googleplaystore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val items: ArrayList<ItemModel>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(val itemView: View): RecyclerView.ViewHolder(itemView) {
        val appImg = itemView.findViewById<ImageView>(R.id.app_img)
        val appName = itemView.findViewById<TextView>(R.id.app_name)
        val appRate = itemView.findViewById<TextView>(R.id.app_rate)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_view, parent, false)

        return ItemViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.appImg.setImageResource(items[position].appImg)
        holder.appName.text = items[position].appName
        holder.appRate.text= items[position].appRate
    }
}
