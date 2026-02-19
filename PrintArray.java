import java.util.Scanner;
public class PrintArray{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    int[] scores = new int [10];

    for(int count =0; count < 10; count++){
    
    System.out.print("Enter collect scores" + (count+1) + ":");
     int number =input.nextInt();
        scores[count]=number;
     
if(number % 2==0){
System.out.printf("%d\n",number);
    }
}
    
for(int count=0; count< scores.length; count++){
System.out.println(scores[count]);
}



 

    }

}
