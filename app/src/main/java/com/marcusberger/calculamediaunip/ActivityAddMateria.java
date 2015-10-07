package com.marcusberger.calculamediaunip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityAddMateria extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fazendo referencia a tela .xml
        setContentView(R.layout.activity_cadastra_disciplina);
    }


    public void onClickAddMateria(View view){

        startActivityForResult(new Intent(this, CadastraDisciplina.class), 1);
    }
}
