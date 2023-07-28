package com.ciit_mobile.studentsapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ciit_mobile.studentsapp.R
import com.ciit_mobile.studentsapp.databinding.ActivityOnboardingBinding

class OnboardingActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var viewBinding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityOnboardingBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        setButtons()
    }

    private fun setButtons() {
        viewBinding.btSignupOnboarding.setOnClickListener(this)
        viewBinding.btLoginOnboarding.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.bt_login_onboarding -> launchLogin()
            R.id.bt_signup_onboarding -> launchSignup()
        }
    }

    private fun launchLogin() {
        val intent = Intent(this@OnboardingActivity, LoginActivity::class.java)
        startActivity(intent)
    }

    private fun launchSignup() {
        val intent = Intent(this@OnboardingActivity, SignupActivity::class.java)
        startActivity(intent)
    }


}