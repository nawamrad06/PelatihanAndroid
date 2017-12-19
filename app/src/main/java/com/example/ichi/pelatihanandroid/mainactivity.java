package com.example.ichi.pelatihanandroid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ICHI on 12/19/2017.
 */

public class mainactivity extends AppCompatActivity {

    @BindView(R.id.tvUsername)TextView tvUname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        ButterKnife.bind(mainactivity.this);

        //TextView tvUname = (TextView) findViewById(R.id.tvUname);
        String username = getIntent().getStringExtra("userN");
        tvUname.setText(username);
    }
}
