package com.example.project_over;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button Btn2 = findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new OnClickListener() {

            private Log log;

            @Override
            public void onClick(View view) {
                log.d("로그", "값");
            }
        });
    }

    public void Btn1Click(View v) {
        Toast toast = Toast.makeText(this,"ㅋㅋ", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.END | Gravity.BOTTOM, 10, 10);
        toast.show();
    }
}
