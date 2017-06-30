import java.util.Scanner;
// import java.io.Console;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to the Epicodus Party Planner\nWhat kind of event are you planning?");
    String eventname = sc.next();
    
    System.out.println("How many people are attending?");
    int guestcount = sc.nextInt();
    
    System.out.println("For food: Appetizers, Full-Meal, or Desserts?");
    String partyfood = sc.next();
    
    System.out.println("For beverages: Cocktails, Beers, or Juices");
    String partydrinks = sc.next();
    
    System.out.println("For entertainment: Live Band, DJ, or None?");
    String entertain = sc.next();
    
    System.out.println("Thank you for your booking. You are all set for your upcoming event: " + eventname);
    System.out.println("The number of people that are attending is: " + guestcount);
    System.out.println("For food, your guests will be served: " + partyfood);
    System.out.println("For drinks, your guests will be served: " + partydrinks);
    System.out.println("Your guests will be entertained by: " + entertain);

    Event event = new Event(eventname, guestcount, partyfood, partydrinks, entertain);
    int cost = event.computeCost();
    System.out.println("Your total cost for this event will be: $" + cost);
  }
}
