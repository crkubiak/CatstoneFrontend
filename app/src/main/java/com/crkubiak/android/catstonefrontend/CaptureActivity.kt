package com.crkubiak.android.catstonefrontend

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_capture.*

class CaptureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        buttonTakePicture.setOnClickListener {
            var intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 200)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 200) {
            var bmp = data!!.extras!!.get("data") as Bitmap
            imagePlaceHolder.setImageBitmap(bmp)
            imagePlaceHolder.alpha = 1.0F
        }
    }
}
