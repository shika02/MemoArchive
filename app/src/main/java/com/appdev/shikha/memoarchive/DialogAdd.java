package com.appdev.shikha.memoarchive;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.appdev.shikha.memoarchive.beans.Memo;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by shikha on 8/5/16.
 */
public class DialogAdd extends DialogFragment {


    private ImageButton Crossbtn;
    private EditText dialogedittext;
    private TextView dialogtextview;
    private DatePicker datepicker;
    private Button additbtn;
    private View.OnClickListener btnclicklistener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int id=v.getId();
            switch(id) {
                case R.id.add_it_btn:
                    addAction();

            }
            dismiss();
        }
    };

    private void addAction() {
     String what=dialogedittext.getText().toString();
        long now =System.currentTimeMillis();
        RealmConfiguration realmConfiguration=new RealmConfiguration.Builder(getActivity()).build();
        Realm.setDefaultConfiguration(realmConfiguration);
        Realm realm= Realm.getDefaultInstance();
        Memo memo=new Memo(what,now,0,false);
        realm.beginTransaction();
        realm.copyToRealm(memo);
        realm.commitTransaction();
        realm.close();

    }

    public DialogAdd() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Crossbtn=(ImageButton)view.findViewById(R.id.img_crossbtn);
        datepicker=(DatePicker)view.findViewById(R.id.memodp);
        dialogedittext=(EditText)view.findViewById(R.id.dialog_editv);
        additbtn=(Button)view.findViewById(R.id.add_it_btn);
        Crossbtn.setOnClickListener(btnclicklistener);
        additbtn.setOnClickListener(btnclicklistener);
    }
}
