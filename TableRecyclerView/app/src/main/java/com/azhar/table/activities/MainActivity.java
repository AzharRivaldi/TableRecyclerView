package com.azhar.table.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.azhar.table.R;
import com.azhar.table.adapter.TableViewAdapter;
import com.azhar.table.model.MovieModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Azhar Rivaldi on 03/11/2019.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewDeliveryProductList);

        TableViewAdapter adapter = new TableViewAdapter(getMovieList());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private List<MovieModel> getMovieList() {
        List<MovieModel> movieList = new ArrayList<>();

        movieList.add(new MovieModel(1, "Pirates of the Caribbean: On Stranger Tides", 2011, 378));
        movieList.add(new MovieModel(2, "Avengers: Age of Ultron", 2015, 365));
        movieList.add(new MovieModel(3, "Avengers: Infinity War", 2018, 316));
        movieList.add(new MovieModel(4, "Pirates of the Caribbean: At World's End", 2007, 300));
        movieList.add(new MovieModel(5, "Justice League", 2017, 300));
        movieList.add(new MovieModel(6, "Solo: A Star Wars Story", 2018, 275));
        movieList.add(new MovieModel(7, "John Carter", 2012, 264));
        movieList.add(new MovieModel(8, "Batman v Superman: Dawn of Justice", 2016, 263));
        movieList.add(new MovieModel(9, "Star Wars: The Last Jedi", 2017, 263));
        movieList.add(new MovieModel(10, "Tangled", 2010, 260));

        return movieList;
    }
}
