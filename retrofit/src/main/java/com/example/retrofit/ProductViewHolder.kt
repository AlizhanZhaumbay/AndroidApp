package com.example.retrofit

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProductViewHolder(v: View) : RecyclerView.ViewHolder(v) {
    val id = v.findViewById<TextView>(R.id.id)
    val title = v.findViewById<TextView>(R.id.title)
    val description = v.findViewById<TextView>(R.id.description)
}