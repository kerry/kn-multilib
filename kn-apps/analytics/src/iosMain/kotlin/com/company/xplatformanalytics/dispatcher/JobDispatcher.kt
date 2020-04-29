package com.company.xplatformanalytics.dispatcher

import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking


actual fun dispatchJobSync(job: suspend CoroutineScope.() -> Unit,
                           scope: CoroutineScope,
                           exceptionHandler: CoroutineExceptionHandler) {
    runBlocking(scope.coroutineContext) {
        job()
    }
}
