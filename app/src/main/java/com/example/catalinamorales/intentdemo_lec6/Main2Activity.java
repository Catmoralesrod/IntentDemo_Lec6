package com.example.catalinamorales.intentdemo_lec6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.catalinamorales.intentdemo_lec6.Utils.Utils.AGE_MSG_KEY;

public class Main2Activity extends AppCompatActivity {


    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    textView1=(TextView)findViewById(R.id.tv1__ma2);

        String incomingMsg=getIntent().getStringExtra(AGE_MSG_KEY);
        textView1.setText(incomingMsg);
    }
}
