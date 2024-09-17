package com.azrinurvani.cmp_coin_di.di

import com.azrinurvani.cmp_coin_di.depedencies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}