import java.util.Scanner;

public class TaskThree{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
int counter = 0;
double sum = 0;

while (counter <= 10){
    System.out.println("Enter score");
    int score = input.nextInt();
    sum += score;
    counter++;

    
}

double average = sum/10;
System.out.printf("The sum and avarage of the numbers entered are %.2f and %.2f respestively",sum,average);


}

    }


