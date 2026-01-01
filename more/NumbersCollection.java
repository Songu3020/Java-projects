import java.util.Scanner;
public class NumbersCollection{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print(Collect five a five digit Number: );
int number = input.nextInt();


int digit1 /10000;
int digit2 = (number/1000)%10;
int digit3 = (number/100)%10;
int digit4 = (number/10)%10;
int digit5 =  number%10;

    System.out.print("digit1 +" "+digit2 " "+ digit3 + " "digit4 +" "digit5);


  }

}
