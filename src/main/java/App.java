import java.util.Scanner;
import java.io.Console;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("What kind of event are you planning?");
    String eventname = sc.nextLine();
    System.out.println("How many people are going?");
    int guestcount = sc.nextInt();
    System.out.println("What party food are you looking to serve your guests?");
    String partyfood = sc.nextLine();
    System.out.println("What beverages are you looking to serve your guests?");
    String partydrinks = sc.nextLine();
    System.out.println("What form of entertainment are you going to provide?");
    String entertainment = sc.nextLine();

  }
}
