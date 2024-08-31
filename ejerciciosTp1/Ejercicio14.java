import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio= (int) (Math.random()*101);
        Scanner scanner= new Scanner(System.in);
        int intentos=0;
        int numeroUsuario= -1;
        System.out.println("Numero random generado.");
        while(numeroUsuario != numeroAleatorio){
            System.out.println("Introduzca un numero: ");
            numeroUsuario=sc.nextInt();
            intentos++;
            if(numeroUsuario<numeroAleatorio){
                System.out.println("El numero es mayor!");
            } else if (numeroUsuario>numeroAleatorio) {
                System.out.println("El numero es menor!");
            } else{
                System.out.println("Adivinaste el numero.");
            }

        }
        System.out.println("Numero de intentos: " + intentos);
        }

    }
