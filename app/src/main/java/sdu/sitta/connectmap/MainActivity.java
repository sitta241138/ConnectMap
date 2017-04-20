package sdu.sitta.connectmap;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }// Main Method

    public void callMap(View view){
        EditText Lattitude = (EditText) findViewById(R.id.mapLat);
        EditText Longtitude = (EditText) findViewById(R.id.mapLong);
        EditText Label = (EditText) findViewById(R.id.mapLabel);

        String numLat = Lattitude.getText().toString().trim();
        String numLong = Longtitude.getText().toString().trim();
        String StrLabe = Label.getText().toString().trim();

        //Uri location = Uri.parse("http://maps.google.com/maps?z=10&q=loc:13.759774,100.541484(ศูนย์รางน้ำ)");
        Uri location = Uri.parse("https://www.google.co.th/maps/place/%E0%B8%A1%E0%B8%AB%E0%B8%B2%E0%B8%A7%E0%B8%B4%E0%B8%97%E0%B8%A2%E0%B8%B2%E0%B8%A5%E0%B8%B1%E0%B8%A2%E0%B8%AA%E0%B8%A7%E0%B8%99%E0%B8%94%E0%B8%B8%E0%B8%AA%E0%B8%B4%E0%B8%95+%E0%B8%A8%E0%B8%B9%E0%B8%99%E0%B8%A2%E0%B9%8C%E0%B8%A3%E0%B8%B2%E0%B8%87%E0%B8%99%E0%B9%89%E0%B8%B3/@13.7594827,100.5393275,17z/data=!3m1!4b1!4m5!3m4!1s0x30e29eb82e78d797:0x451b4afc6dcf6b16!8m2!3d13.7594827!4d100.5415216?hl=th");

        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        //mapIntent.setPackage("com.google.android.apps.maps"); // Can not ues genymotion
        startActivity(mapIntent);
    }//End callMap


}// Main Class
