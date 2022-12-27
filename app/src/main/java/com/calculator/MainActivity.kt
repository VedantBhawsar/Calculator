package com.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputnum1 = findViewById<TextView>(R.id.num1)
        var inputnum2 = findViewById<TextView>(R.id.num2)
        var outputresult = findViewById<TextView>(R.id.result)

        var addtion = findViewById<Button>(R.id.add)
        var sub = findViewById<Button>(R.id.sub)
        var divide = findViewById<Button>(R.id.divide)
        var multi = findViewById<Button>(R.id.multi)
        var mod = findViewById<Button>(R.id.mod)

       fun alert (){
           Toast.makeText(this@MainActivity, "Operation Completed!", Toast.LENGTH_SHORT).show()
       }
        fun warning (){
            Toast.makeText(this@MainActivity, "Enter Number First", Toast.LENGTH_SHORT).show()
        }


        addtion.setOnClickListener{

            var s2 = inputnum2.text.toString()
            var s1 = inputnum1.text.toString()
            if( s1 == "" || s2 == "" ){
                warning()
            }else{
            var num1 = s1.toInt()
            var num2 = s2.toInt()
            var result:Int = num1 + num2
            outputresult.text = result.toString()
            alert()}
        }

        sub.setOnClickListener {
            var s2 = inputnum2.text.toString()
            var s1 = inputnum1.text.toString()
            var num1 = s1.toInt()
            var num2 = s2.toInt()
            var result:Int = num1 - num2
            outputresult.text = result.toString()
            alert()
        }

        divide.setOnClickListener {
            var s2 = inputnum2.text.toString()
            var s1 = inputnum1.text.toString()
            var num1 = s1.toInt()
            var num2 = s2.toInt()
            var result:Int = num1 / num2
            outputresult.text = result.toString()
            alert()
        }

        multi.setOnClickListener {
            var s2 = inputnum2.text.toString()
            var s1 = inputnum1.text.toString()
            var num1 = s1.toInt()
            var num2 = s2.toInt()
            var result:Int = num1 * num2
            outputresult.text = result.toString()
            alert()
        }

        mod.setOnClickListener {
            var s2 = inputnum2.text.toString()
            var s1 = inputnum1.text.toString()
            var num1 = s1.toInt()
            var num2 = s2.toInt()
            var result:Int = num1 % num2
            outputresult.text = result.toString()
            alert()
        }
    }
}