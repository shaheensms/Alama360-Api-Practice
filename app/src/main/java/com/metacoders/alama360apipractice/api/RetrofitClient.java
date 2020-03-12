package com.metacoders.alama360apipractice.api;

import com.metacoders.alama360apipractice.utils.StaticURLS;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static RetrofitClient mInstance;
    private Retrofit retrofit;

    private  RetrofitClient() {
        retrofit = new Retrofit.Builder()
                .baseUrl(StaticURLS.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClient getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClient();
        }
        return mInstance;
    }

    public AlamaApi getApi() {
        return retrofit.create(AlamaApi.class);
    }
}
