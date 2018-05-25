package com.example.miguel_rojas.appmundial.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.miguel_rojas.appmundial.R;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MapasFragment extends Fragment implements OnMapReadyCallback {


    private GoogleMap mMap;
    MapView mMapView;
    View mView;
    private View popup=null;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       mView=inflater.inflate(R.layout.fragment_mapas, container, false);
        return mView;

    }

   public void onViewCreated(View view, @Nullable Bundle savedInstanceState){

        mMapView = (MapView) mView.findViewById(R.id.map);

        if(mMapView!=null){
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);

        }


   }
    @Override
    public void onMapReady(GoogleMap googleMap) {


        MapsInitializer.initialize(getContext());

        mMap =googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        mMap.addMarker(new MarkerOptions().position(new LatLng(55.755826, 37.6173)).title("RUSIA").snippet("MOSCU"));

        googleMap.addMarker(new MarkerOptions().position(new LatLng(59.972728,30.221405)).title("San Petesburgo").snippet("San Petesburgo Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(54.698042,20.533895)).title("Kaliningrado").snippet("Kaliningrad Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(56.337287, 43.963251)).title("Nizhny Nóvgorod").snippet("Nizhny Nóvgorod Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(55.817765, 37.440363)).title("Moscú").snippet("Spartak Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(43.402066, 39.955939)).title("Sochi").snippet("Fisht Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(55.715762, 37.553716)).title("Moscú").snippet("Luzhniki Stadium"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(56.832476, 60.573582)).title("Ekaterimburgo").snippet("Ekaterinburg Arena"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(55.820983, 49.160966)).title("Kazán").snippet("Kazan Arena"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(54.181795, 45.203851)).title("Saranks").snippet("Mordovia Arena"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(53.278133, 50.237481)).title("Samara").snippet("Samara Arena"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(48.734541, 44.548529)).title("Volgogrado").snippet("Volgrad Arena"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(47.209758, 39.739132)).title("Rostov del Don").snippet("Rostov Arena"));


        CameraPosition liberty = CameraPosition.builder().target(new LatLng(55.755826, 37.6173)).bearing(0).tilt(45).build();
        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(liberty));

    }
}
