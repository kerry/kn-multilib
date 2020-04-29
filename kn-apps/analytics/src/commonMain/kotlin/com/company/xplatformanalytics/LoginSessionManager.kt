package com.company.xplatformanalytics

import com.company.xplatformanalytics.dispatcher.AnalyticsJobDispatcher

class LoginSessionManager constructor() {
    fun onUserSwapped(){
        // since user has been swapped so clearing the DB
        AnalyticsJobDispatcher.getInstance().dispatchJobAsync({
            println("test")
        })
    }
}
