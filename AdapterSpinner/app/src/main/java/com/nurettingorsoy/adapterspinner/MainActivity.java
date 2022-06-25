package com.nurettingorsoy.adapterspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView textView;

    ArrayAdapter<String> adapter;
    ArrayList<String> liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);

        liste = new ArrayList<>();
        liste.add("Matematik");
        liste.add("Fizik");
        liste.add("Biyoloji");
        liste.add("Kimya");
        liste.add("Sağlık");
        liste.add("Bilgisayar");

        adapter = new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,liste);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(liste.get(position));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
