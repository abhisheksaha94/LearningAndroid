package `in`.tutorials.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById(R.id.button) as Button
        var myTextView = findViewById(R.id.textView) as TextView
        var buttonClick = 0
        btnClickMe.setOnClickListener {
            //buttonClick = buttonClick + 1
            buttonClick += 1
            myTextView.text = buttonClick.toString()
            Toast.makeText(this@MainActivity, "Hi Abhishek", Toast.LENGTH_LONG)
        }
    }
}