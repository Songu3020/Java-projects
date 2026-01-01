

import java.util.Scanner;
import java.util.ArrayList;


public class CheckoutSystem{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
     int count=0;

    System.out.println("Enter customer name");
    String name = input.nextLine();


    ArrayList<String> whatbuy = new ArrayList<>();


    ArrayList<Integer>pieces = new ArrayList<>();


    ArrayList<Double>unit = new ArrayList<>();

    
    while(true){


System.out.println("Enter what did the user buy");
whatbuy.add(input.nextLine());

System.out.println("Enter how many pieces");
pieces.add(input.nextInt());

System.out.println("Enter how much per unit");
unit.add(input.nextDouble());

System.out.println("Enter how much discount");
double discount = input.nextDouble();

System.out.println("Enter cashier name");
String nameofCashier = input.nextLine();


double total = unit.get(count)* pieces.get(count);

double discountofSales = total * discount;
double vat = total * 0.075;
double actualTotal = total - vat;
double billTotal = total-discountofSales +vat;

 
System.out.println("Will you add more items?");
String add = input.nextLine();

if(add.equalsIgnoreCase("yes")){

count++;
}else{
System.out.printf("""
Main Branch
LOcation: 312, Herbert Masculay Way, Sabo Yaba, Lagos,
Tel: 09078374571
Date : 18-Dec-23  8:46:11 pm
Cashier:  %s
Customer Name:%s

===================================================================
                    ITEM    QTY    PRICE       TOTAL(NGN)
-------------------------------------------------------------------
                for(int index=0; index<whatbuy.size();index++){

        total
}




-------------------------------------------------------------------
                                Sub Total:      %.2f 
                                 Discount:      %.2f  
                              VAT @ 0.075:      %.2f

===========================================================================================
                               Bill Total:      %.2f
===========================================================================================

THIS IS NOT THE RECEIPT KINDLY PAY %.2f

==========================================================================================



""",nameofCashier,name,whatbuy,pieces,unit,discount,total,actualTotal,discountofSales,billTotal,billTotal);

System.out.print("How much did the customer pay?");
int pay = input.nextInt();

double balance = pay - total;









System.out.printf("""
Main Branch
LOcation: 312, Herbert Masculay Way, Sabo Yaba, Lagos,
Tel: 09078374571
Date : 18-Dec-23  8:46:11 pm
Cashier:  %s
Customer Name:%s

===================================================================
                    ITEM    QTY    PRICE       TOTAL(NGN)
-------------------------------------------------------------------
                    %s       %d     %.2f        %.2f




-------------------------------------------------------------------
                                Sub Total:      %.2f 
                                 Discount:      %.2f  
                              VAT @ 0.075:      %.2f

===========================================================================================
                               Bill Total:      %.2f
                               Amount paid:     %d
                               balance:         %.2f

===========================================================================================

THIS IS NOT THE RECEIPT KINDLY PAY %.2f

==========================================================================================



""",nameofCashier,name,whatbuy,pieces,unit,discount,total,actualTotal,discountofSales,billTotal,pay,balance,billTotal);


break;










}

}
}


}

   
