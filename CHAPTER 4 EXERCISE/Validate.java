import java.util.Scanner;
public class Validate{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    int choice;
    
    while(true){
    System.out.print("Enter 1 or 2 ");

    if(input.hasNextInt()){
    choice = input.nextInt();
    
    if(choice ==1 || choice ==2) {
    break;
 
    }else {
        System.out.println("Invalid choice please 1 or 2 ");
  }
    }else  {       
         }
    }
    System.out.print("You entered: " + choice);
    
      }
    }

