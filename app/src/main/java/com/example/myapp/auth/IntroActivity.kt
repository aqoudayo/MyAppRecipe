package com.example.myapp.auth

import android.content.Intent
import android.graphics.Paint.Join
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.myapp.MainActivity
import com.example.myapp.R
import com.example.myapp.databinding.ActivityIntroBinding
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

class IntroActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    private lateinit var  binding : ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_intro)

        auth = Firebase.auth

        binding = DataBindingUtil.setContentView(this,R.layout.activity_intro)

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this, LoginActivity :: class.java)
            startActivity(intent)
        }

        binding.joinBtn.setOnClickListener {
            val intent = Intent(this, JoinActivity::class.java)
            startActivity(intent)
        }
        binding.noAccountBtn.setOnClickListener {
            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this,"로그인 성공", Toast.LENGTH_LONG).show()

                        val intent  = Intent(this, MainActivity::class.java) // 메인으로 이동, 로그인후에
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
                        startActivity(intent)
                    } else {
                       Toast.makeText(this,"로그인 실패", Toast.LENGTH_LONG).show()
                    }
                }
        }

    }
}