import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="password";
        int maxIntentos=3;
        int intentos=0;

        while(intentos<maxIntentos){
            System.out.print("Ingrese su contraseña: ");
            String passInput=sc.nextLine();
            if(passInput.equals(password)){
                System.out.println("La contraseña es correcta.");
                break;
            } else {
                intentos=intentos+1;
                if (intentos<maxIntentos){
                    System.out.println("Contraseña incorrecta, porfavor ingresala nuevamente:");
                }
            }
        }
        if (intentos==maxIntentos){
            System.out.println("Demasiados intentos, acceso denegado.");
        }
        sc.close();
    }
}
