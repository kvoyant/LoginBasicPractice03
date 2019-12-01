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

//            id : admin => pw : pw123 관리자 입니다. / 비번이 틀리면  "관리자 비번이 틀렸습니다."

            if(inputId == "admin") {

                if(inputPw == "pw123") {
                    Toast.makeText(this, "관리자 입니다.", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "관리자 비번이 틀렸습니다.", Toast.LENGTH_SHORT).show()
                }
            }
            else {
                Toast.makeText(this, "일반사용자 입니다.", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
