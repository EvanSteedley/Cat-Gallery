package com.example.cat_gallery.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.cat_gallery.R
import com.example.cat_gallery.model.Cat

class CatAdapter(private val context: Context, private val dataset: List<Cat>):RecyclerView.Adapter<CatAdapter.CatViewHolder>() {
    class CatViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.cat_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_cat, parent, false)
        return CatViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CatViewHolder, position: Int) {
        val cat = dataset[position]
        holder.imageView.setImageResource(cat.imageResourceID)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}