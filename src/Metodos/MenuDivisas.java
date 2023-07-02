package Metodos;

import javax.swing.*;

public class MenuDivisas {


    public void VentanaDivisas(double cantidad){
        ConversionMonedas moneda = new ConversionMonedas();
        VentanaConversionFinal ventanaFinal = new VentanaConversionFinal();
        Object[] monedas = new Object[]{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japonés", "De Pesos a Won surcoreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras Esterlinas a Pesos", "De Yen Japonés a Pesos", "De Won surcoreano a Pesos"};

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ",  "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, monedas,
                "Seleccion")).toString();

        moneda.setCantidad(cantidad);
        String total;
        String divisa;
        String pesos = " pesos";
        String dataType = "Divisas";


        switch (opcion) {
            case "De Pesos a Dólar" -> {
                total = moneda.MxToUsd();
                divisa = " Dólares";
                ventanaFinal.VentanaResultado(total, divisa,dataType);
            }
            case "De Pesos a Euro" -> {
                total = moneda.MxToEur();
                divisa = " Euro";
                ventanaFinal.VentanaResultado(total, divisa,dataType);
            }
            case "De Pesos a Libras Esterlinas" -> {
                total = moneda.MxToGbp();
                divisa = " Libra Esterlina";
                ventanaFinal.VentanaResultado(total, divisa,dataType);
            }
            case "De Pesos a Yen Japonés" -> {
                total = moneda.MxToJpy();
                divisa = " Yen Japones";
                ventanaFinal.VentanaResultado(total, divisa,dataType);
            }
            case "De Pesos a Won surcoreano" -> {
                total = moneda.MxToKrw();
                divisa = " Won surcoreano";
                ventanaFinal.VentanaResultado(total, divisa,dataType);
            }
            case "De Dólar a Pesos" -> {
                total = moneda.UsdToMx();
                ventanaFinal.VentanaResultado(total, pesos,dataType);
            }
            case "De Euro a Pesos" -> {
                total = moneda.EurToMx();
                ventanaFinal.VentanaResultado(total, pesos,dataType);
            }
            case "De Libras Esterlinas a Pesos" -> {
                total = moneda.GbpToMx();
                ventanaFinal.VentanaResultado(total, pesos,dataType);
            }
            case "De Yen Japonés a Pesos" -> {
                total = moneda.JpyToMx();
                ventanaFinal.VentanaResultado(total, pesos,dataType);
            }
            case "De Won surcoreano a Pesos" -> {
                total = moneda.KrwToMx();
                ventanaFinal.VentanaResultado(total, pesos,dataType);
            }


        }

        System.out.println(opcion);
    }



}
