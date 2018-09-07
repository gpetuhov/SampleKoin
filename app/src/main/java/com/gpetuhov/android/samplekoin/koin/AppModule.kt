package com.gpetuhov.android.samplekoin.koin

import com.gpetuhov.android.samplekoin.greeting.GreetingProvider
import com.gpetuhov.android.samplekoin.greeting.HelloProvider
import com.gpetuhov.android.samplekoin.name.BobProvider
import com.gpetuhov.android.samplekoin.name.NameProvider
import org.koin.dsl.module.module

// This is where we tell Koin, what concrete implementations to instantiate.
val appModule = module {

    single<NameProvider> { BobProvider() }

    // Here we inject BobProvider into HelloProvider simply by calling get()
    single<GreetingProvider> { HelloProvider(get()) }
}