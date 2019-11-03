package com.azhar.table.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.azhar.table.R;
import com.azhar.table.model.MovieModel;

import java.util.List;

/**
 * Created by Azhar Rivaldi on 03/11/2019.
 */

public class TableViewAdapter extends RecyclerView.Adapter {

    private List<MovieModel> movieList;

    public TableViewAdapter(List<MovieModel> movieList) {
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.table_list_item, parent, false);

        return new RowViewHolder(itemView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        RowViewHolder rowViewHolder = (RowViewHolder) holder;

        int rowPos = rowViewHolder.getAdapterPosition();

        if (rowPos == 0) {

            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_header_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_header_cell_bg);

            rowViewHolder.txtRank.setText("Rank");
            rowViewHolder.txtMovieName.setText("Name");
            rowViewHolder.txtYear.setText("Year");
            rowViewHolder.txtCost.setText("Budget");
        } else {
            MovieModel modal = movieList.get(rowPos - 1);

            rowViewHolder.txtRank.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtMovieName.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtYear.setBackgroundResource(R.drawable.table_content_cell_bg);
            rowViewHolder.txtCost.setBackgroundResource(R.drawable.table_content_cell_bg);

            rowViewHolder.txtRank.setText(modal.getRank() + "");
            rowViewHolder.txtMovieName.setText(modal.getMovieName());
            rowViewHolder.txtYear.setText(modal.getYear() + "");
            rowViewHolder.txtCost.setText(modal.getBudgetInMillions() + "");
        }
    }

    @Override
    public int getItemCount() {
        return movieList.size() + 1;
    }

    public class RowViewHolder extends RecyclerView.ViewHolder {
        TextView txtRank;
        TextView txtMovieName;
        TextView txtYear;
        TextView txtCost;

        RowViewHolder(View itemView) {
            super(itemView);
            txtRank = itemView.findViewById(R.id.txtRank);
            txtMovieName = itemView.findViewById(R.id.txtMovieName);
            txtYear = itemView.findViewById(R.id.txtYear);
            txtCost = itemView.findViewById(R.id.txtCost);
        }
    }
}
