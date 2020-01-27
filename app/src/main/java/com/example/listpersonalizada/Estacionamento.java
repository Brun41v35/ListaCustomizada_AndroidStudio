package com.example.listpersonalizada;

public class Estacionamento {

    private String placaCarro;
    private String dataEntrada;
    private String horaEntrada;

    public Estacionamento(String placaCarro, String dataEntrada, String horaEntrada) {
        this.placaCarro = placaCarro;
        this.dataEntrada = dataEntrada;
        this.horaEntrada = horaEntrada;
    }

    public Estacionamento() {}

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {

        this.placaCarro = placaCarro;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
}
