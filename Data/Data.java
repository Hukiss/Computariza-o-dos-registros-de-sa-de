package Data;

import Mes.Mes;

public class Data {
    private static final int ACTUAL = 2024;
    private int dia,    mes,
            ano;

    public void setDia(int dia) {

        if ( (dia >0) && (dia <= 31) )
            this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {

        if ( (mes > 0) && (mes <= 12) )
            this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {

        if ( (ano > 1000) && (ano <= 9999) )
            this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {                                                                          //O método sobrescrito to String será responsavel por
        return "Data de nascimento: " + this.getDia() + " / " + apresentar() + " / " +                  // mostrar a data no formato
                this.getAno() + " ";                                                                   // "dd / MMMM / yyyy"
    }
    public int calcularIdade(){
        return ACTUAL - getAno();
    }

    public Mes apresentar(){

        Mes mes = Mes.NULL;

        switch (getMes()){

            case 1:
                mes = Mes.JAN;      break;
            case 2:
                mes = Mes.FEB;      break;
            case 3:
                mes = Mes.MARCH;    break;
            case 4:
                mes = Mes.ABRIL;    break;
            case 5:
                mes = Mes.MAY;      break;
            case 6:
                mes = Mes.JUN;      break;
            case 7:
                mes = Mes.JULY;     break;
            case 8:
                mes = Mes.AGOST;    break;
            case 9:
                mes = Mes.SEPT;     break;
            case 10:
                mes = Mes.OCT;      break;
            case 11:
                mes = Mes.NOV;      break;
            case 12:
                mes = Mes.DEZ;      break;
            default:
                break;
        }

        return mes;
    }
}