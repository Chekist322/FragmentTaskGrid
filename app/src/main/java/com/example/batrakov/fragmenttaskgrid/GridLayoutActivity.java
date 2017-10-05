package com.example.batrakov.fragmenttaskgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Main app activity.
 * Container for GridLayoutFragment.
 */
public class GridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle aSavedInstanceState) {
        super.onCreate(aSavedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
