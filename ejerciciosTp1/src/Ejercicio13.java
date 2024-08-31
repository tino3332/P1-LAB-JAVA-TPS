import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num,resp;
        int div, cont;
        System.out.println("Ingrese un numero: ");
        num = sc.nextFloat();
        div=2;
        cont=0;
        if(num==1) {
            System.out.println("El numero ingresado no es primo.");

        } else {
            while(div<10) {
                resp=num % div;
                if(resp==0) {
                    cont=cont+1;
                    break;
                }
                if (div==num) {
                    cont=cont-1;
                    break;
                }
                div=div+1;

            }
        }
        if(cont!=0){
            System.out.println("El numero ingresado no es primo.");
        } else{
            System.out.println("El numero ingresado es primo.");
        }
    }
}
