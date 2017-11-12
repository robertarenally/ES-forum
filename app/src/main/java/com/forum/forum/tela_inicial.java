package com.forum.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class tela_inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
    }

    public void startLogin(View view) {
        Intent LoginActivity = new Intent(this, login.class);
        startActivity(login);
    }
    public void startCadastro(View view) {
        Intent CadastroActivity = new Intent(this, cadastro.class);
        startActivity(cadastro);
    }
}
