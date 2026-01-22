import java.util.Scanner;
public class SendRider{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    String delivery =("""

    COLLECTION RATE  AMOUNT PER PERCEL    BASE PAY

    less than 50%                 160         5,000

    50 - 59%                      200         5,000

    60 - 69%                      250         5,000

    > = 70%                       500         5,000
 """);
    System.out.print(delivery);

int wages = 0;
    System.out.print("Enter number of successfull delivery maid for the day: ");
    int successfulDelivery = input.nextInt();
if(successfulDelivery < 50){
    wages = successfulDelivery * 160 + 5000;
System.out.print(wages);


}else if(successfulDelivery >= 50 && successfulDelivery <= 59){
    wages =  successfulDelivery * 200 + 5000;
    System.out.print(wages);


}else if(successfulDelivery >= 60 && successfulDelivery <= 69){
    wages = successfulDelivery  * 250 + 5000;
    System.out.print(wages);

}else if(successfulDelivery >=70){
    wages = successfulDelivery * 500 + 5000;
    System.out.print(wages);



}
}

}

