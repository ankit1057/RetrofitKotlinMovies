package io.navendra.retrofitkotlindeferred.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H\'J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00040\u0003H\'J\u001a\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lio/navendra/retrofitkotlindeferred/service/PlaceholderApi;", "", "getPhotos", "Lkotlinx/coroutines/Deferred;", "Lretrofit2/Response;", "", "Lio/navendra/retrofitkotlindeferred/data/PlaceholderPhotos;", "getPosts", "Lio/navendra/retrofitkotlindeferred/data/PlaceholderPosts;", "getUsers", "Lio/navendra/retrofitkotlindeferred/data/PlaceholderUsers;", "app_debug"})
public abstract interface PlaceholderApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/posts")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<java.util.List<io.navendra.retrofitkotlindeferred.data.PlaceholderPosts>>> getPosts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<java.util.List<io.navendra.retrofitkotlindeferred.data.PlaceholderUsers>>> getUsers();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/photos")
    public abstract kotlinx.coroutines.Deferred<retrofit2.Response<java.util.List<io.navendra.retrofitkotlindeferred.data.PlaceholderPhotos>>> getPhotos();
}