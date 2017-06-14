package com.example.enchanter_swapna.listdemoactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView tw1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tw1=(TextView) findViewById(R.id.textView3);

        String ab=getIntent().getStringExtra("abc");
        String abb=getIntent().getStringExtra("acb");
        tw1.setText(ab+" "+abb);

       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
