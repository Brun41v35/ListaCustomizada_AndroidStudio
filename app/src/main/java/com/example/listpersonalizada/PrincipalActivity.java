package com.example.listpersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final Estacionamento estacionamento = new Estacionamento();

// ============================================== DATA =============================================
        TextView dataTexto = findViewById(R.id.idDataTexto);

        SimpleDateFormat dateFormat_hor = new SimpleDateFormat("dd-MM-yyyy");
        Date dat = new Date();
        Calendar calendarioB = Calendar.getInstance();

        calendarioB.setTime(dat);
        Date data_atual = calendarioB.getTime();
        estacionamento.setDataEntrada(dateFormat_hor.format(data_atual));
        dataTexto.setText(estacionamento.getDataEntrada());

// ============================================== HORA =============================================
        TextView t = findViewById(R.id.idDataHora);

        SimpleDateFormat dateFormat_hora = new SimpleDateFormat("HH:mm:ss a");
        Date data = new Date();
        Calendar calendario = Calendar.getInstance();

        calendario.setTime(data);
        Date hora_atual = calendario.getTime();
        estacionamento.setHoraEntrada(dateFormat_hora.format(hora_atual));
        t.setText(estacionamento.getHoraEntrada());

// ============================================== Botão Salvr ======================================
        Button salvar = findViewById(R.id.idSalvarData);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textoHora = estacionamento.getHoraEntrada();
                String textoData = estacionamento.getDataEntrada();
                MainActivity main = new MainActivity();
                main.setHoraEntrada(textoHora);
                main.setDataEntrada(textoData);

            }
        });
    }

    public void outraLista(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
