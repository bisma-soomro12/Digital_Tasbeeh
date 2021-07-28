package com.example.digital_tasbeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var count:Int=0
    var reset:Boolean=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countText: TextView = findViewById(R.id.count_txt)
        val btnCount: Button = findViewById(R.id.count)
        val btnReset: Button = findViewById(R.id.reset)
        val btnMinus: Button = findViewById(R.id.minus)

        btnCount.setOnClickListener(View.OnClickListener {



                ++count
                var strCount=count.toString()
                countText.setText(strCount)


        })
        btnReset.setOnClickListener(View.OnClickListener {
            count=0
            countText.setText("00")

        })

        btnMinus.setOnClickListener(View.OnClickListener {

           if(count>0){
               --count
               var strCount=count.toString()
               countText.setText(strCount)
           }
        })
    }
}