package com.yhkim.loginbasicpractice03

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yhkim.loginbasicpractice03.datas.UserData
import kotlinx.android.synthetic.main.activity_user_info.*

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)

        val userIdFromIntent = intent.getStringExtra("userId")
//        idTxt.text = userIdFromIntent
        val userPw = intent.getStringExtra("userPw")
//        pwTxt.text = userPw
        var userHeight = intent.getDoubleExtra("userHeight" , 0.1)

/*
//Logcat 에서 에러 확인 ( 형변화 불가 )
        var userHeight = intent.getDoubleExtra("userHeight" , 0.1) as Int
//        Caused by: java.lang.ClassCastException: java.lang.Double cannot be cast to java.lang.Integer
//        at com.yhkim.loginbasicpractice03.UserInfoActivity.onCreate(UserInfoActivity.kt:18)
*/

        val user = intent.getSerializableExtra("userData") as UserData //캐스팅 swift 유사
        idTxt.text = user.userLoginId
        pwTxt.text = user.userLoginPw

    }
}
