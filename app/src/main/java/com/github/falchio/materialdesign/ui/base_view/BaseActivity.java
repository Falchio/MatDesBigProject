package com.github.falchio.materialdesign.ui.base_view;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.falchio.materialdesign.R;

abstract public class BaseActivity extends AppCompatActivity {
    private static final String THEME_TAG = "AppTheme";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setThemeForApp();
        super.onCreate(savedInstanceState);
    }


    private void setThemeForApp() {
        SharedPreferences sharedPref = getSharedPreferences(THEME_TAG,MODE_PRIVATE);
        boolean isDefaultTheme = sharedPref.getBoolean(THEME_TAG, true);

        if (isDefaultTheme) {
            setTheme(R.style.MainTheme);
        } else {
            setTheme(R.style.SecondTheme);
        }
    }
}
