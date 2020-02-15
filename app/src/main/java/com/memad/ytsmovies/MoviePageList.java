package com.memad.ytsmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class MoviePageList extends
        PagedListAdapter<YtsResponse.Movies, MoviePageList.MovieViewHolder> {

    private Context mCtx;

    private static DiffUtil.ItemCallback<YtsResponse.Movies> diffCallback =
            new DiffUtil.ItemCallback<YtsResponse.Movies>() {
        @Override
        public boolean areItemsTheSame(@NonNull YtsResponse.Movies oldItem,
                                       @NonNull YtsResponse.Movies newItem) {
            return oldItem.getId() == newItem.getId();
        }

        @Override
        public boolean areContentsTheSame(@NonNull YtsResponse.Movies oldItem,
                                          @NonNull YtsResponse.Movies newItem) {
            return oldItem.equals(newItem);
        }
    };

    protected MoviePageList(Context mCtx) {
        super(diffCallback);
        this.mCtx = mCtx;
    }


    @NonNull
    @Override
    public MoviePageList.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviePageList.MovieViewHolder holder, int position) {
        YtsResponse.Movies movie = getItem(position);

        if(movie != null){
            Picasso.get().load(movie.getLarge_cover_image())
                    .placeholder(R.drawable.ic_image)
                    .into(holder.image);
            holder.title.setText(movie.getTitle());
            holder.rate.setText(Double.toString(movie.getRating()));
        }

    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView title;
        TextView rate;
        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            rate = itemView.findViewById(R.id.rate);

        }
    }
}
