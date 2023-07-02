package Metodos;

import java.text.DecimalFormat;

public class ConversionMonedas {

    double cantidad;

    private static final double precioDolar = 17.20;
    private static final double precioEuro = 18.60;
    private static final double precioLibra = 21.70;
    private static final double precioYen = 0.12;
    private static final double precioWon = 0.013;


    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public static DecimalFormat df = new DecimalFormat("0.00");

    public String MxToUsd(){
        double total = this.cantidad/precioDolar;
        return df.format(total);
    }

    public String MxToEur(){
        double total =this.cantidad/precioEuro;
        return df.format(total);
    }

    public String MxToGbp(){
        double total = this.cantidad/precioLibra;
        return df.format(total);
    }

    public String MxToJpy(){
        double total = this.cantidad/precioYen;
        return df.format(total);
    }

    public String MxToKrw(){
      double total =  this.cantidad/precioWon;
      return df.format(total);
    }

    public String UsdToMx(){
        double total = this.cantidad * precioDolar;
        return df.format(total);
    }


    public String EurToMx(){
        double total = this.cantidad * precioEuro;
        return df.format(total);
    }

    public String GbpToMx(){
        double total = this.cantidad * precioLibra;
        return df.format(total);
    }

    public String JpyToMx(){
        double total = this.cantidad * precioYen;
        return df.format(total);
    }

    public String KrwToMx(){
        double total = this.cantidad * precioWon;
        return df.format(total);
    }

}
