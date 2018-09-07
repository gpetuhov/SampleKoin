package com.gpetuhov.android.samplekoin.greeting

import com.gpetuhov.android.samplekoin.name.NameProvider

// This provides greeting with Hello.
// It takes NameProvider as a constructor parameter.
// Concrete implementation of NameProvider
// must be injected into constructor of HelloProvider.
class HelloProvider(private val nameProvider: NameProvider) : GreetingProvider {
    override fun getGreeting() = "Hello, ${nameProvider.getName()}"
}