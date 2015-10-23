package com.marcusberger.calculamediaunip.Activity;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.marcusberger.calculamediaunip.Modelo.Materia;
import com.marcusberger.calculamediaunip.R;



public class ListaMateriasActivity extends Activity {

    public static Materia materia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Fazendo referencia a tela .xml
        setContentView(R.layout.activity_lista_materias);

    }

    public void onClickAddMateria(View view){

        startActivityForResult(new Intent(this, CadastroMateriaActivity.class), 1);
    }

}
