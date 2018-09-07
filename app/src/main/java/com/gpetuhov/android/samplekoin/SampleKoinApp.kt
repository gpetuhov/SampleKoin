package com.gpetuhov.android.samplekoin

import android.app.Application
import com.gpetuhov.android.samplekoin.koin.appModule
import org.koin.android.ext.android.startKoin

class SampleKoinApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
    }
}