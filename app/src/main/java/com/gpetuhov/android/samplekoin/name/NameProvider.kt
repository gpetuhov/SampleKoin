package com.gpetuhov.android.samplekoin.name

// All name providers implement this interface
interface NameProvider {
    fun getName(): String
}