package com.crkubiak.android.catstonefrontend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_records.*

class RecordsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_records)

        val textView = findViewById<TextView>(R.id.textView_receipt)
        val queue = Volley.newRequestQueue(this)
        val url = "https://catstone-backend.herokuapp.com/records"

        button_api_call.setOnClickListener {
            d("charles", "25")
            val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
                Response.Listener { response ->
                    textView.text = "Response: %s".format(response.toString())
                },
                Response.ErrorListener { textView.text = "That didn't work!" }
            )

            queue.add(jsonObjectRequest)
        }
    }
}
