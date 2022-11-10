package com.example.fishbook

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.content_layout.*

class ContentActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_layout)
        tvTitle.text = intent.getStringExtra("title")
        tvContent.text = intent.getStringExtra("content")
        im.setImageResource(intent.getIntExtra("image", androidx.appcompat.R.drawable.abc_ic_clear_material))


    }
}