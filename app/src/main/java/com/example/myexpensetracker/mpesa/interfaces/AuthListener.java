package com.example.myexpensetracker.mpesa.interfaces;

import com.example.myexpensetracker.mpesa.Mpesa;
import com.bdhobare.mpesa.utils.Pair;

/**
 * Created by miles on 18/11/2017.
 */

public interface AuthListener {
     void onAuthError(Pair<Integer, String> result);
     void onAuthSuccess();
}
//removed public from both void