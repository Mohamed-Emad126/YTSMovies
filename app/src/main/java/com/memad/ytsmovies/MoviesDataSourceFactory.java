package com.memad.ytsmovies;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;

public class MoviesDataSourceFactory extends DataSource.Factory {

    private MutableLiveData<PageKeyedDataSource<Integer, YtsResponse.Movies>> movies
            = new MutableLiveData<>();
    @NonNull
    @Override
    public DataSource create() {
        MoviesDataSource moviesDataSource = new MoviesDataSource();
        movies.postValue(moviesDataSource);
        return moviesDataSource;
    }

    public MutableLiveData<PageKeyedDataSource<Integer, YtsResponse.Movies>> getMovies() {
        return movies;
    }
}
