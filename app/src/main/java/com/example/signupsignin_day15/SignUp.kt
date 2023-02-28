package com.example.signupsignin_day15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {
   private lateinit var database:DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val userName: EditText =findViewById(R.id.edtTxt_UserName)
        val userEmail: EditText =findViewById(R.id.edtTxt_UserEmail)
        val userPassword: EditText =findViewById(R.id.edtTxt_Password)
        val buttonSignUp: Button =findViewById(R.id.btnsignUp)
        buttonSignUp.setOnClickListener {
            val name=userName.text.toString()
            val email=userEmail.text.toString()
            val password=userPassword.text.toString()
            val user=User(name, email, password)
            database=FirebaseDatabase.getInstance().getReference("Users")
            database.child(email).setValue(user).addOnSuccessListener {
                Toast.makeText(this,"User Registered",Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }

        }
    }
}