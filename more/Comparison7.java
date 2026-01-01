import java.util.Scanner;
public class Comparison7{
public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("Enter integer");
    int integer = input.nextInt();
    int square_3 = integer * integer;

    if(integer >100 || square_3 >100){
    System.out.print("say integer is graeter than 100");
    
   }else if(integer == 100 || square_3 ==100){
    System.out.print("Equal to 100 ");

 }else if(integer < 100 || square_3 < 100)
    System.out.print("Less than");
    
        
  else
     System.out.print("twenty");
   }
}


     

