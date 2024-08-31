import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<1;){
            System.out.print("Ingrese un dia de la semana (colocando un numero del 1-7): ");
            int diaUser=sc.nextInt();
            if(diaUser<1 || diaUser>7){
                System.out.println("Nunero ingresado incorrecto, intente nuevamente.");

            } else {
                if(diaUser>=1 && diaUser<=5){
                    System.out.print("Ese es un dia laboral.");

                } else {
                    if (diaUser>=6 && diaUser<=7){
                        System.out.print("Ese es un dia no laboral.");
                    }
                }
                i=i+1;
            }
        }
    }
}
