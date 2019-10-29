package com.example.myexpensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity {
    ImageView catbtn;
    //FirebaseAuth mFirebaseAuth;
    //private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        catbtn = findViewById(R.id.food);

        catbtn.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {
                //FirebaseAuth.getInstance().signOut();
                Intent move = new Intent(HomeActivity.this,CategoryActivity.class);
                startActivity(move);
            }
        });
    }
}
