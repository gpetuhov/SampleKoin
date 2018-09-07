package com.gpetuhov.android.samplekoin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.gpetuhov.android.samplekoin.greeting.GreetingProvider
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val greetingProvider: GreetingProvider by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = greetingProvider.getGreeting()
    }
}
