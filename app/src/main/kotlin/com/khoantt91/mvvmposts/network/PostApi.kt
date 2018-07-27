package com.khoantt91.mvvmposts.network

import io.reactivex.Observable
import com.khoantt91.mvvmposts.model.Post
import retrofit2.http.GET

/**
 * The interface which provides methods to get result of webservices
 */
interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}