package com.alik.table;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;

import com.alik.table.R;

import java.util.Map;

public class PrefFragment extends PreferenceFragment{

//implements SharedPreferences.OnSharedPreferenceChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource( R.xml.pref);

//        Preference pref = findPreference( "developer" );
//        pref.setSummary("Куканов");

//        Preference pref1 = findPreference( "version" );
//        pref1.setSummary(BuildConfig.VERSION_NAME);


       // getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

//    @Override
//    public void onResume() {
//        super.onResume();
//        for (int i = 0; i < getPreferenceScreen().getPreferenceCount(); ++i) {
//            Preference preference = getPreferenceScreen().getPreference(i);
//            if (preference instanceof PreferenceGroup) {
//                PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
//                for (int j = 0; j < preferenceGroup.getPreferenceCount(); ++j) {
//                    Preference singlePref = preferenceGroup.getPreference(j);
//                    updatePreference(singlePref, singlePref.getKey());
//                }
//            } else {
//                updatePreference(preference, preference.getKey());
//            }
//        }
//    }
//
//    @Override
//    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
//        updatePreference(findPreference(key), key);
//    }
//
//    private void updatePreference(Preference preference, String key) {
//        if (preference == null) return;
//        if (preference instanceof ListPreference) {
//            ListPreference listPreference = (ListPreference) preference;
//            listPreference.setSummary(listPreference.getEntry());
//            return;
//        }
//        SharedPreferences sharedPrefs = getPreferenceManager().getSharedPreferences();
//        preference.setSummary(sharedPrefs.getString(key, "Default"));
//    }

}
