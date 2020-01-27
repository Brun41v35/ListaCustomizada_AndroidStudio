package com.example.listpersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public MainActivity(){}
    static private String horaEntrada;
    static private String dataEntrada;
    static private String placaCarro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.listaCarros);
        ArrayList<Estacionamento> escolas = adicionarEscolas();
        ArrayAdapter adapter = new EstacionamentoAdapter(this, escolas);
        lista.setAdapter(adapter);
    }

    private ArrayList<Estacionamento> adicionarEscolas() {

        ArrayList<Estacionamento> escolas = new ArrayList<Estacionamento>();
        Estacionamento e = new Estacionamento("BrunãoPlaca1010", getDataEntrada(),getHoraEntrada());
        escolas.add(e);

        return escolas;
    }

    public String getHoraEntrada() {

        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {

        this.horaEntrada = horaEntrada;
    }

    public String getDataEntrada() {

        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {

        this.dataEntrada = dataEntrada;
    }
}
