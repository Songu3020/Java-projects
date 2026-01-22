import java.util.Scanner;
public class MorningTea{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter word ");
    String word = input.nextLine();
    
    System.out.print("Enter number ");
    int number = input.nextInt();
    
    String text = "";
    
    for(int count = 0; count <word.length(); count++){
        for(int index = 0;index < number ; index++){
            text += (word.charAt(count));           


}
}
System.out.println(text);


System.out.println();

}




}
