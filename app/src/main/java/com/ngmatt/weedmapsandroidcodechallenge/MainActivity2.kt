package com.ngmatt.weedmapsandroidcodechallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ngmatt.weedmapsandroidcodechallenge.ui.main.MainFragment

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}