package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";
    TextView mDisplayText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mDisplayText = (TextView) findViewById(R.id.tv_detail);

        Intent intentThatStartThisActivity = getIntent();
        if(intentThatStartThisActivity.hasExtra(Intent.EXTRA_TEXT))
            mDisplayText.setText(intentThatStartThisActivity.getStringExtra(Intent.EXTRA_TEXT));
    }
}