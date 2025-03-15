import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    input.close();
    
    Factorial obj = new Factorial();
    System.out.println("The factorial of the given number is " + obj.calculateFactorial(number));
  }

  int calculateFactorial(int n) {
    if (n == 0) {
      return 1;
    }
    return n * calculateFactorial(n - 1);
  }
}
