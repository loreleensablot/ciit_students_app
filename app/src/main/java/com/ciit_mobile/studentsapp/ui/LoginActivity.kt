package com.ciit_mobile.studentsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ciit_mobile.studentsapp.R
import com.ciit_mobile.studentsapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        setupActionBar()
    }

    private fun setupActionBar() {
        setSupportActionBar(loginBinding.toolbar)
        supportActionBar!!.apply {
            setHomeAsUpIndicator(R.drawable.ic_back_arrow)
            setDisplayHomeAsUpEnabled(true)
            title = getString(R.string.login)
        }
    }
}