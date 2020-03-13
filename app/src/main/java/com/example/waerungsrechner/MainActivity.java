package com.example.waerungsrechner;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void betragUmrechnen(View view) {

        // Log.i("info", "Button hinzugefügt");

        EditText editText = findViewById(R.id.betrag);

        String amountInDollars = editText.getText().toString();

        double amountInDollarsDouble = Double.parseDouble(amountInDollars);

        double amountInEurosDouble = amountInDollarsDouble * (1.0 / 1.2);

        String amountInEuroString = String.format("%.2f", amountInEurosDouble);

        Toast.makeText(this, amountInEuroString + " Euro", Toast.LENGTH_SHORT).show();

    }
}
