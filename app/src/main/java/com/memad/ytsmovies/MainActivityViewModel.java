package com.memad.ytsmovies;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PageKeyedDataSource;
import androidx.paging.PagedList;

public class MainActivityViewModel extends ViewModel {

    private LiveData<PagedList<YtsResponse.Movies>> moviesList;
    private LiveData<PageKeyedDataSource<Integer, YtsResponse.Movies>> moviesDataSource;


    public MainActivityViewModel() {
        MoviesDataSourceFactory factory = new MoviesDataSourceFactory();

        moviesDataSource = factory.getMovies();

        PagedList.Config config = (new PagedList.Config.Builder())
                .setPageSize(20)
                .setEnablePlaceholders(false)
                .build();
        moviesList = (new LivePagedListBuilder(factory, config)).build();
    }

    public LiveData<PagedList<YtsResponse.Movies>> getMoviesList() {
        return moviesList;
    }
}
