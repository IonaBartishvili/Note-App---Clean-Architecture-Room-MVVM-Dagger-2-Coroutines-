package com.soulofbelial.noteapp.di

import androidx.appcompat.app.AppCompatActivity
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component
interface AppComponent {
    fun inject(activity: AppCompatActivity)
}