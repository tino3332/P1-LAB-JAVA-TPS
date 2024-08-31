import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("El numero "+number+" es divisible entre 2.");
        } else {
            System.out.println("El numero "+number+" no es divisible entre 2.");
        }
        sc.close();
    }
}
