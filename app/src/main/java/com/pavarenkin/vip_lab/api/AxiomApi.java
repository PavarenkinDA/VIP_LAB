package com.pavarenkin.vip_lab.api;

import com.pavarenkin.vip_lab.db.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Дмитрий Паваренкин on 25.02.2017.
 */

public interface AxiomApi {

    @GET("/api/get")
    Call<List<Post>> getData(@Query("name") String resourceName, @Query("num") int count);

    @POST("/api/post")
    Call<List<Post>> postData(@Query("name") String resourceName, @Query("num") int count);

    @POST("/api/post")
    Call<List<Post>> sendPost(@Body Post post);

}
