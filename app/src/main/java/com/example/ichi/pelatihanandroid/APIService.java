package com.example.ichi.pelatihanandroid;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ICHI on 12/19/2017.
 */

public interface APIService {
    @FormUrlEncoded
    @POST("user/login")
    Call<response> doLogin (@Field("username") String username,
                            @Field("password") String password);
}
