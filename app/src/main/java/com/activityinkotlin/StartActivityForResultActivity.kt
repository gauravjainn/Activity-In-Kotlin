package com.activityinkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.layout_activity_for_result.*

class `StartActivityForResultActivity` : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_activity_for_result)
        var textView1 = findViewById(R.id.textView1) as TextView
        var button1 = findViewById<View>(R.id.button1) as Button
        button1.setOnClickListener {
            val intent = Intent(this@StartActivityForResultActivity, SecondActivity::class.java)
            startActivityForResult(intent, 2)// Activity is started with requestCode 2
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 2) {
            val message = data?.getStringExtra("MESSAGE")
            textView1.text = message
        }
    }



}