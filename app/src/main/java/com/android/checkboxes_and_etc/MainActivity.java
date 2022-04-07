package com.android.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbChocolate, cbSprinkles, cbCrushedNuts, cbCherries, cbOrio;
    Button btnShowToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbChocolate = findViewById(R.id.cbChocolate);
        cbSprinkles = findViewById(R.id.cbSprinkles);
        cbCrushedNuts = findViewById(R.id.cbCrushedNuts);
        cbCherries = findViewById(R.id.cbCherries);
        cbOrio = findViewById(R.id.cbOrio);
    }

    public void showToast(View view) {
        String toppings = "Toppings: ";
        if(cbChocolate.isChecked()){
            toppings += cbChocolate.getText() + " ";
        }
        if(cbSprinkles.isChecked()){
            toppings += cbSprinkles.getText() + " ";
        }
        if(cbCrushedNuts.isChecked()){
            toppings += cbCrushedNuts.getText() + " ";
        }
        if(cbCherries.isChecked()){
            toppings += cbCherries.getText() + " ";
        }
        if(cbOrio.isChecked()){
            toppings += cbOrio.getText() + " ";
        }
        Toast.makeText(MainActivity.this, toppings, Toast.LENGTH_SHORT).show();
    }
}