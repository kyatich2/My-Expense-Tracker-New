package com.example.myexpensetracker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.graphics.Color;
import android.os.Bundle;

import com.kevinomyonga.droidonboarder.DroidOnBoarderFragment;

import java.util.ArrayList;
import java.util.List;

public class DroidOnBoarder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_droid_on_boarder);
    }

    @Override
    protected List<Fragment> populateOnBoarder(){

        List<Fragment> introSlides = new ArrayList<>();
        introSlides.add(DroidOnBoarderFragment.newInstance(R.mipmap.ic_launcher, "Title 1","Description 1", Color.WHITE, Color.WHITE));
        introSlides.add(DroidOnBoarderFragment.newInstance(R.mipmap.ic_launcher, "Title 2","Description 2", Color.WHITE, Color.WHITE));
        introSlides.add(DroidOnBoarderFragment.newInstance(R.mipmap.ic_launcher, "Title 3","Description 3", Color.WHITE, Color.WHITE));
        introSlides.add(DroidOnBoarderFragment.newInstance(R.mipmap.ic_launcher, "Title 4","Description 4", Color.WHITE, Color.WHITE));

        return introSlides;

    }

    @Override
    protected void finishOnBoarding() {
        finish();
    }

}
