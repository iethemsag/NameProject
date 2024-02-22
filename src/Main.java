import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       String name;
       String second_name;
       String last_name;
       int age;

        System.out.print("Name: ");
       name = scanner.nextLine();
       System.out.print("Second Name: ");
       second_name = scanner.nextLine();
       System.out.print("Last Name: ");
       last_name = scanner.nextLine();
       System.out.print("Age: ");
       age = scanner.nextInt();

       System.out.print("Informations: \n" + "Name: " + name + "\nSecond name: " + second_name + "\nLast Name: " + last_name + "\nAge: " + age);




    }
}