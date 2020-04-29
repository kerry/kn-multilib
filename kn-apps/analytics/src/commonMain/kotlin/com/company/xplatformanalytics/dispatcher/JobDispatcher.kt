package com.company.xplatformanalytics.dispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

expect fun dispatchJobSync(job: suspend CoroutineScope.() -> Unit,
                           scope: CoroutineScope,
                           exceptionHandler: CoroutineExceptionHandler = CoroutineExceptionHandler { _, _->} )

abstract class JobDispatcher {
    abstract val jobDispatcherScope: CoroutineScope
    //TODO: Make it such that if the subclass does not provide, use default
    abstract val exceptionHandler: CoroutineExceptionHandler

    /**
     * This will dispatch job to any thread that jobDispatcherScope defines
     */
    fun dispatchJobAsync(job: suspend CoroutineScope.() -> Unit,
                         exceptionHandler: CoroutineExceptionHandler = this.exceptionHandler) {
        jobDispatcherScope.launch(exceptionHandler) {
            job()
        }
    }

    fun dispatchJobSync(job: suspend CoroutineScope.() -> Unit,
                        exceptionHandler: CoroutineExceptionHandler = this.exceptionHandler) {
        dispatchJobSync(job, jobDispatcherScope, exceptionHandler)
    }
}