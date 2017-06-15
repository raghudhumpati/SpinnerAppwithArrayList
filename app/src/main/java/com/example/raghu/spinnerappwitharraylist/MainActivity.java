package com.example.raghu.spinnerappwitharraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp=(Spinner)findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(this);

        ArrayList branches=new ArrayList();
        branches.add("AERO");
        branches.add("CSE");
        branches.add("ECE");
        branches.add("MECH");
        branches.add("CIVIL");

        ArrayAdapter data=new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,branches);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp.setAdapter(data);





    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        String item=parent.getItemAtPosition(position).toString();

        Toast.makeText(getApplicationContext(),item,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
