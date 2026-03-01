import java.util.Scanner;
public class MillageTwo{

    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    int squared = number * number;

    if(number > 100){    
    System.out.println(number + "is greater than 100 ");
    }

    if(number == 100){
    System.out.println(number + "is equals to 100 ");
    }

    if(number != 100){
    System.out.println(number + "is not equal to 100 ");    
    }

    if(squared > 100){
    System.out.println(squared + "is greater than 100 ");
    }

    if(squared == 100){
    System.out.println(squared + "is equals to 100 ");    
    }

    if(squared < 100){
    System.out.println(squared + "is less than 100 ");

    }
    if(squared != 100){
        System.out.println(squared + "is not equal to 100 ");

       }
    
    }
}

        
