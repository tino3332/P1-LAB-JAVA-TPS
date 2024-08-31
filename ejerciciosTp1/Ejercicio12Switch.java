import java.util.Scanner;
public class Ejercicio12Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;

        while(true) {
            System.out.println("Ingrese un dia de la semana para ver si es un dia laboral o no: ");
            dia = sc.nextInt();
            switch(dia) {
                case 1:
                    System.out.println("Este es un dia laboral.");
                    return;
                case 2:
                    System.out.println("Este es un dia laboral.");
                    return;
                case 3:
                    System.out.println("Este es un dia laboral.");
                    return;
                case 4:
                    System.out.println("Este es un dia laboral.");
                    return;
                case 5:
                    System.out.println("Este es un dia laboral.");
                    return;
                case 6:
                    System.out.println("Este es un dia no laboral.");
                    return;
                case 7:
                    System.out.println("Este es un dia no laboral.");
                    return;
                default:
                    System.out.println("Numero ingresado incorrecto, porfavor ingrese uno nuevo.");
                    break;
            }
        }
    }
}
