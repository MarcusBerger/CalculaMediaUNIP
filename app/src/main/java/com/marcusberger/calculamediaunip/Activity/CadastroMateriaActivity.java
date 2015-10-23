package com.marcusberger.calculamediaunip.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.marcusberger.calculamediaunip.Modelo.Materia;
import com.marcusberger.calculamediaunip.R;

public class CadastroMateriaActivity extends Activity {

    EditText nomeDaMateria;
    EditText nomeProfessor;
    EditText dataP1;
    EditText dataP2;
    EditText dataExame;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_materia);


        //Pegando o EditText da tela de Cadastro de Matérias


        nomeDaMateria = (EditText) findViewById(R.id.nomeMateria);
        nomeProfessor = (EditText) findViewById(R.id.nomeProfessor);
        dataP1 = (EditText) findViewById(R.id.dataNP1);
        dataP2 = (EditText) findViewById(R.id.dataNP2);
        dataExame = (EditText) findViewById(R.id.dataExame);

    }

    public void clickConfirmar(View view) {

        //Pegando os dados digitados no EditText

        String nome = nomeDaMateria.getText().toString();
        Log.e("nome = ", "" + nome);
        String professor = nomeProfessor.getText().toString();
        String nota1 = dataP1.getText().toString();
        String nota2 = dataP2.getText().toString();
        String notaExame = dataExame.getText().toString();

        //Criando tipo Materia

        Materia disciplina = new Materia();

        //Setando os atributos

        disciplina.setNome(nome);
        disciplina.setProfessor(professor);
        disciplina.setNotaP1(nota1);
        disciplina.setNotaP2(nota2);
        disciplina.setNotaExame(notaExame);

        ListaMateriasActivity.materia = disciplina;

        Intent confirmar = new Intent(this, ListaMateriasActivity.class);
        startActivity(confirmar);

    }

}
