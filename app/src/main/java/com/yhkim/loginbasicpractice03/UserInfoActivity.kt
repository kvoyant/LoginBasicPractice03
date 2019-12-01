package com.yhkim.loginbasicpractice03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yhkim.loginbasicpractice03.datas.UserData
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

//        val userIdFromIntent = intent.getStringExtra("userId")
//        idTxt.text = userIdFromIntent
//        val userPw = intent.getStringExtra("userPw")
//        pwTxt.text = userPw
//        var userHeight = intent.getDoubleExtra("userHeight" , 0.1)

        val user = intent.getSerializableExtra("userData") as UserData //캐스팅 swift 유사
        idTxt.text = user.userLoginId
        pwTxt.text = user.userLoginPw


    }
}
//인텐트로 데이터 이동시