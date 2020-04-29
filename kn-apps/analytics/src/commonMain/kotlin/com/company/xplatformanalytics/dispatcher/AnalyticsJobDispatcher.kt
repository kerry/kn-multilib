package com.company.xplatformanalytics.dispatcher

import com.company.knos.dispatcher.JobDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi

expect fun getAnalyticsJobDispatcherScope(): CoroutineScope
expect fun getExceptionHandler(): CoroutineExceptionHandler

class AnalyticsJobDispatcher: JobDispatcher() {
    @ExperimentalCoroutinesApi
    override val jobDispatcherScope: CoroutineScope = getAnalyticsJobDispatcherScope()
    override val exceptionHandler: CoroutineExceptionHandler = getExceptionHandler()

    companion object {
        private val analyticsJobDispatcher: AnalyticsJobDispatcher = AnalyticsJobDispatcher()

        fun getInstance(): AnalyticsJobDispatcher {
            return analyticsJobDispatcher
        }
    }
}
