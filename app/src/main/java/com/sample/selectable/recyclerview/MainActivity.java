package com.sample.selectable.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.sample.selectable.recyclerview.databinding.MainActivityBinding;

public class MainActivity extends AppCompatActivity {

    private MainActivityBinding mainActivityBinding;
    private GenreListAdapter genreListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        genreListAdapter = new GenreListAdapter(DataFactory.getMusicGenres());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mainActivityBinding.genreList.setLayoutManager(layoutManager);
        mainActivityBinding.genreList.setAdapter(genreListAdapter);

        DividerItemDecoration itemDecoration = new DividerItemDecoration(this,
                layoutManager.getOrientation());
        mainActivityBinding.genreList.addItemDecoration(itemDecoration);

    }
}
