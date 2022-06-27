package com.tesis.quizti3;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormLogin extends AppCompatActivity {

    private TextView text_tela_cadastro;
    private TextView entrar;
    EditText email;
    EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        email =  (EditText) findViewById(R.id.edit_email);
        senha =  (EditText) findViewById(R.id.edit_email);

        getSupportActionBar().hide();
        IniciarComponentes();




        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                    startActivity(intent);
            }
        });

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String semail = email.getText().toString().trim();
                String ssenha = senha.getText().toString().trim();
                Intent intent;

                if (!TextUtils.isEmpty(semail)) {
                    if (semail.contentEquals("aluno@email.com") ) {
                        intent = new Intent(FormLogin.this, ListaQuizAluno.class);
                        startActivity(intent);
                        return;
                    } else if (semail.contentEquals("professor@email.com")) {
                        intent = new Intent(FormLogin.this, Home.class);
                        startActivity(intent);
                        return;
                    } else {
                        email.setError("Usuario invalido.");

                    }
                }else {

                    Toast.makeText(FormLogin.this,
                            "Informações obrigatorias.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }



    private void IniciarComponentes(){

        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
        entrar = findViewById(R.id.entrar);


    }
}