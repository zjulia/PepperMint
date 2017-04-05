package com.apps.juliazhao.peppermint;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * This class saves data to the phone
 * To use this class, go to an activity and use
 *      AppData appData = new AppData(this)
 *      AppData is the class
 *      appData is the variable name
 *      new means you are creating a new instance
 *      this refers to the Activity Context
 */

public class AppData {
    public static final String KEY_EXAMPLE = "key_example";
    public static final String KEY_BOWLS_AMIN_SMOKED = "key_bowls_amin_smoked";
    public static final String KEY_SNACKS_JULIA_ATE = "key_snacks_julia_ate";
    public static final String KEY_SHOTS_JULIA_TOOK = "key_shots_julia_took";
    private static final String APP_SHARED_PREFS = AppData.class.getSimpleName(); //  Name of the file -.xml
    private SharedPreferences _sharedPrefs;
    private SharedPreferences.Editor _prefsEditor;

    public AppData(Context context) {
        this._sharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        this._prefsEditor = _sharedPrefs.edit();
    }

    public String getExample() {
        return _sharedPrefs.getString(KEY_EXAMPLE, "");
    }

    public void saveExample(String text) {
        _prefsEditor.putString(KEY_EXAMPLE, text);
        _prefsEditor.commit();
    }

    public int getBowlsAminSmoked() {
        return _sharedPrefs.getInt(KEY_BOWLS_AMIN_SMOKED, 0);
    }

    public int getSnacksJuliaAte() {
        return _sharedPrefs.getInt(KEY_SNACKS_JULIA_ATE, 0);
    }

    public int getShotsJuliaTook() {
        return _sharedPrefs.getInt(KEY_SHOTS_JULIA_TOOK, 0);
    }

    public void setBowlsAminSmoked(int numBowls) {
        _prefsEditor.putInt(KEY_EXAMPLE, numBowls);
        _prefsEditor.commit();
    }

    public void setSnacksJuliaAte(int numSnacks) {
        _prefsEditor.putInt(KEY_EXAMPLE, numSnacks);
        _prefsEditor.commit();
    }

    public void setShotsJuliaTook(int numShots) {
        _prefsEditor.putInt(KEY_EXAMPLE, numShots);
        _prefsEditor.commit();
    }

}
