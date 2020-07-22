package com.github.falchio.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout textInputLayout;
    TextInputEditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textInputLayout = findViewById(R.id.textField);
        editText = findViewById(R.id.edit_text);

        editText.addTextChangedListener(new MyTextWatcher());
        editText.setOnFocusChangeListener((v, hasFocus) -> {
            if (!hasFocus) {
                checkText(((EditText) v).getText());
            }
        });


        Button loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(v -> startApp());
    }

    private void startApp() {
        try {
            if (Objects.requireNonNull(editText.getText()).toString().isEmpty()) {
                Snackbar.make(editText, R.string.enter_something,Snackbar.LENGTH_SHORT).show();
                checkText(editText.getText());
                return;
            }
            startActivity(new Intent(this, MainActivity.class));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private class MyTextWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
        }

        @Override
        public void afterTextChanged(Editable s) {
            checkText(s);
        }
    }

    private void checkText(Editable s) {
        if (s.toString().isEmpty()) {
            editText.setError(getResources().getString(R.string.enter_something));
        }
    }

}