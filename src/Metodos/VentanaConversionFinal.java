package Metodos;

import javax.swing.*;

public class VentanaConversionFinal {
    public void VentanaResultado(String total,String divisa,String type){

        if (type.equals("Temperatura")){
            String mensaje = "La temperatura equivale a °" + total + divisa;
            JOptionPane.showMessageDialog(null,mensaje,"Conversion Final",JOptionPane.PLAIN_MESSAGE,null);
        }else {
            String mensaje = "Usted tiene $" + total + divisa;
            JOptionPane.showMessageDialog(null,mensaje,"Conversion Final",JOptionPane.PLAIN_MESSAGE,null);
        }

        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
        if (JOptionPane.OK_OPTION != respuesta){
            throw new NullPointerException();
        }

    }
}