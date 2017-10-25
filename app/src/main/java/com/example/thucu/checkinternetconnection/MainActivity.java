package com.example.thucu.checkinternetconnection;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCheck;
    InternetDetector internetDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCheck = (Button) findViewById(R.id.btnCheck);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkInternetConnection();

            }
        });

    }
    private void checkInternetConnection(){
        internetDetector = new InternetDetector(this);
        if (internetDetector.isConnected()){
            Toast.makeText(MainActivity.this, "Internet connected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Internet disconnected", Toast.LENGTH_SHORT).show();
        }
    }

}
