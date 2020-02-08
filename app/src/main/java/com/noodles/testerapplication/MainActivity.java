package com.noodles.testerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout otherLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("hehe","entering onCreate");
        setContentView(R.layout.activity_main);
        context = getApplicationContext();
        otherLayout = (FrameLayout)getLayoutInflater().inflate(R.layout.framer, null);
        Button otherButton = (Button)otherLayout.findViewById(R.id.button009);

        Log.d("beforeafter","text before: " + otherButton.getText().toString());

        otherButton.setText("Good");
        otherButton.invalidate();

        Log.d("beforeafter","text after: " + otherButton.getText().toString());


        Button my_button = (Button)findViewById(R.id.button010);

        my_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CameraActivity.class);
                startActivity(intent);
            }
        });

        //framelist = (FrameLayout)getLayoutInflater().inflate(R.layout.mylistlayout, null);
    }

    static void Called(String id){

        switch (id){
            case "Hello2" : Log.d("hehe","see hello2");
            break;
            case "Hello" : Log.d("hehe","see hello");
            break;
            case "Good"  : Log.d("hehe","see good");
            break;

        }

    }
}
