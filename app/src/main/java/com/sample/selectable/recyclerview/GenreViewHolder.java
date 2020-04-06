package com.sample.selectable.recyclerview;

import com.sample.selectable.recyclerview.databinding.GenreItemBinding;
import com.sample.selectable.recyclerview.model.Genre;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class GenreViewHolder extends GroupViewHolder {

    private GenreItemBinding itemBinding;

    public GenreViewHolder(GenreItemBinding itemBinding) {
        super(itemBinding.getRoot());
        this.itemBinding = itemBinding;
    }

    public void bindView(final Genre genre){
        itemBinding.setGenre(genre);
    }
}
