package com.anushka.retrofitdemo

import retrofit2.Response
import retrofit2.http.*


interface AlbumService {

    @GET("/albums")
    suspend fun getAlbums(): Response<Albums>

//    Query Parameter
    @GET("/albums")
    suspend fun getSortedAlbums(@Query("userId") userId: Int): Response<Albums>
//    Path Parameter
    @GET("/albums/{id}")
    suspend fun getAlbum(@Path(value = "id") albumId: Int): Response<AlbumsItem>
//    Post Method
    @POST("/albums")
    suspend fun uploadAlbum(@Body album: AlbumsItem): Response<AlbumsItem>


}