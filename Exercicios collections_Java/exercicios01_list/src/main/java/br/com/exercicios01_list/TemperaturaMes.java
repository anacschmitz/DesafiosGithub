package com.example.listas;

public class TemperaturaMes {

    private double temperatura;
    private int mes;
    private String nomeMes;

    public TemperaturaMes(int mes) {
        this.mes = mes;
        selecionarMes();
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
                }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public void selecionarMes(){
        switch (this.mes) {
            case 1:
                this.nomeMes = "Janeiro";
                break;
            case 2:
                this.nomeMes = "Fevereiro";
            case 3:
                this.nomeMes = "Março";
            case 4:
                this.nomeMes = "Abril";
            case 5:
                this.nomeMes = "Maio";
            case 6:
                this.nomeMes = "Junho";
        }
    }
}
