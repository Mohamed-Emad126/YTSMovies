package com.memad.ytsmovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("list_movies.json")
    Call<YtsResponse> getAllMovies(@Query("page") int page, @Query("sort_by") String sort);
}
