package com.ngmatt.weedmapsandroidcodechallenge

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom_toast.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLong.setOnClickListener {
            Toast.makeText(applicationContext, "Long Toast", Toast.LENGTH_LONG).show()
        }

        btnShort.setOnClickListener {
            Toast.makeText(applicationContext, "Short Toast", Toast.LENGTH_SHORT).show()
        }

        btnCustom.setOnClickListener {
            Toast(this).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast, clToast)
                show()
            }
        }

    }
}