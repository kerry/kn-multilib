package com.company.xplatformanalytics.dispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers

actual fun getAnalyticsJobDispatcherScope(): CoroutineScope {
    return CoroutineScope(Dispatchers.IO)
}

actual fun getExceptionHandler(): CoroutineExceptionHandler {
    return CoroutineExceptionHandler(handler = { _, _ ->
        println("exception")
    })
}