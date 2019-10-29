package com.example.myexpensetracker;

//import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CategoryActivity extends AppCompatActivity {

    EditText input_spending;
    TextView view_record;
    Button save_amount;
    //String amount=input_spending.getText().toString();

    DatabaseReference mRootRef= FirebaseDatabase.getInstance().getReference();
    DatabaseReference mConditionRef=mRootRef.child("spending");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        input_spending=(EditText)findViewById(R.id.inputspending);
        view_record=(TextView)findViewById(R.id.viewspending);
        save_amount=(Button)findViewById(R.id.saveamount);


//        save_amount.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mConditionRef.setValue(5000);
//            }
//        });

    }
    @Override
    protected void onStart(){
        super.onStart();

//        mConditionRef.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                String text=dataSnapshot.getValue(String.class);
//                view_record.setText(text);
//
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError databaseError) {
//
//            }
//        });

        save_amount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConditionRef.setValue(5000);
            }
        });
    }

}
