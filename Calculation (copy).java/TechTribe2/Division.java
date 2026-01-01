import java.util.Scanner;
public class Division{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int number1 = input.nextInt();
 
System.out.print("Enter second number");
int number2 = input.nextInt();

System.out.print("Enter third number");
int number3 = input.nextInt();

if (number1%number2%number3 ==0){
System.out.print("Divisible");}

else
System.out.print("Invisible");


}


}
