package com.crkubiak.android.catstonefrontend

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var purr = true
        capture_cat_button.setOnClickListener {
            val intent = Intent(this, CaptureActivity::class.java)
            startActivity(intent)
        }

        view_captures_button.setOnClickListener {
            val intent = Intent(this, RecordsActivity::class.java)
            startActivity(intent)
        }

        main_image.setOnClickListener {
            if (purr) {
                val mediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.purr)
                mediaPlayer?.start()
            }
            purr = false
        }
    }
}
