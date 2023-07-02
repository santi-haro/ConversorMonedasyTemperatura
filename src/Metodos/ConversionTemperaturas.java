package Metodos;

import java.text.DecimalFormat;

public class ConversionTemperaturas {
    private double cantidad;

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }
    public static DecimalFormat df = new DecimalFormat("0.0");

    public String CelToFaren(){
        double conversion = ((this.cantidad * 9/5) + 32);
        return df.format(conversion);
    }
    public String CelToKelv(){
        double conversion = (this.cantidad + 273.15);
        return df.format(conversion);
    }
    public String FarenToCel(){
        double conversion = ((this.cantidad - 32) * 5/9);
        return df.format(conversion);
    }
    public String FarenTokelv(){
        double conversion = ((this.cantidad - 32) * 5/9);
        conversion += 273.15;
        return df.format(conversion);
    }
    public String KelvToCel(){
        double conversion = this.cantidad - 273.15;
        return df.format(conversion);
    }
    public String KelvToFaren(){
        double conversion = ((this.cantidad - 273.15) * 9/5);
        conversion += 32;
        return df.format(conversion);
    }



}
