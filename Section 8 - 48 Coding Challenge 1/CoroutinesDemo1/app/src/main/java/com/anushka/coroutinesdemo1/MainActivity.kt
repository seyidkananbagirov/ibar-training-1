package com.anushka.coroutinesdemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCount.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                Log.i("MyTag", "1 Current thread ${Thread.currentThread().name}")
            }
            CoroutineScope(Dispatchers.Default).launch {
                Log.i("MyTag", "2 Current thread ${Thread.currentThread().name}")
            }
            CoroutineScope(Dispatchers.Unconfined).launch {
                Log.i("MyTag", "3 Current thread ${Thread.currentThread().name}")
            }
            CoroutineScope(Dispatchers.Main).launch {
                Log.i("MyTag", "4 Current thread ${Thread.currentThread().name}")
            }
        }
    }

}
