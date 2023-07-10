package com.domainpt.myintentapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.domainpt.myintentapp.R
import com.domainpt.myintentapp.databinding.ActivityMyIntentAppBinding

class MyIntentAppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyIntentAppBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_intent_app)
    }

}