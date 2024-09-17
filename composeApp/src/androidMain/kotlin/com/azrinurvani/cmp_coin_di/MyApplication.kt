package com.azrinurvani.cmp_coin_di

import android.app.Application
import com.azrinurvani.cmp_coin_di.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }
    }
}