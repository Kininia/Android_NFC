package com.kininia.nfcapp;

import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        t = (TextView) findViewById(R.id.text_id);

        if (nfcAdapter != null && nfcAdapter.isEnabled()){
            t.setText("NFC Available!");
            Toast.makeText(this, "NFC available!", Toast.LENGTH_LONG).show();
        }else {
            t.setText("NFC not available!");
            Toast.makeText(this, "NFC not available!", Toast.LENGTH_LONG).show();
        }
    }
}
