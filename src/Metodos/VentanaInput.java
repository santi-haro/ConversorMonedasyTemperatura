package Metodos;

import javax.swing.*;

public class VentanaInput {
    public double ventanaIn(String dataType) {

       while (true){
           try {
               String valor =  JOptionPane.showInputDialog(null,"Ingresa la cantidad a convertir");
               double cantidad = Double.parseDouble(valor);

               if (valor.equals("0") && dataType.equals("Divisas")){
                   throw new NumberFormatException();
               }
               return cantidad;
           }catch (NumberFormatException ex){
               JOptionPane.showMessageDialog(null,"Ingresa un dato valido");
           }

       }






    }
}
