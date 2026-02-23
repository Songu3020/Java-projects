import java.util.Scanner;
public class CounterTwo{

    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number");

        int number = input.nextInt();

        if(number > 1000) {

        System.out.printf("%,d\n",number);

        }else {
        
        System.out.printf("$%d",number);      
            
      }

    }



}
