package com.example.andmdmtst

import com.facebook.react.ReactActivity

class ReactActivity : ReactActivity() {
    override fun getMainComponentName(): String? {
        return "MyReactNativeApp"
    }
}