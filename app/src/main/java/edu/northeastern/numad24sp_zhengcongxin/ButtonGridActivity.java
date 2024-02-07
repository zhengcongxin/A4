package edu.northeastern.numad24sp_zhengcongxin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonGridActivity extends AppCompatActivity {

    private Button btn_A;
    private Button btn_B;
    private Button btn_C;
    private Button btn_D;
    private Button btn_E;
    private Button btn_F;

    private TextView tvClicky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_grid);

        btn_A = findViewById(R.id.button14);
        btn_B = findViewById(R.id.button15);
        btn_C = findViewById(R.id.button16);
        btn_D = findViewById(R.id.button17);
        btn_E = findViewById(R.id.button18);
        btn_F = findViewById(R.id.button19);
        tvClicky = findViewById(R.id.clickyText);

        setListener();

    }

    private void setListener(){
        OnClick onClick = new OnClick();

        btn_A.setOnClickListener(onClick);
        btn_B.setOnClickListener(onClick);
        btn_C.setOnClickListener(onClick);
        btn_D.setOnClickListener(onClick);
        btn_E.setOnClickListener(onClick);
        btn_F.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            //onClick 本身就是设置点击之后会做什么，
//不需要intent因为那是为了2个activity跳转，删了就好了
            int id = v.getId();
            if(id == R.id.button14){
                tvClicky.setText("Pressed: - A");
            } else if (id == R.id.button15) {
                tvClicky.setText("Pressed: - B");
            } else if (id == R.id.button16) {
                tvClicky.setText("Pressed: - C");
            } else if (id == R.id.button17) {
                tvClicky.setText("Pressed: - D");
            } else if (id == R.id.button18) {
                tvClicky.setText("Pressed: - E");
            } else if (id == R.id.button19) {
                tvClicky.setText("Pressed: - F");
            }

        }
    }




}