package com.azrinurvani.cmp_coin_di

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform