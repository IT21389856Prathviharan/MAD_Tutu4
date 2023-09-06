package com.example.tute4nextactiuvity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtname: EditText
    lateinit var btnwelcome:Button
    lateinit var btngoodbye:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtname = findViewById(R.id.edtname)
        btnwelcome = findViewById(R.id.edtname)
        btngoodbye = findViewById(R.id.btngoodbye)

        fun sayHello(){
            Toast.makeText(this, "Hello, ${edtname.text.toString()}",Toast.LENGTH_LONG).show()
        }
        fun sayGoodBye(){
            Toast.makeText(this, "Hello, ${edtname.text.toString()}",Toast.LENGTH_LONG).show()
        }

        btnwelcome.setOnClickListener {
            sayHello()

        }

        btngoodbye.setOnClickListener {
            sayGoodBye()
        }

    }
}