package com.example.prac4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

/**
 * Darío Huallpa 10A
 * Práctica 4
 */

class MainActivity : AppCompatActivity() {

    lateinit var cNum1: EditText
    lateinit var cNum2:EditText
    lateinit var cResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cNum1 = findViewById<EditText>(R.id.gNum1)
        cNum2 = findViewById<EditText>(R.id.gNum2)
        cResult = findViewById<TextView>(R.id.gResult)

    }//Fin onCreate

    public fun aceptar(vista: View){ //public es redundante
        /*var num1:Int
        var num2:Int
        var res:Int*/

        var res:Int

        var num1:Int = Integer.parseInt(cNum1.text.toString())
        var num2:Int = Integer.parseInt(cNum2.text.toString())
        res = num1 + num2
        cResult.text = res.toString()
    }//Fin función aceptar

}//Fin class MainActivity