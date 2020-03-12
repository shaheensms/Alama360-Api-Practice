package com.metacoders.alama360apipractice.api;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AlamaApi {

    @FormUrlEncoded
    @POST("userbymobile")
    Call<ResponseBody> loginWithMobile (
            @Field("mobile") String mobile,
            @Field("lang") String lang
    );

}
