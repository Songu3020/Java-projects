import java.util.Scanner;
import java.util.ArrayList;

public class CheckoutScores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 0;
        double subTotal = 0;

        System.out.println("Enter customer name");
        String name = input.nextLine();

        ArrayList<String> whatbuy = new ArrayList<>();
        ArrayList<Integer> pieces = new ArrayList<>();
        ArrayList<Double> unit = new ArrayList<>();

        System.out.println("Enter cashier name");
        String nameofCashier = input.nextLine();

        System.out.println("Enter discount ");
        double discount = input.nextDouble();
        input.nextLine();

        while (true) {

            System.out.println("Enter what did the user buy");
            whatbuy.add(input.nextLine());

            System.out.println("Enter how many pieces");
            pieces.add(input.nextInt());

            System.out.println("Enter how much per unit");
            unit.add(input.nextDouble());
            input.nextLine(); 

            double itemTotal = pieces.get(count) * unit.get(count);
            subTotal += itemTotal;

            System.out.println("Will you add more items? (yes/no)");
            String add = input.nextLine();

            if (add.equalsIgnoreCase("yes")) {
                count++;
            } else {
                break;
            }
        }

        double discountOfSales = subTotal * discount;
        double vat = subTotal * 0.075;
        double billTotal = subTotal - discountOfSales + vat;

        System.out.println("\nTHIS IS NOT A RECEIPT — KINDLY PAY\n");

        System.out.println("How much did the customer pay?");
        double pay = input.nextDouble();

        double balance = pay - billTotal;

         
        System.out.println("""
MAIN BRANCH
Location: 312, HERBERT MACALAY WAY, SABO YABA, LAGOS.
TEL: 0329382843
Date : 18-Dec-23  8:40:11 pm
Cashier: %s
Customer Name: %s

========================================================
ITEM            QTY     PRICE       TOTAL
--------------------------------------------------------
""".formatted(nameofCashier, name));

        for (int i = 0; i < whatbuy.size(); i++) {
            double total = pieces.get(i) * unit.get(i);
            System.out.printf("%-15s %5d %10.2f %10.2f%n",
                    whatbuy.get(i), pieces.get(i), unit.get(i), total);
        }

        System.out.printf("""
--------------------------------------------------------
Sub Total:        %.2f
Discount:         %.2f
VAT @ 7.5%%:       %.2f
========================================================
Bill Total:       %.2f
Amount Paid:      %.2f
Balance:          %.2f
========================================================
THANK YOU FOR YOUR PATRONAGE;
""", subTotal, discountOfSales, vat, billTotal, pay, balance);

       input.close();
    }
}



