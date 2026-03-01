import java.util.Scanner;

public class TabularForm{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
    System.out.print("index\tindex2\tindex3\tindex4");
    int index1 = input.nextInt();
    
    for(int index  = 1; index <= 5; index++){
    System.out.println(index + "\t" + (index * index) + "\t" + (index * index * index) + "\t" + (index * index * index * index));
        }
        
    }
}

