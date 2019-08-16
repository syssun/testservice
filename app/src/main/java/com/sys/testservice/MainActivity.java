package com.sys.testservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.btns);
        b2 = findViewById(R.id.btne);
    }

    public void starts(View v) {
        Intent it=new Intent(this, MyService.class);
        switch (v.getId()){
            case R.id.btns:
                startService(it);
                DisplayToast("启动成功");
                break;
            case R.id.btne:
                stopService(it);
                DisplayToast("关闭成功");
                break;
        }

    }
    public void DisplayToast(String str) {
        Toast toast = Toast.makeText(this, str, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0, 220);
        toast.show();
    }
}
