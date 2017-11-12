package com.forum.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class tela_usuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_usuario);
    }

    public void startEditarPerfil(View view) {
        Intent telaEditarPerfilActivity = new Intent(this, editar_usuario.class);
        startActivity(editar_usuario);
    }
    public void startForum(View view) {
        Intent forumActivity = new Intent(this, tela_forum.class);
        startActivity(tela_forum);
    }
    public void startNovaEnquete(View view) {
        Intent novaEnqueteActivity = new Intent(this, nova_enquete.class);
        startActivity(nova_enquete);
    }
}
