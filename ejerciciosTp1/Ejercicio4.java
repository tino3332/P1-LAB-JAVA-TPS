import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int firstNum = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int secondNum = sc.nextInt();

        if (firstNum == secondNum) {
            System.out.println("Ambos valores son identicos.");
        } else if (firstNum > secondNum) {
            System.out.println(firstNum +" es mayor que " +secondNum);
        } else {
            System.out.println(firstNum + " es menor que " +secondNum);
        }
        sc.close();
    }
}
