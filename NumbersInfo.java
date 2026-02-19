import java.util.Scanner;
public class NumbersInfo{  

          
public static int addition(int number1, int number2, int number3 ){
return number1 + number2 + number3;       

}

public static int addition(int number1, int number2){
return number1 + number2;       

}

public static int division(int number1,int number2,int number3){
return number1 / number2/ number3;
}
public static int division(int number1, int number2){
return number1 / number2;            

}        
public static int substraction(int number1,int number2,int number3){
return number1 - number2- number3;
}  
public static int substraction(int number1,int number2){
return number1 - number2;
}                    
public static int multiplication(int number1, int number2,int number3){
return number1 * number2 * number3;
}             
public static int multiplication(int number1, int number2){
return number1 * number2;
}




    public static void main(String[]args ){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Choose operator (+,-,*,/)");
    
    String operator = input.nextLine();

    System.out.print("Enter an integer ");
    
    int number = input.nextInt();

    System.out.print("Enter second number ");

    int secondNumber = input.nextInt();

    System.out.print("Enter third number ");
    int thirdNumber = input.nextInt();

    if(operator.equals("+") ){

System.out.println(addition(number,secondNumber,thirdNumber));
    
System.out.println(addition(number,secondNumber));
        
}else if(operator.equals("/")){
System.out.println(division(number,secondNumber,thirdNumber));
System.out.println(division(number,secondNumber));

}else if(operator.equals("-")){
System.out.println(substraction(number,secondNumber,thirdNumber));
System.out.println(substraction(number,secondNumber,thirdNumber));

}else if(operator.equals("*")){
System.out.println(multiplication(number,secondNumber,thirdNumber));
System.out.println(multiplication(number,secondNumber));

}else{
System.out.println("Invalid input ");




}



}
    }

































                
    
   
 



            
                  

            
    
    








