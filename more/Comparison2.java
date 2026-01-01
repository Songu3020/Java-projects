import java.util.Scanner;
public class Comparison2{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    int integer = input.nextInt();
    int square = integer * integer;
 
    if(integer > 100 ||square >100){

      System.out.print("say integer and Square is greater than 100");
    
}  else if(integer==100 ||square ==100){

        System.out.print("Equal to 100");

    }else if(integer <100 || square < 100){

      System.out.print("less than 100");

    }else  System.out.print("fresh");
 
       }
}
 
