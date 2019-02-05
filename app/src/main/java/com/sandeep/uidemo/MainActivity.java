package com.sandeep.uidemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showLayoutView(View view) {
        Intent intent=null;
        switch (view.getId()) {
            case R.id.btn_relative:
                intent=new Intent(this,RelativeLayoutActivity.class);
                break;
            case R.id.btn_linaer:
               intent=new Intent(this,LinearLayoutActivity.class);
               break;
            case R.id.btn_constraint:
                intent=new Intent(this,ConstaintayoutActivity.class);
                break;
            case R.id.btn_table:
                intent=new Intent(this,TableLayoutActivity.class);
                break;
            case R.id.btn_table_row:
                intent=new Intent(this,tableRowLayoutActivity.class);
                break;
            case R.id.btn_frame:
                intent=new Intent(this, FrameLayout.class);
                break;

        }
        if(intent!=null) {
        startActivity(intent);
        }
    }



}
