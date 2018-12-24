package com.example.administrator.easy_add;

import android.app.Activity;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        /**
         @param view
         */
        // click方法是=的点击响应事件，参数为View类型
        public void click(View view) {
            EditText edit = (EditText) findViewById(R.id.editText);
            EditText edit2 = (EditText) findViewById(R.id.editText2);
            Integer a = Integer.parseInt (edit.getText().toString());
            Integer b = Integer.parseInt (edit2.getText().toString());
            b = a + b;
            Log.d("MainActivity", b.toString());
            TextView txt = (TextView) findViewById(R.id.textView);
            txt.setText(b.toString());
        }
}
