package com.example.sendowo.learnbasicandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private Button btn1, btn2, btn3;
    private TextView txtView1, txtView2;
    private EditText editText1, editText2;
    //https://stackoverflow.com/questions/25905086/multiple-buttons-onclicklistener-android
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        txtView1 = (TextView) findViewById(R.id.textView);
        txtView2 = (TextView) findViewById(R.id.textView2);
        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button:
                txtView1.setText(editText1.getText().toString());
                //
                break;

            case R.id.button2:
                txtView2.setText(editText2.getText().toString());

                //
                break;
            case R.id.button3:
                txtView1.setText("");
                txtView2.setText("");
                break;

            default:
                break;
        }

    }


}
