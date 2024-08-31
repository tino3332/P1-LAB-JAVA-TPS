import javax.swing.*;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        String apellido = JOptionPane.showInputDialog("Introduce tu apellido");

        System.out.println("Bienvenido "+nombre+" "+apellido);
        sc.close();
    }
}
