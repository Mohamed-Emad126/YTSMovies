package com.memad.ytsmovies;

import androidx.annotation.Nullable;

import java.util.List;

public class YtsResponse {

    private Meta meta;
    private Data data;
    private String status_message;
    private String status;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public class Meta {
        private String execution_time;
        private int api_version;
        private String server_timezone;
        private int server_time;

        public String getExecution_time() {
            return execution_time;
        }

        public void setExecution_time(String execution_time) {
            this.execution_time = execution_time;
        }

        public int getApi_version() {
            return api_version;
        }

        public void setApi_version(int api_version) {
            this.api_version = api_version;
        }

        public String getServer_timezone() {
            return server_timezone;
        }

        public void setServer_timezone(String server_timezone) {
            this.server_timezone = server_timezone;
        }

        public int getServer_time() {
            return server_time;
        }

        public void setServer_time(int server_time) {
            this.server_time = server_time;
        }
    }

    public class Data {
        private List<Movies> movies;
        private int page_number;
        private int limit;
        private int movie_count;

        public List<Movies> getMovies() {
            return movies;
        }

        public void setMovies(List<Movies> movies) {
            this.movies = movies;
        }

        public int getPage_number() {
            return page_number;
        }

        public void setPage_number(int page_number) {
            this.page_number = page_number;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getMovie_count() {
            return movie_count;
        }

        public void setMovie_count(int movie_count) {
            this.movie_count = movie_count;
        }
    }

    public class Movies {
        private int date_uploaded_unix;
        private String date_uploaded;
        private List<Torrents> torrents;
        private String state;
        private String large_cover_image;
        private String medium_cover_image;
        private String small_cover_image;
        private String background_image_original;
        private String background_image;
        private String mpa_rating;
        private String language;
        private String yt_trailer_code;
        private String synopsis;
        private String description_full;
        private String summary;
        private List<String> genres;
        private int runtime;
        private double rating;
        private int year;
        private String slug;
        private String title_long;
        private String title_english;
        private String title;
        private String imdb_code;
        private String url;
        private int id;

        public int getDate_uploaded_unix() {
            return date_uploaded_unix;
        }

        public void setDate_uploaded_unix(int date_uploaded_unix) {
            this.date_uploaded_unix = date_uploaded_unix;
        }

        public String getDate_uploaded() {
            return date_uploaded;
        }

        public void setDate_uploaded(String date_uploaded) {
            this.date_uploaded = date_uploaded;
        }

        public List<Torrents> getTorrents() {
            return torrents;
        }

        public void setTorrents(List<Torrents> torrents) {
            this.torrents = torrents;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getLarge_cover_image() {
            return large_cover_image;
        }

        public void setLarge_cover_image(String large_cover_image) {
            this.large_cover_image = large_cover_image;
        }

        public String getMedium_cover_image() {
            return medium_cover_image;
        }

        public void setMedium_cover_image(String medium_cover_image) {
            this.medium_cover_image = medium_cover_image;
        }

        public String getSmall_cover_image() {
            return small_cover_image;
        }

        public void setSmall_cover_image(String small_cover_image) {
            this.small_cover_image = small_cover_image;
        }

        public String getBackground_image_original() {
            return background_image_original;
        }

        public void setBackground_image_original(String background_image_original) {
            this.background_image_original = background_image_original;
        }

        public String getBackground_image() {
            return background_image;
        }

        public void setBackground_image(String background_image) {
            this.background_image = background_image;
        }

        public String getMpa_rating() {
            return mpa_rating;
        }

        public void setMpa_rating(String mpa_rating) {
            this.mpa_rating = mpa_rating;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getYt_trailer_code() {
            return yt_trailer_code;
        }

        public void setYt_trailer_code(String yt_trailer_code) {
            this.yt_trailer_code = yt_trailer_code;
        }

        public String getSynopsis() {
            return synopsis;
        }

        public void setSynopsis(String synopsis) {
            this.synopsis = synopsis;
        }

        public String getDescription_full() {
            return description_full;
        }

        public void setDescription_full(String description_full) {
            this.description_full = description_full;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public List<String> getGenres() {
            return genres;
        }

        public void setGenres(List<String> genres) {
            this.genres = genres;
        }

        public int getRuntime() {
            return runtime;
        }

        public void setRuntime(int runtime) {
            this.runtime = runtime;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public String getSlug() {
            return slug;
        }

        public void setSlug(String slug) {
            this.slug = slug;
        }

        public String getTitle_long() {
            return title_long;
        }

        public void setTitle_long(String title_long) {
            this.title_long = title_long;
        }

        public String getTitle_english() {
            return title_english;
        }

        public void setTitle_english(String title_english) {
            this.title_english = title_english;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImdb_code() {
            return imdb_code;
        }

        public void setImdb_code(String imdb_code) {
            this.imdb_code = imdb_code;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(@Nullable Object obj) {
            return super.equals(obj);
        }
    }

    public class Torrents {
        private int date_uploaded_unix;
        private String date_uploaded;
        private long size_bytes;
        private String size;
        private int peers;
        private int seeds;
        private String type;
        private String quality;
        private String hash;
        private String url;

        public int getDate_uploaded_unix() {
            return date_uploaded_unix;
        }

        public void setDate_uploaded_unix(int date_uploaded_unix) {
            this.date_uploaded_unix = date_uploaded_unix;
        }

        public String getDate_uploaded() {
            return date_uploaded;
        }

        public void setDate_uploaded(String date_uploaded) {
            this.date_uploaded = date_uploaded;
        }

        public long getSize_bytes() {
            return size_bytes;
        }

        public void setSize_bytes(long size_bytes) {
            this.size_bytes = size_bytes;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public int getPeers() {
            return peers;
        }

        public void setPeers(int peers) {
            this.peers = peers;
        }

        public int getSeeds() {
            return seeds;
        }

        public void setSeeds(int seeds) {
            this.seeds = seeds;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
