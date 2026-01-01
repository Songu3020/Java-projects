//public class CallsTwo{
//    public static void main(String[]args){
//    
//    String Name = "Bright";
//
//    System.out.println("Hello" + Name );

import java.util.Scanner;
public class CallsTwo{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    int sum;
    int average;
  
    System.out.print("Enter scores1 ");
    int scores1 = input.nextInt();

    System.out.print("Enter scores2 ");
    int scores2 = input.nextInt();
   
    sum = scores1 + scores2;
    average = sum, scores1/scores2;
    System.out.print(sum);

    System.out.println("the average is sum ";+average);
    
    




}




}
