package com.forum.forum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);
    }

    public void startContinuacaoCadastro(View view) {
        Intent telaContinuacaoCadastroActivity = new Intent(this, continuacao_cadastro.class);
        startActivity(continuacao_cadastro);
    }
}
