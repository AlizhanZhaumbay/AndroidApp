package com.example.recycleview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView
    val bookName: TextView
    val established: TextView

    init {
        imageView = itemView.findViewById(R.id.imageView)
        bookName = itemView.findViewById(R.id.bookName)
        established = itemView.findViewById(R.id.established)
    }
}