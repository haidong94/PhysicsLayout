package com.example.dong.physicslayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jawnnypoo.physicslayout.PhysicsLinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        PhysicsLinearLayout physicsLinearLayout= (PhysicsLinearLayout) findViewById(R.id.physic_layout);
        physicsLinearLayout.getPhysics().enableFling();
    }
}
