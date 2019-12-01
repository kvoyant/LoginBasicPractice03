package com.yhkim.loginbasicpractice03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            var inputId = idEdt.text.toString()
            var inputPw = pwEdt.text.toString()

            if(inputId == "admin" && inputPw == "pw123") {
                Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(this, "일반사용자 입니다.", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
