import Metodos.ConversionMonedas;
import Metodos.MenuDivisas;
import Metodos.MenuTemperaturas;
import Metodos.VentanaInput;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        UIManager.put("OptionPane.cancelButtonText", "SALIR");
        UIManager.put("OptionPane.background", Color.white);
        UIManager.put("Panel.background", Color.white);
        UIManager.put("Button.background", Color.white);
        UIManager.put("Button.setBorder", Color.red);



        //UIManager.put("Button.setFocusable", false);
        try {
            Object[] opcionesConversion = new Object[]{"Divisas", "Temperaturas"};
            ConversionMonedas moneda = new ConversionMonedas();
            VentanaInput ventanaIn = new VentanaInput();
            MenuDivisas menu = new MenuDivisas();
            MenuTemperaturas menuTemperaturas = new MenuTemperaturas();
            moneda.setCantidad(20);

            while (true) {
                String option = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Metodos.Menu", JOptionPane.PLAIN_MESSAGE, null, opcionesConversion, "Elegir").toString();

                switch (option) {
                    case "Divisas" -> {
                        //System.out.println("DIVISAS");
                        double cantidad = ventanaIn.ventanaIn("Divisas");
                        menu.VentanaDivisas(cantidad);
                    }
                    case "Temperaturas" -> {
                        //System.out.println("TEMPERATURA");
                        double cantidad = ventanaIn.ventanaIn("Temperaturas");
                        menuTemperaturas.VentanaTemperaturas(cantidad);

                    }

                }

            }
        }catch(NullPointerException exception){
                JOptionPane.showMessageDialog(null, "PROGRAMA FINALIZADO","Conversor",JOptionPane.PLAIN_MESSAGE,null);
                System.out.println("programa finalizado");
            }


    }
}
