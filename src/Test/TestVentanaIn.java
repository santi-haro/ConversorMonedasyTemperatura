package Test;
import Metodos.VentanaInput;

public class TestVentanaIn {
    public static void main(String[] args) {
        VentanaInput test = new VentanaInput();


        double valor = test.ventanaIn("divisas");
        valor += 100;
        System.out.println(valor);
    }
}
