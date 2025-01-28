package edu.temple.classactivity

import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //    private lateinit var clickMeButton: Button
//can do away with the above it is only used once
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById(R.id.button) as Button).setOnClickListener {
            (it as Button).text = "Button clicked!"
        }

//       findViewById(R.id.button).setOnclickLIstener { view: View ->
//           (view as Button).text = "Button clicked!"
//       }
//        val ocl = object: OnClickListener {
//            overrider fun onClick(p0: View?) {
//                (p0 as Button).text = "Button clicked!"e
//            }
//        }
    }
}