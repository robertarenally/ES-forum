package com.forum.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class cod_seguranca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cod_seguranca);
    }
    public void startTelaUsuario(View view) {
        Intent telaUsuarioActivity = new Intent(this, tela_inicial.class);
        startActivity(tela_usuario);
    }
}
