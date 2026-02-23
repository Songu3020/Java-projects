public class CounterTask19{

    public static void main(String[]args){
    int largest = 0;
    int firstNumber = 345678; 
 
    String digit = ""+ firstNumber;
    for(int count = 1;count <=  digit.length() ;count++){
 
    if(count > largest)
        largest = count;
 
    }
        System.out.println(largest);
    }
}
 
   
                   
 
  
