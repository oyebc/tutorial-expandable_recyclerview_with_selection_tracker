package com.sample.selectable.recyclerview;

import com.sample.selectable.recyclerview.model.Artist;
import com.sample.selectable.recyclerview.model.Genre;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DataFactory {

    public static List<Genre> getMusicGenres(){
        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre("Jazz", getJazzArtists()));
        genres.add(new Genre("AfroHouse", getAfroHouseArtists()));
        genres.add(new Genre("Afrobeats", getAfroBeatArtists()));

        return genres;
    }

    private static List<Artist> getAfroBeatArtists() {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(UUID.randomUUID().toString(), "Wizkid", Artist.Status.ACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "Burna Boy", Artist.Status.INACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "Davido", Artist.Status.ACTIVE));
        return artists;
    }

    private static List<Artist> getAfroHouseArtists() {

        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(UUID.randomUUID().toString(), "Niniola", Artist.Status.ACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "Black Coffee", Artist.Status.INACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "Liquideep", Artist.Status.INACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "DJ Lengoma", Artist.Status.INACTIVE));

        return artists;
    }

    private static List<Artist> getJazzArtists() {
        List<Artist> artists = new ArrayList<>();
        artists.add(new Artist(UUID.randomUUID().toString(), "Gregory Porter", Artist.Status.ACTIVE));
        artists.add(new Artist(UUID.randomUUID().toString(), "Miles Davis", Artist.Status.ACTIVE));
        return artists;
    }


}
