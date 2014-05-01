package com.secxplrd.peas.main;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

/**
 * Created by k3rn3l on 5/1/2014.
 */
public class MailInfo extends Activity {
    EditText etUser, etPass;
    Button btSubmit;
    TextView tvResult;
    String userName, passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_account_info);

        etUser = (EditText)findViewById(R.id.etUser);
        etPass = (EditText)findViewById(R.id.etPass);
        btSubmit = (Button)findViewById(R.id.btSubmit);
        tvResult = (TextView)findViewById(R.id.tvResult);
        userName = etUser.getText().toString();
        passWord = etPass.getText().toString();

        btSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                tvResult.setText(userName+passWord);
            }
        });


    }
}
