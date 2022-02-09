import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    double dub1 = 0.0;
    double dub2 = 0.0;
    double dub3 = 0.0;


    System.out.println("Please enter the first number you would like to add.");

    num1 = keyboard.nextInt();

    System.out.println(num1);

    System.out.println("Please enter second number you would like to add.");

    num2 = keyboard.nextInt();

    System.out.println(num2);

    System.out.println("Please enter the third number you would like to add.");

    num3 = keyboard.nextInt();

    System.out.println(num3);

    System.out.println("Please enter the first decimal number you would like to add.");

    dub1 = keyboard.nextDouble();

    System.out.println(dub1);

    System.out.println("Please enter the second decimal number you would like to add.");

    dub2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");

    dub3 = keyboard.nextDouble();

    System.out.println("The sum of" + " " + num1 + " " +  "+" + " " + num2 + " " + "+" + " " + num3 + " " + "=" + " " + (num1 + num2 + num3));
    System.out.println("The sum of" + " " + dub1 + " " + "+" + " " + dub2 + " " + "+" + " " + dub3 + " " + "=" + " " + (dub1 +dub2 +dub3));







  }
}
