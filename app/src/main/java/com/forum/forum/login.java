package com.forum.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void startTelaUsuario(View view) {
        Intent telaUsuarioActivity = new Intent(this, tela_usuario.class);
        startActivity(tela_usuario);
    }
    public void startEditarSenha(View view) {
        Intent editarSenhaActivity = new Intent(this, editar_senha.class);
        startActivity(editar_senha);
    }
}
