import java.util.Scanner;
public class GetLargestNumber{
    
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
        
    int largest = Integer.MAX_VALUE;
    int number;
    int count;

    for(count =1; count <= 10; count++){
    System.out.print("Enter number " + count + ":");
    number = input.nextInt();
    
    if(number > largest){
        largest = number;
            }
    }
    
    System.out.println("The largest number is:" + largest);   






    }








}
