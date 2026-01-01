
import java.util.Scanner;
public class Arithemetic2{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter any integer number");
    int number = input.nextInt();

    System.out.print("Enter second number");
    int number2 = input.nextInt();
    
    int firstSquare = number * number;
    int secondSquare = number2 *number2;

    System.out.println("the sum of square " + firstSquare + " " + secondSquare);

    int sum = firstSquare + secondSquare;


    int difference =  firstSquare - secondSquare;

    int product = firstSquare * secondSquare; 
  
    System.out.println("secondSquare " + firstSquare + " " + secondSquare);

    System.out.println(sum);

    System.out.println(difference);
    
    
    System.out.println(product);



   }
  
 }



