package com.example.taremapas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

import com.google.android.gms.maps.model.BitmapDescriptorFactory

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
        val house2 = LatLng(23.135619, -82.347477)
        val house3 = LatLng(29.953772, -90.069606)
        val house4 = LatLng(25.812429, -80.123093)
        val house5 = LatLng(-12.046316, -77.030073)
        val house6 = LatLng(-13.517432, -71.978632)
        val house7 = LatLng(-34.636659, -58.364679)



        mMap.addMarker(MarkerOptions().position(house1).title("Marker in CALACOTO").icon(BitmapDescriptorFactory.fromResource(R.drawable.seninmode)))
        mMap.addMarker(MarkerOptions().position(house2).title("Marker in Sanmiguel").icon(BitmapDescriptorFactory.fromResource(R.drawable.uchiha)))
        mMap.addMarker(MarkerOptions().position(house3).title("Marker in irpavi").icon(BitmapDescriptorFactory.fromResource(R.drawable.akat)))
        mMap.addMarker(MarkerOptions().position(house4).title("Marker in achumani").icon(BitmapDescriptorFactory.fromResource(R.drawable.cloud)))
        mMap.addMarker(MarkerOptions().position(house5).title("Marker in san pedro").icon(BitmapDescriptorFactory.fromResource(R.drawable.sharinga)))
        mMap.addMarker(MarkerOptions().position(house6).title("Marker in plaza san pedro").icon(BitmapDescriptorFactory.fromResource(R.drawable.senju)))
        mMap.addMarker(MarkerOptions().position(house7).title("Marker in stadium").icon(BitmapDescriptorFactory.fromResource(R.drawable.sand)))

        // mMap.moveCamera(CameraUpdateFactory.newLatLng(house1))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(house1, 16f))
    }
}
