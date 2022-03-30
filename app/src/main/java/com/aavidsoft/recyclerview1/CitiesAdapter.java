package com.aavidsoft.recyclerview1;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.CityViewHolder> {

    private ArrayList<String> citiesList;

    public CitiesAdapter(ArrayList<String> citiesList) {
        this.citiesList = citiesList;
    }

    class CityViewHolder extends RecyclerView.ViewHolder {

        TextView txtCity;

        public CityViewHolder(View itemView) {
            super(itemView);
            this.txtCity = (TextView) itemView;
        }

    }

    @Override
    public int getItemCount() {

        log("getItemCount " + citiesList.size());

        if (citiesList == null) {
            return 0;
        }

        return citiesList.size();
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        log("onCreateViewHolder");

        TextView txtCity = new TextView(parent.getContext());
        txtCity.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                )
        );
        txtCity.setTextSize(30);
        txtCity.setPadding(20, 10, 20, 10);

        return new CityViewHolder(txtCity);
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        log("onBindViewHolder");
        holder.txtCity.setText( citiesList.get(position) );
    }

    private void log(String text) {
        Log.e("tag", text);
    }
}
