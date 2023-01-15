package com.example.frontend.Remote;

import com.example.frontend.responseClasses.ResponseClass;
import com.example.frontend.responseClasses.ResponseRegisterClass;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiService {

    @PUT("/addUser")
    Call<ResponseClass> addUser(@Body ResponseRegisterClass responseRegisterClass);

    @POST("/getUser")
    Call<ResponseClass> getUser(@Body ResponseRegisterClass responseRegisterClass);

}
