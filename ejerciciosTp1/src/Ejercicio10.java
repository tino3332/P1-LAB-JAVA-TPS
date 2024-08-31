import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num= sc.nextInt();
        while(num<0) {
            System.out.println("Numero invalido, porfavor ingrese uno nuevo: ");
            num= sc.nextInt();
        }
        System.out.println(num);
        sc.close();
    }
}
