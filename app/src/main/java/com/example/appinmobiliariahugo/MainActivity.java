package com.example.appinmobiliariahugo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText email, password;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //agrego icono en action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        email = findViewById(R.id.eTEmail);
        password = findViewById(R.id.eTPassword);
        login = findViewById(R.id.btnLogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Ingrese Email",Toast.LENGTH_LONG).show();
                }else if(password.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Ingrese Password",Toast.LENGTH_LONG).show();
                }else{
                    if(email.getText().toString().equals("jperez@ulp.edu.ar") && password.getText().toString().equals("aaaa")){
                        Intent i = new Intent(MainActivity.this, NavigationDrawer.class);
                        i.putExtra("Usuario","Juan Perez");
                        i.putExtra("Email",email.getText().toString());
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrecta",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
