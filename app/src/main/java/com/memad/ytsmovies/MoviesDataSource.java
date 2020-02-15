package com.memad.ytsmovies;

import androidx.annotation.NonNull;
import androidx.paging.ItemKeyedDataSource;
import androidx.paging.PageKeyedDataSource;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MoviesDataSource extends PageKeyedDataSource<Integer, YtsResponse.Movies> {

    private static final int PAGE = 1;
    private static final String SORT = "rating";


    @Override
    public void loadInitial(@NonNull LoadInitialParams<Integer> params,
                            @NonNull LoadInitialCallback<Integer, YtsResponse.Movies> callback) {
        RetrofitClient.getInstance().getApi()
                .getAllMovies(PAGE, SORT)
                .enqueue(new Callback<YtsResponse>() {
                    @Override
                    public void onResponse(Call<YtsResponse> call, Response<YtsResponse> response) {
                        if(response.body() != null){
                            callback.onResult(response.body().getData().getMovies(),
                                    null , PAGE+1);
                        }
                    }

                    @Override
                    public void onFailure(Call<YtsResponse> call, Throwable t) {
                    }
                });
    }

    @Override
    public void loadBefore(@NonNull LoadParams<Integer> params,
                           @NonNull LoadCallback<Integer, YtsResponse.Movies> callback) {
        RetrofitClient.getInstance().getApi()
                .getAllMovies(params.key, SORT)
                .enqueue(new Callback<YtsResponse>() {
                    @Override
                    public void onResponse(Call<YtsResponse> call, Response<YtsResponse> response) {

                        Integer key = (params.key > 1 )? params.key -1: null;
                        if(response.body() != null){
                            callback.onResult(response.body().getData().getMovies(),
                                    key);
                        }
                    }

                    @Override
                    public void onFailure(Call<YtsResponse> call, Throwable t) {
                    }
                });
    }

    @Override
    public void loadAfter(@NonNull LoadParams<Integer> params,
                          @NonNull LoadCallback<Integer, YtsResponse.Movies> callback) {

        RetrofitClient.getInstance().getApi()
                .getAllMovies(params.key, SORT)
                .enqueue(new Callback<YtsResponse>() {
                    @Override
                    public void onResponse(Call<YtsResponse> call, Response<YtsResponse> response) {

                        if(response.body() != null){
                            Integer key = (response.body().getData().getMovies() != null )? params.key +1: null;
                            callback.onResult(response.body().getData().getMovies(),
                                    key);
                        }
                    }

                    @Override
                    public void onFailure(Call<YtsResponse> call, Throwable t) {
                    }
                });
    }
}
