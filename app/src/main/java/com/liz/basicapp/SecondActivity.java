package com.liz.basicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    TextView jibu;
    EditText num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        jibu = findViewById(R.id.tvResults);
        num1 = findViewById(R.id.editFirst);
        num2 = findViewById(R.id.editSecond);

    }
 //calculation code goes here on method created by adding attribute onclick in the xml file
    public void difference(View view) {
        String mFnum = num1.getText().toString();
        String mSnum = num2.getText().toString();
        if (mFnum.isEmpty()||mSnum.isEmpty()){
            Toast.makeText(this, "Fill all inputs human", Toast.LENGTH_SHORT).show();

        }
        else{
            double moja,pili;
            moja = Double.parseDouble(mFnum);
            pili = Double.parseDouble(mSnum);
            double ans = moja-pili;
            String answ = String.valueOf(ans);
            jibu.setText(answ);
        }
    }
}
