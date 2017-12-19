package com.example.ichi.pelatihanandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ICHI on 12/19/2017.
 */

public class loginactivity extends AppCompatActivity {

    //private EditText uName;

    private static final String un = "ADMIN";
    private static final String pw = "1234";

    @BindView(R.id.edtUname)EditText uName;
    @BindView(R.id.edtPwd)EditText pWord;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginform);
        ButterKnife.bind(loginactivity.this);

        //Button btnLogin = (Button) findViewById(R.id.btnLogin);
        //uName = (EditText) findViewById(R.id.edtUname);

        //btnLogin.setOnClickListener(new View.OnClickListener() {
            //@Override
            //public void onClick(View v) {
                //String u = uName.getText().toString();
                //Intent i = new Intent(loginactivity.this, mainactivity.class);
                //i.putExtra("userN",u);
                //startActivity(i);
                //finish();
            //}
        //});
    }

    @OnClick(R.id.btnLogin)
    void gotoLogin(){
        if (validatePwd()){
            String u = uName.getText().toString();
            Intent i = new Intent(loginactivity.this, mainactivity.class);
            i.putExtra("userN",u);
            startActivity(i);
            finish();
        }else{
            Toast.makeText(this,"Username/Password Salah!!!",Toast.LENGTH_LONG).show();
        }
    }

    private boolean validatePwd(){
        String u = uName.getText().toString();
        String p = pWord.getText().toString();

        if(u.equals(un)&&p.equals(pw)){
            return true;
        }else {
            return false;
        }
    }
}
