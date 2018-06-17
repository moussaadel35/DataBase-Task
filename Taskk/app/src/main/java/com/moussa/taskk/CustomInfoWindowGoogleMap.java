package com.moussa.taskk;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomInfoWindowGoogleMap implements GoogleMap.InfoWindowAdapter {
    private Context context;
GsonFormat t = new GsonFormat();
public  void tt(GsonFormat ex){
    this.t=ex;

}

    public CustomInfoWindowGoogleMap(Context ctx){
        context = ctx;

    }
    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    String s = null;
    public void set_values(String s){
        this.s =s;
    }




    @Override
    public View getInfoContents(Marker marker) {


        View view = ((Activity)context).getLayoutInflater().inflate(R.layout.info_window,null);
        TextView city_name,temp,min_temp,max_temp,humidity,presure,wind_speed
                ,degree,discription;
        city_name=view.findViewById(R.id.city_name);
        temp =view.findViewById(R.id.temp);
        min_temp=view.findViewById(R.id.min_tep);
        max_temp=view.findViewById(R.id.max_temp);
        humidity=view.findViewById(R.id.humidity);
        presure=view.findViewById(R.id.pressure);
        wind_speed=view.findViewById(R.id.wind_speed);
        discription=view.findViewById(R.id.discription);
        city_name.setText(marker.getTitle());

        city_name.setText(s);

        return view;
    }
}
