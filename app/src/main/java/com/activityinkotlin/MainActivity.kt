package com.activityinkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.support.v4.app.SupportActivity
import android.support.v4.app.SupportActivity.ExtraData
import android.support.v4.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T

/*https://github.com/gauravjainn/Activity-In-Kotlin.git*/

class `MainActivity` : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnOpenActivity = findViewById(R.id.btn_open_activity) as Button
        btnOpenActivity.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this@MainActivity, ActivityExample::class.java)
            startActivity(intent);
            Toast.makeText(this@MainActivity, "you clicked on activity example", Toast.LENGTH_SHORT).show()
        }

        var btnStartActivityForResult = findViewById(R.id.btn_start_activity_for_result) as Button
        btnStartActivityForResult.setOnClickListener {
            // your code to perform when the user clicks on the button
            val intent = Intent(this@MainActivity, StartActivityForResultActivity::class.java)
            startActivity(intent);
            Toast.makeText(this@MainActivity, "you clicked on start Activity Example", Toast.LENGTH_SHORT).show()
        }

        var btnDefaultIntentActivity = findViewById(R.id.default_intent_activity) as Button
        btnDefaultIntentActivity.setOnClickListener {
            // your code to perform when the user clicks on the button
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(
                Intent.EXTRA_TEXT,
                "Hey check out my app at: https://play.google.com/store/apps/details?id=com.app.waparking&hl=en_IN"
            )
            sendIntent.type = "text/plain"
            startActivity(sendIntent)
        }

    }

}
