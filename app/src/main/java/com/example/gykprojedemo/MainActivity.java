package com.example.gykprojedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private EditText edtKullaniciMail , edtPassword ;
    private Button btnGirisYap , btnKayitOl ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtKullaniciMail = findViewById(R.id.editTextKullaniciMail);
        edtPassword = findViewById(R.id.editTextPassword);
        btnGirisYap = findViewById(R.id.buttonGirisYap);
        btnKayitOl = findViewById(R.id.buttonRegisterKayitOl);

        btnKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnGirisYap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // sevgi ortim burası sende navigation draver activity eklemen lazım. burda neler olucağını (sınav, eğitim, vs şeklinde) karar veririz.
            }
        });

    }
}
