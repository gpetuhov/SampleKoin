package com.gpetuhov.android.samplekoin

import android.app.Application
import com.gpetuhov.android.samplekoin.koin.appModule
import org.koin.android.ext.android.startKoin

// Don't forget to declare this Application in the manifest

class SampleKoinApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Koin must be started in Application's onCreate()
        startKoin(this, listOf(appModule))
    }
}