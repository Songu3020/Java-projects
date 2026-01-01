import java.util.Scanner;

public class TaskFour{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
int scoreCount= 1;
int sum = 0;

while (counter <= 10){
    System.out.println("Enter score");
    int score = input.nextInt();
    sum += score;
    counter++;

    
}

double average = sum/10;
System.out.println(average);


}

    }



