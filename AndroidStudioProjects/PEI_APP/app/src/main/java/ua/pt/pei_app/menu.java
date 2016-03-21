package ua.pt.pei_app;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.HashMap;
import java.util.Map;

public class menu extends AppCompatActivity implements OnMapReadyCallback {


    /**
     * Request code for location permission request.
     *
     * @see #onRequestPermissionsResult(int, String[], int[])
     */
    private static final int LOCATION_PERMISSION_REQUEST_CODE = 1;

    /**
     * Flag indicating whether a requested permission has been denied after returning in
     * {@link #onRequestPermissionsResult(int, String[], int[])}.
     */
    private boolean mPermissionDenied = false;
    private String userLog;
    private String pathToFirebase;
    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        // Email do user com o login feito
        Firebase myFirebaseRef = new Firebase("https://pei.firebaseio.com");
        userLog = myFirebaseRef.getAuth().getUid();
        final Button button = (Button) findViewById(R.id.button);
        final Button button2 = (Button) findViewById(R.id.button2);
        final Button button3 = (Button) findViewById(R.id.button3);
        final TextView tv1 = (TextView) findViewById(R.id.textView);

        tv1.setText("Bem Vindo " + myFirebaseRef.getAuth().getProviderData().get("email"));
        pathToFirebase = "https://pei.firebaseio.com/Demo/Blue/";


        final LinearLayout LL1 = (LinearLayout) findViewById(R.id.linearLayout1);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                pathToFirebase = "https://pei.firebaseio.com/Demo/Red/";
                Toast.makeText(getBaseContext(), "You are RED TEAM", Toast.LENGTH_SHORT).show();
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                LL1.setBackgroundColor(Color.RED);
                button.setVisibility(View.VISIBLE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pathToFirebase = "https://pei.firebaseio.com/Demo/Blue/";
                Toast.makeText(getBaseContext(), "You are BLUE TEAM", Toast.LENGTH_SHORT).show();
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button.setVisibility(View.VISIBLE);
            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Firebase myFirebaseRef = new Firebase(pathToFirebase);


                GPSModule gps = new GPSModule(menu.this);

                // Check if GPS enabled
                if (gps.canGetLocation()) {

                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();

                    Firebase postRef = myFirebaseRef.child(userLog);
                    Firebase newPostRef = postRef.push();

                    Map<String, Object> hMap = new HashMap<String, Object>();
                    hMap.put("heartRate", 93);
                    hMap.put("lat", latitude);
                    hMap.put("lng", longitude);
                    //Map<String, Map<String, Object>> addData = new HashMap<String, Map<String, Object>>();

                    newPostRef.setValue(hMap);


                    //Map<String, Object> coordinates = new HashMap<String, Object>();
                    //coordinates.put("heartRate", "80");
                    //coordinates.put("lat", latitude);
                    //coordinates.put("long", longitude);
                    //ref.updateChildren(coordinates);


                    //ref.child("lat").setValue(latitude);
                    //ref.child("long").setValue(longitude);

                    Toast.makeText(getBaseContext(), "Coordinates sent to DB", Toast.LENGTH_SHORT).show();

                } else {
                    // Can't get location.
                    // GPS or network is not enabled.
                    // Ask user to enable GPS/network in settings.
                    gps.showSettingsAlert();
                }


            }
        });


    }


    @Override
    public void onMapReady(GoogleMap googleMap) {


        // Get a reference to our posts
        Firebase ref = new Firebase(pathToFirebase + userLog);
        Firebase ref2 = new Firebase(pathToFirebase + "5af5ca80-1793-4bdb-96ce-b3ccbf881272/-KCoq-9CaWvNBI0KFcNN/");

        mMap = googleMap;
        GPSModule sc = new GPSModule(menu.this);

        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                // Add a marker in my position and move the camera
                PlayerClass facts = snapshot.getValue(PlayerClass.class);
                LatLng xy = new LatLng(facts.getLat(),facts.getLng());
                mMap.addMarker(new MarkerOptions()
                        .icon(BitmapDescriptorFactory.fromResource(R.drawable.pait))
                        .anchor(0.2f, 1.0f) // Anchors the marker on the bottom left
                        .position(xy).title("Player1"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(xy));
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {
            }
        });




    }

}




