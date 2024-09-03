import  java.util.Scanner;
public class calsi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the bill amount: ");
    double billAmount = scanner.nextDouble();
    double tipAmount = billAmount * 0.15;
    System.out.println("The tip amount is: " + tipAmount);
  }
}
