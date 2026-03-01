import java.util.Scanner;
public class LogicApprouch {

    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int firstNumber = input.nextInt();

    System.out.print("Enter secondNumber: ");
    int secondNumber = input.nextInt();
    int largest, secondLargest;    

    if(firstNumber > secondNumber){
    largest = firstNumber;
    secondLargest = secondNumber;
    }else {
    largest = secondNumber;
    secondLargest = firstNumber;
    
System.out.println("Largest number " + largest);
System.out.println("second largest " + secondLargest);


        }  
    
    }
    
 }






