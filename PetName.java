import java.util.Scanner;
public class PetName{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Type cat : ");
    String petCat = input.nextLine();
       
    if(petCat.equalsIgnoreCase("cat")){
    System.out.println("Cat is the pet you paid for: ");
 
    System.out.print("Dog: ");
    String Name = input.nextLine();

    }else {
    System.out.println("woof: ");

          }

    }


}


