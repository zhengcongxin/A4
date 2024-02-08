package edu.northeastern.numad24sp_zhengcongxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.northeastern.numad24sp_zhengcongxin.util.ToastUtil;

public class MainActivity extends AppCompatActivity {

    private Button mBtnAboutMe;
    private Button mBtnClicky;

    private Button mBtnLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAboutMe = findViewById(R.id.btn_aboutMe);
        mBtnClicky = findViewById(R.id.btn_clicky);
        mBtnLink = findViewById(R.id.btn_linkCollector);

        mBtnAboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toast = "Zhengcong,Xin:xin.zhe@northeastern.edu";
                Intent intent = null;

                ToastUtil.showMsg(MainActivity.this, toast);

                intent = new Intent(MainActivity.this, ContactInfoActivity.class);
                startActivity(intent);
            }
        });

        mBtnClicky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, ButtonGridActivity.class);
                startActivity(intent);
            }
        });

        mBtnLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, LinkCollectActivity.class);
                startActivity(intent);
            }
        });






    }
}