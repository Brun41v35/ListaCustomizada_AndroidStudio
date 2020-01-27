package com.example.listpersonalizada;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class EstacionamentoAdapter extends ArrayAdapter<Estacionamento> {

    private final Context context;
    private final ArrayList<Estacionamento> elementos;

    public EstacionamentoAdapter (Context context, ArrayList<Estacionamento> elementos) {
        super(context, R.layout.linha, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.linha, parent, false);

        TextView nomePlaca = (TextView) rowView.findViewById(R.id.idPlaca);
        TextView dataEntrada = (TextView) rowView.findViewById(R.id.idData);
        TextView horaEntrada = (TextView) rowView.findViewById(R.id.idHora);

        nomePlaca.setText(elementos.get(position).getPlacaCarro());
        dataEntrada.setText(elementos.get(position).getDataEntrada());
        horaEntrada.setText(elementos.get(position).getHoraEntrada());

        return rowView;
    }
}
