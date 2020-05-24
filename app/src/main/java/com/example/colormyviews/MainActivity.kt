package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

    }
    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.textView2 -> view.setBackgroundColor(Color.DKGRAY)
            R.id.textView3 -> view.setBackgroundColor(Color.GRAY)
            R.id.textView4 -> view.setBackgroundColor(Color.BLUE)
            R.id.textView5-> view.setBackgroundColor(Color.MAGENTA)
            R.id.textView6 -> view.setBackgroundColor(Color.BLUE)
            R.id.button4 -> textView4.setBackgroundResource(R.color.my_red)
            R.id.button5 -> textView5.setBackgroundResource(R.color.my_yellow)
            R.id.button6 -> textView6.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)

        }

    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.textView2)
        val boxTwoText = findViewById<TextView>(R.id.textView3)
        val boxThreeText = findViewById<TextView>(R.id.textView4)
        val boxFourText = findViewById<TextView>(R.id.textView5)
        val boxFiveText = findViewById<TextView>(R.id.textView6)

        val redButton = findViewById<TextView>(R.id.button4)
        val greenButton = findViewById<TextView>(R.id.button6)
        val yellowButton = findViewById<TextView>(R.id.button5)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(
                boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}
