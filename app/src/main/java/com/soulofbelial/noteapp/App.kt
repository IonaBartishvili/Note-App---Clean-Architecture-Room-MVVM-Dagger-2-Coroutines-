package com.soulofbelial.noteapp

import android.app.Application
import com.soulofbelial.noteapp.di.AppComponent
import com.soulofbelial.noteapp.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent : AppComponent

    companion object {
        lateinit var instance : App
            private set
    }

    override fun onCreate() {
        super.onCreate()

        instance = this

        this.initDagger()
    }


    private fun initDagger() {
        this.appComponent = DaggerAppComponent
            .builder()
            .build()
    }
}