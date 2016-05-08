package com.appdev.shikha.memoarchive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActivityMemo extends AppCompatActivity {
    Toolbar mtool;
    Button mBtnadd;
    RecyclerView mrecyclerview;
    private View.OnClickListener mBtnaddListener =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showdialogmethod();

        }
    };

    private void showdialogmethod() {
        DialogAdd dialogadd=new DialogAdd();
        dialogadd.show(getSupportFragmentManager(),"addmemo");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);
        mtool=(Toolbar)findViewById(R.id.toolbar);
        mBtnadd=(Button)findViewById(R.id.add_it_btn);
        mrecyclerview=(RecyclerView)findViewById(R.id.rv_memo);
    }
}
