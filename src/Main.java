import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double celcius;
        celcius = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Graus Celcius"));
        int fahrenheit = (int) ((celcius * 1.8) + 32);
        System.out.println("A temperatura de " + celcius + "°C é igual a " + fahrenheit + " Fahrenheit");

    }
}