import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    //Main Question.
    System.out.println("Hello welcome. Today we will calculate how much fluid ounces Tanker Trucks consume on a daily basis.");
    Scanner scan = new Scanner(System.in);

    //Doing the boolean/while statement for asking to play again.
    int redo;
    boolean y = true;

    //Getting the ounces.
    while(y==true){
    System.out.println("Please enter the average amount of oz, consumed in a day.");
    int oz = scan.nextInt();
    while(oz<0){
      System.out.println("Please enter a number:");
      oz = scan.nextInt();
    }

    //Getting the length in years.
    System.out.println("Please enter the estimate length in years we are calculating.");
    int length = scan.nextInt();
    while(length<0){
      System.out.println("Please enter a number:");
      length = scan.nextInt();
    }

    //Getting the total
    int days = 365*length;
    int totaloz = oz * days;
    double totalGal = (double) totaloz / 128;
    double Tanker = (double) 11000/totalGal;

    //Printing the total
    System.out.println("The total amount of tankers in your test was : " + Tanker + ", and the  amount of gal consumed daily was :" + totalGal + ".");

    //Asking to play again.
    System.out.println("Would you like to play again? (1=Yes) or (2=No)");
    redo = scan.nextInt();
    if(redo==1){
      y = true;
    }else{
      y = false;
      System.out.println("Okay thankyou! Have a nice day :) ");
      }
    }
  }
}
