import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double IVA = 0.21;

        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();

        double precioFinal = precio + (precio * IVA);

        System.out.println("El precio del producto con IVA agregado es de: " + precioFinal);
        sc.close();
    }

}
