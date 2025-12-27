import java.util.Scanner;
    public class CalculatorTip{
      public static void main(String[] args){
        Scanner input = new Scanner(System.in);
String progress = ("yes");
while(true){


      System.out.print("Enter principal amount: ");
      double pricipalAmount = input.nextDouble();

      System.out.print("Annual interest rate: ");
      double interestrate = input.nextDouble();

      System.out.print("Enter duration: ");
      double duration = input.nextDouble();
      input.nextLine();
      double rate = interestrate/(100*12);


      double monthly = pricipalAmount*(rate*(Math.pow(1+rate,duration * 12))/(Math.pow(1+rate,duration * 12)-1));

      System.out.printf("Your monthly payment is %.2f%n",monthly);
      
      System.out.print("Do you want to continue?: yes or no?");
      progress = input.nextLine();

if(progress.equalsIgnoreCase("no")){input.nextLine();
break;


}

  
}
}
}
