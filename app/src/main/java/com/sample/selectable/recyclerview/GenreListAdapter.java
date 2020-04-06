package com.sample.selectable.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.selection.ItemKeyProvider;

import com.sample.selectable.recyclerview.databinding.ArtistItemBinding;
import com.sample.selectable.recyclerview.databinding.GenreItemBinding;
import com.sample.selectable.recyclerview.model.Artist;
import com.sample.selectable.recyclerview.model.Genre;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class GenreListAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder, ArtistViewHolder> {


    public GenreListAdapter(List<Genre> genres) {
        super(genres);
        expandAll();
    }

    public void expandAll(){
        List<? extends ExpandableGroup> groups = getGroups();
        for(int i=1; i<= groups.size(); i++){
            expandGroup(groups.size()-i);
        }
    }
    private void expandGroup(int groupPosition){
        if(isGroupExpanded(groupPosition)){ return; }
        toggleGroup(groupPosition);
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        GenreItemBinding genreItemBinding = DataBindingUtil
                .inflate(layoutInflater, R.layout.item_genre_view, parent, false);

        return new GenreViewHolder(genreItemBinding);
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ArtistItemBinding artistItemBinding = DataBindingUtil
                .inflate(layoutInflater, R.layout.item_artist_view, parent, false);
        return new ArtistViewHolder(artistItemBinding);
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Artist artist = (Artist) group.getItems().get(childIndex);
        holder.bindView(artist);
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {
        Genre genre = (Genre) group;
        holder.bindView(genre);
    }
}
