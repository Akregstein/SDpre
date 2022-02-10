import java.util.Scanner;

public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int usernum;

    System.out.println("Please enter a number: ");
    usernum = scanner.nextInt();

    if(usernum % 2 == 0){
      System.out.println("The number is even");
    }
    else if (usernum % 2 == 1) {
      System.out.println("The number is odd");
    }
}
}
