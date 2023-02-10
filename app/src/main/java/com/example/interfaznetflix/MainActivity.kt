package com.example.interfaznetflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.interfaznetflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList: RecyclerView = findViewById(R.id.recyclerView) // (1)

        val movieAdapter = MovieAdapter{ movie -> onItemClick(movie) } // (2)
        movieList.adapter = movieAdapter // (3)
        movieList.layoutManager = LinearLayoutManager(this) // (3.1)
        movieList.setHasFixedSize(true) // (3.2)

        movieAdapter.submitList(Movie.data)
    }

    private fun onItemClick(movie: Movie) {
        Toast.makeText(this, movie.title, Toast.LENGTH_SHORT).show()
    }
}