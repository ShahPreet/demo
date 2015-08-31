package com.example.shah.autocompletetext;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class MainActivity extends ActionBarActivity {
    String[] name = {"Preet", "Dhrumil" , "Mitresh", "Keval","Tarang" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adt = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.select_dialog_item,name);
        actv.setThreshold(1);
        actv.setAdapter(adt);
        actv.setTextColor(Color.RED);
    }


}
