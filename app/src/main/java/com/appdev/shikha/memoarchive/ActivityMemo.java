package com.appdev.shikha.memoarchive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ActivityMemo extends AppCompatActivity {
    Toolbar mtool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        mtool=(Toolbar)findViewById(R.id.toolbar);
    }
}
