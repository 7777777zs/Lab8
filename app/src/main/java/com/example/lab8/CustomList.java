package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    public int getCount(){
        return cities.size();
    }

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void addCity(City city){
//        if (cities.contains(city)) {
//            throw new IllegalArgumentException();
//        }
//        cities.add(city);
    }

    /**
     * This returns whether or not the city belongs in the list
     * @param city
     * This is a given city
     * @return
     * Return whether or not the city belongs in the list
     */
    public boolean hasCity(City city) {
//        return cities.contains(city);
        return false;
    }

    /**
     * This delete a city to the list if the city exist
     * @param city
     * This is a candidate city to delete
     */
    public void deleteCity(City city) {
//        if (!cities.contains(city)) {
//            throw new IllegalArgumentException(("City not found in the list!"));
//        }else {
//            cities.remove(city);
//        }
    }

    /**
     * This return how many cities are in the list
     * @return
     * Return how many cities are in the list
     */
    public int countCities() {
//        return cities.size();
        return 0;
    }
}
