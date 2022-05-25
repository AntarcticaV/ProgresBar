package com.example.funck


import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var pbHorizontal: ProgressBar? = null
    private var tvProgressHorizontal: TextView? = null
    private var tvProgressCircle: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pbHorizontal = findViewById<View>(R.id.pb_horizontal) as ProgressBar
        tvProgressHorizontal = findViewById<View>(R.id.tv_progress_horizontal) as TextView
        tvProgressCircle = findViewById<View>(R.id.tv_progress_circle) as TextView
    }

    fun onClick(v: View?) {
        var progress = 0
        progress = progress + 10
        postProgress(progress)
    }

    private fun postProgress(progress: Int) {
        val strProgress = "$progress %"
        pbHorizontal!!.progress = progress
        if (progress == 0) {
            pbHorizontal!!.secondaryProgress = 0
        } else {
            pbHorizontal!!.secondaryProgress = progress + 5
        }
        tvProgressHorizontal!!.text = strProgress
        tvProgressCircle!!.text = strProgress
    }
}