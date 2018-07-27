package com.khoantt91.mvvmposts.base

import android.arch.lifecycle.ViewModel
import com.khoantt91.mvvmposts.injection.component.DaggerViewModelInjector
import com.khoantt91.mvvmposts.injection.component.ViewModelInjector
import com.khoantt91.mvvmposts.injection.module.NetworkModule
import com.khoantt91.mvvmposts.post.PostListViewModel

abstract class BaseViewModel:ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}