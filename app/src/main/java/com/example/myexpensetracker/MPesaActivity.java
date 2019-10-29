package com.example.myexpensetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.bdhobare.mpesa.Mode;
import com.bdhobare.mpesa.Mpesa;
import com.bdhobare.mpesa.interfaces.AuthListener;
import com.bdhobare.mpesa.interfaces.MpesaListener;
import com.bdhobare.mpesa.models.STKPush;
import com.bdhobare.mpesa.utils.Pair;

public class MPesaActivity extends AppCompatActivity implements AuthListener, MpesaListener{
    public static final String SHARED_PREFERENCES = "com.bdhobare.mpesa_android_sdk";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpesa);

        Mpesa.with(MPesaActivity.this,"80ctwGRahrdvOsIWd3sXvzWdHOfi1YWN","9r074TLGZSt8p8nM", Mode.SANDBOX);

        STKPush.Builder builder = new STKPush.Builder("174379","bfb279f9aa9bdbcf158e97dd71a467cd2e0c893059b10f78e6b72ada1ed2c919",1000,"testapi786","254708374149");
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFERENCES, MODE_PRIVATE);
        String token = sharedPreferences.getString("InstanceID","");
        builder.setFirebaseRegID(token);
        STKPush push = builder.build();
        Mpesa.getInstance().pay(MPesaActivity.this, push);
    }

    @Override
    public void onAuthError(Pair<Integer, String> result){
        Log.d("Mpesa",result.message);
    }
    @Override
    public void onAuthSuccess(){Log.d("Mpesa","Success");}
    @Override
    public void onMpesaError(Pair<Integer, String> result){
        Log.d("Mpesa","On mpesa Error"+result.message);
    }
    @Override
    public void onMpesaSuccess(String MerchantRequestID, String CheckoutRequestID, String CustomerMessage){
        Log.d("Mpesa",MerchantRequestID);
    }
}