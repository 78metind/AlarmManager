package com.arcelik.alarm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyScheduledActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scheduledactivity);

        Button buttonDismiss = (Button)findViewById(R.id.dismiss);
        Log.d("MyScheduledActivity", "onCreate: ");
        buttonDismiss.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                finish();
            }});
    }
}