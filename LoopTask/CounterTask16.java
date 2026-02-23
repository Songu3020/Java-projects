public class CounterTask16{

    public static void main(String[]args){

    String word = "relax";
 
    int vowelCount = 0;

 
    for(int count = 1; count < word.length(); count++){
    char letters = word.charAt(count);
    if(letters == 'a' || letters == 'e'||  letters =='d'||  letters =='o' || letters =='u'){
    vowelCount++;

        }
    }       
    System.out.println("number of vowels: "+vowelCount);     
        
    
    
    }
}
 
