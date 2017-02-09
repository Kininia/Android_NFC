package com.kininia.nfcapp;

import android.nfc.NfcAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NfcAdapter nfcAdapter = NfcAdapter.getDefaultAdapter(this);
        t =  new textiew(this);
        t = (textview)findViewById(R.id.textview01);

        if (nfcAdapter != null && nfcAdapter.isEnabled()){
            t.appendText("NFC Available!");
            Toast.makeText(this, "NFC available!", Toast.LENGTH_LONG).show();
        }else {
            t.appendText("NFC not available!");
            Toast.makeText(this, "NFC not available!", Toast.LENGTH_LONG).show();
        }
    }
}
