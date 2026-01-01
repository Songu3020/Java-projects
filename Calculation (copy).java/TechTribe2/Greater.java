import java.util.Scanner;

public class Greater{
public static void main(String[] args){
 
Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int firstNumber = input.nextInt();

System.out.print("Enter second number");
int secondNumber = input.nextInt();

if(firstNumber > secondNumber){
System.out.println("First NUmber is Greater");

}else if(secondNumber >firstNumber){

System.out.println("Second number is greater");
    }
  }

}
