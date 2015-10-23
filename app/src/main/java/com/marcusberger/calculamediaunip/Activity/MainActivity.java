package com.marcusberger.calculamediaunip.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Dialog;

import com.marcusberger.calculamediaunip.R;

public class MainActivity extends Activity {

    Button btNotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btNotas = (Button) findViewById(R.id.btNotas);

        btNotas.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(v.getContext(), ListaMateriasActivity.class);
                startActivity(i);
            }
        });

    }
}
