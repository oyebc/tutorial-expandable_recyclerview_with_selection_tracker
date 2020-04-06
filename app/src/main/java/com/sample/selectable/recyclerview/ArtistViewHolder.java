package com.sample.selectable.recyclerview;


import com.sample.selectable.recyclerview.databinding.ArtistItemBinding;
import com.sample.selectable.recyclerview.model.Artist;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ArtistViewHolder extends ChildViewHolder {

    private ArtistItemBinding artistItemBinding;

    public ArtistViewHolder(ArtistItemBinding itemBinding) {
        super(itemBinding.getRoot());
        this.artistItemBinding = itemBinding;
    }

    public void bindView(final Artist artist){
        artistItemBinding.setArtist(artist);
    }
}
