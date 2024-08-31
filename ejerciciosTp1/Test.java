import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your gender: ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your age: ");
        int age= sc.nextInt();

        System.out.println("Enter your phone number: ");
        long phone = sc.nextLong();

        System.out.println("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("--------RESULTS--------");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Height: " + height);
        sc.close();
    }
}
