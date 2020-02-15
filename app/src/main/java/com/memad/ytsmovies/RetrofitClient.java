package com.memad.ytsmovies;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient ourInstance;
    private static Retrofit retrofit;

    public static synchronized RetrofitClient getInstance() {
        if(ourInstance == null){
            ourInstance = new RetrofitClient();
        }
        return ourInstance;
    }

    private RetrofitClient() {
        retrofit = new Retrofit.Builder()
                            .baseUrl("https://yts.mx/api/v2/")
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
    }

    public API getApi(){
        return retrofit.create(API.class);
    }

}
