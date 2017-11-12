package com.forum.forum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class editar_senha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_senha);
    }
    public void startEditarSenha(View view) {
        Intent telaLoginActivity = new Intent(this, login.class);
        startActivity(login);
    }
}
