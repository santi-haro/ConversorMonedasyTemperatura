package Test;

import Metodos.ConversionMonedas;

public class TestConversionMonedas {
    public static void main(String[] args) {

        ConversionMonedas moneda = new ConversionMonedas();

        moneda.setCantidad(1000);
        String conversion1 = moneda.MxToUsd();
        String conversion2 = moneda.MxToEur();
        String conversion3 = moneda.MxToGbp();
        String conversion4 = moneda.MxToJpy();
        String conversion5 = moneda.MxToKrw();

        String conversion6 = moneda.UsdToMx();
        String conversion7 = moneda.EurToMx();
        String conversion8 = moneda.GbpToMx();
        String conversion9 = moneda.JpyToMx();
        String conversion10 = moneda.KrwToMx();






        System.out.println("$1000 pesos mexicanos equivalen a $" + conversion1 + " Dolares");
        System.out.println("$1000 pesos mexicanos equivalen a €" + conversion2 + " Euros");
        System.out.println("$1000 pesos mexicanos equivalen a £" + conversion3 + " Libras");
        System.out.println("$1000 pesos mexicanos equivalen a ¥" + conversion4 + " Yen");
        System.out.println("$1000 pesos mexicanos equivalen a ₩" + conversion5 + " Won");

        System.out.println("\n$1000 dolares estadounidenses equivalen a $" + conversion6 + " Pesos Mexicanos");
        System.out.println("€1000 Euros  equivalen a $" + conversion7 + " Pesos Mexicanos");
        System.out.println("£1000 Libras Esterlinas  equivalen a $" + conversion8 + " Pesos Mexicanos");
        System.out.println("¥1000 Yen  equivalen a $" + conversion9 + " Pesos Mexicanos");
        System.out.println("₩1000 Won  equivalen a $" + conversion10 + " Pesos Mexicanos");


    }
}
