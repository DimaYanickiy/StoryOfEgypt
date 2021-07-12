package com.my.storyofegypt;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class Saver extends AppCompatActivity {

    public SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = getSharedPreferences("Conf", MODE_PRIVATE);
    }

    public String getUrlReference() {
        return sharedPreferences.getString("url", "");
    }

    public void setUrlReference(String url) {
        sharedPreferences.edit().putString("url", url).apply();
    }

    public boolean getFirst() {
        return sharedPreferences.getBoolean("first", true);
    }

    public void setFirst(boolean firstReference) {
        sharedPreferences.edit().putBoolean("first", firstReference).apply();
    }

    public boolean getFirstPlay() {
        return sharedPreferences.getBoolean("firstPlay", true);
    }

    public void setFirstPlay(boolean firstPlay) {
        sharedPreferences.edit().putBoolean("firstPlay", firstPlay).apply();
    }

    public boolean getFirstFlyerRecived() {
        return sharedPreferences.getBoolean("flyer", true);
    }

    public void setFirstFlyerRecived(boolean firstReference) {
        sharedPreferences.edit().putBoolean("flyer", firstReference).apply();
    }

    protected void onPause() {
        super.onPause();
    }
}
