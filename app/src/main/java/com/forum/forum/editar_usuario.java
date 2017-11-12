package com.forum.forum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class editar_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.editar_usuario);
    }
    public void startEditarSenha(View view) {
        Intent telaEditarSenhaActivity = new Intent(this, editar_senha.class);
        startActivity(editar_senha);
    }
    public void startTelaUsuario(View view) {
        Intent usuarioActivity = new Intent(this, tela_usuario.class);
        startActivity(tela_usuario);
    }
}
