package com.hpe.jpn.yoritaka.remoteoffhook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;

public class MainActivity extends AppCompatActivity {

    private TelephonyManager telephonyManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Huawei P9の場合、ヘッドセットボタンクリックでOffhook, mute(通話中)、長押しでOnhook
        telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);

    }
}
