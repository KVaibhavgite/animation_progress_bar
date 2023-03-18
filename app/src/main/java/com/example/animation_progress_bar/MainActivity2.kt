package com.example.animation_progress_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewStub
import android.widget.Button


class MainActivity2 : AppCompatActivity() {
    lateinit var viewStub: ViewStub
    lateinit var show: Button
    lateinit var hide:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        title = "KotlinApp-ViewStub"

        show = findViewById(R.id.show)
        hide = findViewById(R.id.hide)
        viewStub = findViewById(R.id.viewStub)

        viewStub.inflate()


        show.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Your code here
                viewStub.visibility = View.VISIBLE
            }})

        hide.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                //Your code here
                viewStub.visibility = View.GONE
            }})

    }
}