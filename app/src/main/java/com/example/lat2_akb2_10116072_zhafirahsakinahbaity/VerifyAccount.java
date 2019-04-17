package com.example.lat2_akb2_10116072_zhafirahsakinahbaity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyAccount extends AppCompatActivity {

    /*
      Zhafirah Sakinah Baity
      10116072
      IF-2
      CHANGE LOG Minggu 14 APRIL 2019
      1. Membuat layout Login           jam 22.35

      CHANGE LOG senin 15 APRIL 2019
      1. Membuat layout Register       jam 14.20

      CHANGE LOG selasa 16 APRIL 2019
      1. Membuat layout AlmostThere    jam 08.17
      2. Membuat layout VerifyAccount  jam 12.38

      CHANGE LOG  rabu 17 APRIL 2019
      1. Membuat layout User_Home      jam 10.45
      2. Membuat java Login            jam 13.15
      3. Membuat java Register         jam 14.32
      4. Membuat java AlmostThere      jam 17.20
      5. Membuat java VerifyAccount    jam 19.08


 */


    Button btn_verify;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        btn_verify = (Button) findViewById(R.id.btn_verify);

        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyAccount.this,UserHome.class);
                startActivity(intent);
            }
        });
    }
}
