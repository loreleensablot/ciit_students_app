package com.ciit_mobile.studentsapp.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.ciit_mobile.studentsapp.R
import com.ciit_mobile.studentsapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        setupActionBar()
        setupButtons()
    }

    private fun setupButtons() {
        loginBinding.tvSignup.setOnClickListener(this)
        loginBinding.btnLogin.setOnClickListener(this)
    }

    private fun validateEmailAndPassword() {
        if (loginBinding.teitLogin.text.isNullOrEmpty()) {
            loginBinding.tilLogin.error = "Your email is empty"
        }
    }

    private fun setupActionBar() {
        setSupportActionBar(loginBinding.toolbar)
        supportActionBar!!.apply {
            setHomeAsUpIndicator(R.drawable.ic_back_arrow)
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.login)
        }
    }

    override fun onClick(v: View?) {
       when (v?.id) {
           R.id.tv_signup -> launchSignUp()
           R.id.btn_login -> validateEmailAndPassword()
       }
    }

    private fun launchSignUp() {
        val intent = Intent(this@LoginActivity, SignupActivity::class.java)
        startActivity(intent)
        finish()
    }
}