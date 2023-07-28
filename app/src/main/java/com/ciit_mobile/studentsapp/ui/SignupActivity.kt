package com.ciit_mobile.studentsapp.ui

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.ciit_mobile.studentsapp.R
import com.ciit_mobile.studentsapp.databinding.ActivitySignupBinding

class SignupActivity : AppCompatActivity() {

    lateinit var signupBinding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        signupBinding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(signupBinding.root)
        setupActionBar()
        signupBinding.tvLogin.setOnClickListener {
            val intent = Intent(this@SignupActivity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setupActionBar() {
        setSupportActionBar(signupBinding.toolbar)
        supportActionBar!!.apply {
            setHomeAsUpIndicator(R.drawable.ic_back_arrow)
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.signup)
        }
    }
}