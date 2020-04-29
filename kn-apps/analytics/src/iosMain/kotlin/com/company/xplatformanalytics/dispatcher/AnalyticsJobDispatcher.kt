package com.company.xplatformanalytics.dispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.newSingleThreadContext

@ExperimentalCoroutinesApi
actual fun getAnalyticsJobDispatcherScope(): CoroutineScope {
    return CoroutineScope(newSingleThreadContext("Analytics"))
}

actual fun getExceptionHandler(): CoroutineExceptionHandler {
    return CoroutineExceptionHandler(handler = { _, _ ->
        println("exception")
    })
}