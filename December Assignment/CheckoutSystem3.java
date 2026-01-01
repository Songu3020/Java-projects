import java.util.Scanner;
public class CheckoutSystem3{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter customer name");
    String name = input.nextLine();

System.out.println("Enter what did the user buy");
String whatbuy = input.nextLine();

System.out.println("Enter how many pieces");
int pieces = input.nextInt();

System.out.println("Enter how much per unit");
double unit = input.nextInt();

System.out.println("Enter how much discount");
double discount = input.nextDouble();
input.nextDouble();


System.out.println("Enter cashier name");
String nameofCashier = input.next();

double total = unit * pieces;

double discountofSales = total * discount;
double vat = total - 0.075;
double actualTotal = total - vat;
double billTotal = total + discountofSales +vat;

System.out.printf("%.2f  %.2f  %.2f %n",total,discountofSales,vat);

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
===========================================================================================

THIS IS NOT THE RECEIPT KINDLY PAY %.2f

==========================================================================================



""",nameofCashier,name,whatbuy,pieces,unit,discount,total,actualTotal,discountofSales,billTotal,billTotal);

int count = 0;
int sentence = 0;
double subTotal =(count)=0;

System.out.println("Will you add more items?");
String add = input.nextLine();
if(add.equalsIgnoreCase("no");
break;
System.out.println("Enter ur name");
String Name = input.nextLine();



}
}


