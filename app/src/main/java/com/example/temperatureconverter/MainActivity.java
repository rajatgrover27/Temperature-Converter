package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    public void OnConverterClick(View view){

        EditText editText = findViewById(R.id.editTextNumberDecimal);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInFahrenheit = (inputInDouble*9/5)+32;
        String outputInFahrenheitF=outputInFahrenheit.toString();
        EditText editText1=findViewById(R.id.editTextNumberDecimal1);
        editText1.setText(outputInFahrenheitF);
    }
    public void OnConverterClick1(View view){

        EditText editText = findViewById(R.id.editTextNumberDecimal1);
        String inputInString = editText.getText().toString();
        Double inputInDouble = Double.parseDouble(inputInString);
        Double outputInCelsius = (inputInDouble-32)*(5/9);
        String outputInCelsiusF=outputInCelsius.toString();
        EditText editText1=findViewById(R.id.editTextNumberDecimal);
        editText1.setText(outputInCelsiusF);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
