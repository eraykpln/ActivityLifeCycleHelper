package com.eraykaplan.activitylifecyclehelper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("PS","onCreate()")
    }
    override fun onStart() {
        super.onStart()
        Log.d("PS","onStart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("PS:","onStop()")
    }
    override fun onResume() {
        super.onResume()
        Log.d("PS:","onResume()")
    }
    override fun onPause() {
        super.onPause()
        Log.d("PS:","onPause()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("PS:","onDestroy()")
    }
}