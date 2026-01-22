import java.util.Scanner;
public class TaskTwoNumber{
   public static void main(String[]args){

    Scanner input = new Scanner(System.in);
   // int number1;
    //int number2;
    
    System.out.print("Enter first integer ");
    int number1 = input.nextInt();

    System.out.print("Enter second integer ");
    int number2 = input.nextInt();

    int largest;
    int secondLargest;

    //number1 = number2;
    
    if(number1 > number2){
    largest = number2;
    secondLargest = number2;

    }else if(number2 > number1){
    largest = number2;
    secondLargest = number1;
    }else {
System.out.print("Both numbers are equal:" + number1);
return;
}
System.out.println("Largest number:"+ largest);
System.out.println("secondNumber:"+ secondLargest);


           }
        }
        
 

