package com.noodles.testerapplication;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CameraActivity extends AppCompatActivity
{

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.framer);
    }

    public void CallingMe(View view){
        String string = ((Button)view).getText().toString();
        Log.d("hehe","the string: " + string);

        String secondBranch = "this is the second branch stringy";

        if(string.matches("[hH]ello"))finish();
        else
        MainActivity.Called(string);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(isFinishing())Log.d("willdo","it is finishing");else Log.d("willdo","its not finishing");
    }
}


