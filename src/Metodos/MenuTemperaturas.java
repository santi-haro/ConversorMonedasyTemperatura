package Metodos;

import javax.swing.*;

public class MenuTemperaturas {
    public void VentanaTemperaturas(double cantidad){


        VentanaConversionFinal ventanaFinal = new VentanaConversionFinal();
        ConversionTemperaturas temperatura = new ConversionTemperaturas();
        Object[] temperatures = new Object[]{"De Celcius a Farenheit",
                                            "De Celcius a Kelvin",
                                            "De Farenheit a Celcius",
                                            "De Farenheit a Kelvin",
                                            "De Kelvin a Celcius",
                                            "De Kelvin a Farenheit"};

        String opcion = (JOptionPane.showInputDialog(null,
                "Elije la Unidad de Temperatura a la que deseas convertir ",  "Temperaturas",
                JOptionPane.PLAIN_MESSAGE, null, temperatures,
                "Seleccion")).toString();
        String dataType = "Temperatura";
        temperatura.setCantidad(cantidad);
        switch (opcion){
            case "De Celcius a Farenheit" -> {
                String resultado = temperatura.CelToFaren();
                ventanaFinal.VentanaResultado(resultado," Farenheit",dataType);
            }
            case "De Celcius a Kelvin" -> {
                String resultado =  temperatura.CelToKelv();
                ventanaFinal.VentanaResultado(resultado," Kelvin",dataType);
            }
            case "De Farenheit a Celcius" -> {
                String resultado =  temperatura.FarenToCel();
                ventanaFinal.VentanaResultado(resultado," Celcius",dataType);
            }
            case "De Farenheit a Kelvin" -> {
                String resultado =  temperatura.FarenTokelv();
                ventanaFinal.VentanaResultado(resultado," Kelvin",dataType);
            }
            case "De Kelvin a Celcius" -> {
                String resultado =  temperatura.KelvToCel();
                ventanaFinal.VentanaResultado(resultado," Celcius",dataType);
            }
            case "De Kelvin a Farenheit" -> {
                String resultado =  temperatura.KelvToFaren();
                ventanaFinal.VentanaResultado(resultado," Farenheit",dataType);
            }

        }

    }
}
