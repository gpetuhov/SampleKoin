package com.gpetuhov.android.samplekoin.koin

import com.gpetuhov.android.samplekoin.greeting.GreetingProvider
import com.gpetuhov.android.samplekoin.greeting.HelloProvider
import com.gpetuhov.android.samplekoin.name.BobProvider
import com.gpetuhov.android.samplekoin.name.NameProvider
import org.koin.dsl.module.module

val appModule = module {
    single<NameProvider> { BobProvider() }
    single<GreetingProvider> { HelloProvider(get()) }
}