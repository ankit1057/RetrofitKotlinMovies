package io.movies.retrofitkotlindeferred.service

import io.movies.retrofitkotlindeferred.data.PlaceholderPhotos
import io.movies.retrofitkotlindeferred.data.PlaceholderPosts
import io.movies.retrofitkotlindeferred.data.PlaceholderUsers
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface PlaceholderApi{

    @GET("/posts")
    fun getPosts() : Deferred<Response<List<PlaceholderPosts>>>

    @GET("/users")
    fun getUsers() : Deferred<Response<List<PlaceholderUsers>>>

    @GET("/photos")
    fun getPhotos() : Deferred<Response<List<PlaceholderPhotos>>>

}