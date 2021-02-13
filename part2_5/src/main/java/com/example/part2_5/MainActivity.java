package com.example.part2_5;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button vibrationBtn;
    Button systemBeepBtn;
    Button customBeepBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vibrationBtn=findViewById(R.id.btn_vibration);
        systemBeepBtn=findViewById(R.id.btn_system_beep);
        customBeepBtn=findViewById(R.id.btn_custom_sound);

        vibrationBtn.setOnClickListener(this);
        systemBeepBtn.setOnClickListener(this);
        customBeepBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == vibrationBtn) {
            Vibrator vibrator = getSystemService(Context.VIBRATOR_SERVICE);
            vibrator.vibrate(1000);
        } else if (v == systemBeepBtn) {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone
        } else if (v == customBeepBtn) {

        }
    }
}