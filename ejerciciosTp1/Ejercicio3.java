import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int numeroUno= sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int numeroDos= sc.nextInt();

        System.out.println("Suma:"+(numeroUno+numeroDos));
        System.out.println("Resta:"+(numeroUno-numeroDos));
        System.out.println("Multiplicacion:"+(numeroUno*numeroDos));
        System.out.println("Division:"+((double)numeroUno/numeroDos));
        System.out.println("Modulo:"+((double)numeroUno%numeroDos));
        sc.close();
    }
}
