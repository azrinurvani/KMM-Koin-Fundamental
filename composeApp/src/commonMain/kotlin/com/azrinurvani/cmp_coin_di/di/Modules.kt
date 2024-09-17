package com.azrinurvani.cmp_coin_di.di

import com.azrinurvani.cmp_coin_di.depedencies.MyRepository
import com.azrinurvani.cmp_coin_di.depedencies.MyRepositoryImpl
import com.azrinurvani.cmp_coin_di.depedencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule : Module

val sharedModule = module {
    //option 1
//    single { //single its mean singleton
//        MyRepositoryImpl(get()) //get instance from the constructor
//    }.bind<MyRepository>()

    //option 2
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}