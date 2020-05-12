package com.alik.table;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class MyPreferenceActivity extends PreferenceActivity  {


    //----------------------------------------------------------------------------------------

    public SwitchPreference switchPref;
    SharedPreferences sharedPreferences;
    //Preference btn_ping_ip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getFragmentManager().beginTransaction()
//                .replace(android.R.id.content, new PrefFragment())
//                .commit();
        addPreferencesFromResource(R.xml.pref);

        // PreferenceScreen ver = (PreferenceScreen) findPreference("version");
        // ver.setSummary(BuildConfig.VERSION_NAME);

        //btn_ping_ip = findPreference("btn_ping_ip");

//        sharedPreferences = getPreferenceScreen().getSharedPreferences();
//        sharedPreferences.registerOnSharedPreferenceChangeListener(this);

    }

    // ---------------------------------------------------------------------------------------


    @Override
    public void onBackPressed() {

        Intent intent = getIntent();

//        SwitchPreference pref = (SwitchPreference)findPreference("book_counter_view");
//
//        if (pref != null) {
//            intent.putExtra("book_counter_view", pref.isChecked());
//        }

        setResult(RESULT_OK, intent);
        finish();

    }

    // ---------------------------------------------------------------------------------------

}
