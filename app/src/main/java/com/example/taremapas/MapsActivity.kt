package com.example.taremapas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap.uiSettings.isZoomControlsEnabled = true


        // Add a marker in Sydney and move the camera
        val house1 = LatLng(-16.542169, -68.085430)
        val house2 = LatLng(-16.532214, -68.075562)
        val house3 = LatLng(-16.525782, -68.086700)
        val house4 = LatLng(-16.526088, -68.109017)
        val house5 = LatLng(-16.505729, -68.136575)
        val house6 = LatLng(-16.502622, -68.134740)
        val house7 = LatLng(-16.499718, -68.121876)

        mMap.addMarker(MarkerOptions().position(house1).title("Marker in CALACOTO"))
        mMap.addMarker(MarkerOptions().position(house2).title("Marker in Sanmiguel"))
        mMap.addMarker(MarkerOptions().position(house3).title("Marker in irpavi"))
        mMap.addMarker(MarkerOptions().position(house4).title("Marker in achumani"))
        mMap.addMarker(MarkerOptions().position(house5).title("Marker in san pedro"))
        mMap.addMarker(MarkerOptions().position(house6).title("Marker in plaza san pedro"))
        mMap.addMarker(MarkerOptions().position(house7).title("Marker in stadium"))

        // mMap.moveCamera(CameraUpdateFactory.newLatLng(house1))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(house1, 16f))
    }
}
