package com.zhukova.domashka4;

import androidx.annotation.LongDef;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new Car("automatic", 150, 0 );
        if (car == null){
            Log.d ("Dom4", "Объект не создан");
            return;
        }

        Log.d("Dom4", car.getTransmissionType() + " " + car.getEnginePower() + " " + car.getCurrentSpeed());

        car.changeSpeed(10);
        Log.d("Dom4", car.getTransmissionType() + " " + car.getEnginePower() + " " + car.getCurrentSpeed());

    }
}