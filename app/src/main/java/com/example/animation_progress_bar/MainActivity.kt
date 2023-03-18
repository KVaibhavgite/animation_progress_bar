package com.example.animation_progress_bar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var swipeRefreshLayout: SwipeRefreshLayout
    lateinit var textView: TextView
    var number: Int = 0
    lateinit var  btn_next:Button
    lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        img = findViewById(R.id.imgView)
        Glide.with(this).load(R.raw.prog).into(img)
        swipeRefreshLayout = findViewById(R.id.swipe)
        textView = findViewById(R.id.textView)
        swipeRefreshLayout.setOnRefreshListener {
            number++
            textView.text = " Total number = $number"
            Handler().postDelayed(Runnable {
                swipeRefreshLayout.isRefreshing = false
            }, 2000)
        }




        btn_next = findViewById(R.id.button_next_page)
        btn_next.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                //intent.putExtra("key", "Kotlin")
                startActivity(intent)
            }
        })

    }


}