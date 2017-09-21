package com.bignerdranch.android.customer_management;

import android.content.Intent;
import android.graphics.Camera;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void onClick(View view) {
        Intent intent = new Intent(CameraActivity.this, Camera.class);
        startActivity(intent);
    }


}
