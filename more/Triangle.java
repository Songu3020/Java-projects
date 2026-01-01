import java.util.Scanner;
public class Triangle{
public static void main(String []agrs){
Scanner input = new Scanner(System.in);

System.out.println("Enter the base of the Triangle");
double base =input.nextInt();

System.out.println("Enter the height of the Triangle");
double height = input.nextInt();

double area = base *height;

double product = area * 0.05;
System.out.println("the area of the :" +product );




}


}
