import java.util.Scanner;
public class Cyher{

    public static void main(String[]args){


    Scanner input = new Scanner(System.in);
    String encryptedMessage="";
    System.out.print("Enter a word ");
    String word = input.nextLine();

    System.out.print("Enter a number ");
    int number = input.nextInt();

for(int index=0; index<word.length();index++){
    int singleChar=word.charAt(index);
    int encodedValue= singleChar+number;
    char finalValue=(char) encodedValue;
    encryptedMessage+=finalValue;
    
    
   
    
//    char finalValue=(char) encodedValue;

}
   
   
     System.out.println(encryptedMessage);
     




}


}


