import java.util.Scanner;
public class MethodThink{
    
    
    }
public static int addition(int number1,int number2, int number3){
    
            return number1 + number2 + number3;
 }
public static int addition(int number1,int number2){
    
            return number1 + number2;
 }
public static int multiplication(int number1,int number2,int number3){
    
           return number1 * number2 * number3;
            }

public static int multiplication(int number1,int number2){
    
           return number1*number2;
            }
public static int division(int number1,int number2,int number3){
    
            return number1/number2/number3;
            }
public static int division(int number1,int number2){
    
            return number1/number2;
            }
public static int substraction(int number1,int number2,int number3 ){
    
            return number1 -number2;

            }
public static int substraction(int number1,int number2){
    
            return number1 - number2;

                }


public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("choose operator:(+,-,*,/) ");

    String operator = input.nextLine();

    System.out.println("Enter number: ");

    int number1 = input.nextInt();

    System.out.println("Enter second number: ");

    int secondNumber = input.nextInt();

    System.out.println("Enter third number: ");

    int thirdNumber = input.nextInt();

    
if(operator.equals("-")){

    System.out.println(substraction(number1,secondNumber,thirdNumber));

    System.out.println(substraction(number1,secondNumber));

} else if(operator.equals("+")){

    System.out.println(addition(number1,secondNumber,thirdNumber));

    System.out.println(addition(number1,secondNumber));

}else if(operator.equals("*")){

    System.out.println(multiplication(number1,secondNumber,thirdNumber));

    System.out.println(multiplication(number1,secondNumber));

}else if(operator.equals("/")){
    System.out.println(division(number1,secondNumber,thirdNumber));

    System.out.println(division(number1,secondNumber));

}else
    System.out.println("invalid operator");



}





