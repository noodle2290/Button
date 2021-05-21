package app.murakami.takuro.countcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0

        button.setOnClickListener {
            count += 1
            textView.text = count.toString()
        }

        button2.setOnClickListener {
            count -= 1
            textView.text = count.toString()
        }
    }
}