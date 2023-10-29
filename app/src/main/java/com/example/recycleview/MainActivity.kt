package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerview)

        val books = listOf<Book>(Book("«Загадочное происшествие в Стайлзе»", 1920, R.drawable.a),
            Book("«Убийство на поле для гольфа»", 1923, R.drawable.b),
            Book("«Убийство Роджера Экройда»", 1926, R.drawable.c),
            Book("«Убийство в «Восточном экспрессе»", 1933, R.drawable.d),
            Book("«Загадка Эндхауза»", 1932, R.drawable.e),
            Book("«Смерть лорда Эджвера»", 1933, R.drawable.f),
            Book("«Трагедия в трёх актах»", 1934, R.drawable.h),
            Book("«Смерть в облаках»", 1935, R.drawable.i))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BookAdapter(applicationContext, books)
    }
}