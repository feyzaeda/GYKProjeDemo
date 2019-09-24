package com.example.gykprojedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*burda firebase kullanmamız lazım kullanıcıları tutmak için */
public class RegisterActivity extends AppCompatActivity {
    private EditText edtRegisterMail , edtRegisterPassword1 , edtRegisterPassword2;
    private Button btnRegisterKayitOl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtRegisterMail = findViewById(R.id.editTextRegisterEmail);
        edtRegisterPassword1 = findViewById(R.id.editTextRegisterPassword1);
        edtRegisterPassword2 = findViewById(R.id.editTextRegisterPassword2);
        btnRegisterKayitOl = findViewById(R.id.buttonRegisterKayitOl);

        btnRegisterKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*
                bu kısımda kontroller(paroların aynı olması gibi) yapılacak detaylara sonra gireriz. Ayrıca burdan normalde kullnıcının bilgilerini alcağı intente gitmesi lazım ama onu cumartesi sumru hocaya bırakıcam allah onu bildiği gibi yapsın.
                o yüzden şimdilik main activity e gidiyor.
                */
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
