package com.example.signupsignin_day15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val userName: EditText =findViewById(R.id.edtTxt_UserName)
        val userPassword: EditText =findViewById(R.id.edtTxt_Password)
        val buttonLogin:Button=findViewById(R.id.btn_login)
        val newUser: TextView =findViewById(R.id.txt_signUp)
        buttonLogin.setOnClickListener {
           Toast.makeText(this,"Login Successfully",Toast.LENGTH_LONG).show()
        }
        newUser.setOnClickListener {
            val intent=Intent(this,SignUp::class.java)
            startActivity(intent)
        }
    }
}