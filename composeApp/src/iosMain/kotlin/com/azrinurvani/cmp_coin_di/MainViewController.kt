package com.azrinurvani.cmp_coin_di

import androidx.compose.ui.window.ComposeUIViewController
import com.azrinurvani.cmp_coin_di.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
){
    App()
}