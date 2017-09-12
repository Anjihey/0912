package com.example.hywoman.a0905;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NextScreen (View v) {
        Toast toast= Toast.makeText(getApplicationContext(), "hello ", Toast.LENGTH_SHORT ) ;
        toast.show();

        Intent i = new Intent( this, Main2Activity.class);
        startActivity(i);
    }


}
