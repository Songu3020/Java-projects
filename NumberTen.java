import java.util.Scanner;
public class NumberTen{

    public static void main(String[]args){ 

    Scanner input= new Scanner(System.in);   
    int total = 0;
    for(int count = 1; count <= 15; count++){

    
    System.out.println("Enter an interger ");
    int number = input.nextInt();
     
    if(count > 45){

    System.out.println("pass");
    
    }else if(count <= 45 ){        

    System.out.println("fail");
    }

    if(count > 45){

    total =+ count;

    System.out.println(total);

    }

}





    }





}
