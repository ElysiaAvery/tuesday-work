import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class PrimeNumber {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a number!");
    String userNumber = myConsole.readLine();
    Integer conNumber = Integer.parseInt(userNumber);
    if (conNumber == 2 || conNumber == 3 || conNumber == 5 || conNumber == 7){
      System.out.println(conNumber + " is a prime number.");
    } else if (conNumber % 2 == 0 || conNumber % 3 == 0 || conNumber % 5 == 0) {
      System.out.println(conNumber + " is NOT a prime number.");
    } else {
      System.out.println(conNumber + " is a prime number.");
    }
  }
}
