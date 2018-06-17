package com.moussa.taskk;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback  {

    private GoogleMap mMap;

    private static final String TAG =MapsActivity.class.getName();
    public RequestQueue mRequestQueue;
    public static StringRequest cairo=null;
    public StringRequest aswan;
    public StringRequest alex;
    public StringRequest luxor;
    public StringRequest fayom;
    public StringRequest matroh;
    public StringRequest sinai;
    public StringRequest sohag;
    public StringRequest suez;
    public StringRequest ports;
    public StringRequest asyot;
    public StringRequest banysweef;
    public StringRequest domyat;
    public static   GsonFormat cairo_ob =null;
    GsonFormat aswan_ob = null;
    GsonFormat alex_ob =new GsonFormat();
    GsonFormat luxor_ob = new GsonFormat();
    GsonFormat fayom_ob=new GsonFormat();
    GsonFormat matroh_ob=new GsonFormat();
    GsonFormat sinai_ob = new GsonFormat();
    GsonFormat sohag_ob = new GsonFormat();
    GsonFormat suez_ob=new GsonFormat();
    GsonFormat ports_ob=new GsonFormat();
    GsonFormat asyot_ob= new GsonFormat();
    GsonFormat banysweef_ob=new GsonFormat();
    GsonFormat domyat_ob=new GsonFormat();


    final CustomInfoWindowGoogleMap cairo_info=new CustomInfoWindowGoogleMap(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        final SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



//        Thread myth=new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//
//
//            }
//        });
//        myth.start();

        //RequestQueue initialized


            mRequestQueue = Volley.newRequestQueue(MapsActivity.this);

            //String Request initialized
            cairo = new StringRequest(Request.Method.GET, Cities.cairo_url, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    GsonBuilder gsonBuilder = new GsonBuilder();
                    Gson gson = gsonBuilder.create();
                    cairo_ob = gson.fromJson(response, GsonFormat.class);

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {

                    Log.i(TAG, "Error :" + error.toString());
                }
            });

        aswan = new StringRequest(Request.Method.GET, Cities.aswan_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();

                Gson gson = gsonBuilder.create();
                aswan_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        alex= new StringRequest(Request.Method.GET, Cities.alex_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                alex_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        luxor= new StringRequest(Request.Method.GET, Cities.luxor_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                luxor_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        fayom= new StringRequest(Request.Method.GET, Cities.fayom_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                fayom_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        matroh= new StringRequest(Request.Method.GET, Cities.matroh_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                matroh_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        sinai= new StringRequest(Request.Method.GET, Cities.sinai_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                sinai_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        sohag= new StringRequest(Request.Method.GET, Cities.sohag_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                sohag_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });
        suez= new StringRequest(Request.Method.GET, Cities.suez_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                suez_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        ports= new StringRequest(Request.Method.GET, Cities.ports_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                ports_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        asyot= new StringRequest(Request.Method.GET, Cities.asyot_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                asyot_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });
        banysweef= new StringRequest(Request.Method.GET, Cities.banysweef_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                banysweef_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });

        domyat= new StringRequest(Request.Method.GET, Cities.domyat_url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                domyat_ob= gson.fromJson(response,GsonFormat.class);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(TAG,"Error :" + error.toString());
            }
        });
        mRequestQueue.add(cairo);
        mRequestQueue.add(aswan);
        mRequestQueue.add(alex);
        mRequestQueue.add(luxor);
        mRequestQueue.add(fayom);
        mRequestQueue.add(matroh);
        mRequestQueue.add(sinai);
        mRequestQueue.add(sohag);
        mRequestQueue.add(suez);
        mRequestQueue.add(ports);
        mRequestQueue.add(asyot);
        mRequestQueue.add(banysweef);
        mRequestQueue.add(domyat);
        mRequestQueue.start();




        // Add a marker in Sydney and move the camera
//AsyncTask task =new Asynk_trial(this);

        LatLng egypt = new LatLng(30.0626, 31.2497);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(egypt));


        //Marker
//        double cairo_lat=(double)cairo_ob.getCity().getCoord().getLat();
//        double cairo_lon =(double) cairo_ob.getCity().getCoord().getLon();


//        String trial = cairo_ob.getCity().getName();
//        cairo_info.set_values(trial);
//trial.tt(cairo_ob);


//double lat = aswan_ob.getCity().getCoord().getLat();
//double lon=aswan_ob.getCity().getCoord().getLon();
//        LatLng cairo_loc = new LatLng(lat,lon);




        MarkerOptions cairo_marker_option = new MarkerOptions();

        cairo_marker_option.position(egypt);



//    cairo_info.set_values(get());

        Marker marker=  mMap.addMarker(cairo_marker_option);
        mMap.setInfoWindowAdapter(cairo_info);
        mMap.addMarker(cairo_marker_option);
    }




}
