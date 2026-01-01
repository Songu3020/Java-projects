import java.util.ArrayList;

import java.util.Scanner;

public class PriceGrade{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    ArrayList<String> whatbuy = new ArrayList<>();


    ArrayList<Integer>pieces = new ArrayList<>();


    ArrayList<Double>unit = new ArrayList<>();
    String peter = "yes";
    while(true){     


    System.out.print("What do you want to buy?: ");
    whatbuy. add(input.nextLine());
    
    System.out.print("Enter how many pieces: ");
    pieces. add(input.nextInt());

    System.out.print("How much per unit: ");
    unit.add(input.nextDouble());
    input.nextLine();

    System.out.print("Will you add more items?: ");
    peter = input.nextLine();
    

    if(peter.equalsIgnoreCase("no"))
    break;

    
      


}
System.out.println("Thank for your patronge");
}


}


