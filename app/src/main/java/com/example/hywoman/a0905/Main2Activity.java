package com.example.hywoman.a0905;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void NextScreen (View v) {
        Toast toast= Toast.makeText(getApplicationContext(), "hello ", Toast.LENGTH_SHORT ) ;
        toast.show();

        Intent i = new Intent( this, Main5Activity.class);
        startActivity(i);
    }
    public void onClick (View v) {
        EditText at = (EditText) findViewById(R.id.editText2);
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(at.getText());
    }
}
