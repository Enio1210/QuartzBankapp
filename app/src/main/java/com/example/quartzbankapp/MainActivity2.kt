package com.example.quartzbankapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.Toast
import com.google.android.material.color.utilities.Variant

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


// id do edit text
        val text_password: EditText = findViewById(R.id.password)
        val btn_login: Button = findViewById(R.id.btn_login)


        btn_login.setOnClickListener {
            if (text_password.length() == 8) {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "TEm que conter 8 digitos", Toast.LENGTH_LONG).show()
            }
        }
        /*
        switch.setOnCheckedChangeListener { _, isChecked ->
            text_password.isEnabled=true
            if (isChecked) {
                text_password.setInputType(InputType.TYPE_CLASS_TEXT)
            }else{
            }*/
    }
}


