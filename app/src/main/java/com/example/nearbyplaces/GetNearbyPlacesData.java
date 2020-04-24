package com.example.nearbyplaces;

import android.os.AsyncTask;

import com.google.android.gms.maps.GoogleMap;

public class GetNearbyPlacesData extends AsyncTask<Object,String,String> {

    String googlePlacesData;
    GoogleMap googleMap;
    String url;


    @Override
    protected String doInBackground(Object... objects) {
        googleMap = (GoogleMap) objects[0];
        url = (String) objects[1];
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
