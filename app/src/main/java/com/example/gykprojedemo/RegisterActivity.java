package com.example.gykprojedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

/*burda firebase kullanmamız lazım kullanıcıları tutmak için */
public class RegisterActivity extends AppCompatActivity {
    private EditText edtRegisterMail , edtRegisterPassword1 , edtRegisterPassword2, edtRegisterAd, edtRegisterSoyad;
    private Button btnRegisterKayitOl;
    private ImageView imgRegisterPhoto;
    private ImageButton imgbtnRegisterAddPhoto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtRegisterMail = findViewById(R.id.editTextRegisterEmail);
        edtRegisterPassword1 = findViewById(R.id.editTextRegisterPassword1);
        edtRegisterPassword2 = findViewById(R.id.editTextRegisterPassword2);
        edtRegisterAd = findViewById(R.id.editTextRegisterAd);
        edtRegisterSoyad = findViewById(R.id.textViewRegisterSoyad);
        imgRegisterPhoto = findViewById(R.id.imageViewRegister);
        imgbtnRegisterAddPhoto = findViewById(R.id.imageButtonAddRegisterPhoto);
        btnRegisterKayitOl = findViewById(R.id.buttonRegisterKayitOl);


        btnRegisterKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                bu kısımda kontroller(paroların aynı olması gibi) yapılacak detaylara sonra gireriz. Ayrıca burdan normalde kullnıcının bilgilerini alcağı intente gitmesi lazım
                */
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
