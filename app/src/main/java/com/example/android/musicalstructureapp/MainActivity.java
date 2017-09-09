package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albums = (TextView) findViewById(R.id.albums);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        TextView artists = (TextView) findViewById(R.id.artists);
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(artistsIntent);
            }
        });

        TextView genres = (TextView) findViewById(R.id.genres);
        genres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, Genres.class);
                startActivity(genresIntent);
            }
        });

        TextView playlists = (TextView) findViewById(R.id.playlists);
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, Playlists.class);
                startActivity(playlistsIntent);
            }
        });

        final TextView songs = (TextView) findViewById(R.id.songs);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(songsIntent);
            }
        });
    }
}

