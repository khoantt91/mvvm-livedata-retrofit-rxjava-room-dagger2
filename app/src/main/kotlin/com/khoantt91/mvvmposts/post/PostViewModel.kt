package com.khoantt91.mvvmposts.post

import android.arch.lifecycle.MutableLiveData
import com.khoantt91.mvvmposts.base.BaseViewModel
import com.khoantt91.mvvmposts.model.Post

class PostViewModel: BaseViewModel() {
    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody():MutableLiveData<String>{
        return postBody
    }
}