package com.example.lat2_akb2_10116072_zhafirahsakinahbaity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

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


    EditText edtUsername, edtPassword;
    Button btnLogin;
    TextView txtRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        edtUsername = (EditText) findViewById(R.id.edt_username);
        edtPassword = (EditText) findViewById(R.id.edt_password);
        btnLogin = (Button) findViewById(R.id.btn_login);
        txtRegis = (TextView) findViewById(R.id.txt_regis);

        String txtregis = "doesn't have account ? Register";

        SpannableString spans = new SpannableString(txtregis);

        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, register.class);
                startActivity(intent);
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }
        };

        spans.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        spans.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegis.setText(spans);
        txtRegis.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
