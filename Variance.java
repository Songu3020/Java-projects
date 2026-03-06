public class Variance {


    public  double average(int [] numbers) {
    int sum =  0;

    int add = 0;
    for(int count = 0; count < numbers.length;count++) {
    sum += numbers[count];
    }

    double average = sum / numbers.length ;
    double  difference = 0;

    for(int count =0; count < numbers.length; count++){
    difference = numbers[count]-average;
    double squaresOfDifference = difference * difference;
    add += squaresOfDifference;
    }
    double divide = add / numbers.length;
    return divide;
   }     
    
    
    }










































   
//        
//       int LargestNumber = 10;
//       int SecondLargestNumber = 34;
//
//    if(SecondLargestNumber < LargestNumber){
//        return LargestNumber;
//    }
//    else{
//    return SecondLargestNumber;
//
//
//    }
//} 
//  
//    public static void main(String[]args){
//        System.out.println(getLargestNumber());
//
//
//    }
//}

//public String name;
//
//public String getName(){
//    return name;
//
//    }
//}
//public static void main(String[]args){
//    System.out.println("Hate no man");
//
//
//
//    }
//
//    public static void mainn(String[]ars){










//    Scanner input = new Scanner(System.in);
//
//    int count = 0;
//    System.out.print("Enter a number: ");
//    int number = input.nextInt();
//    
//    for(int divisor =2; divisor < number; divisor++){
//    if(number % divisor == 0){
//    count++;
//        }
//    }
//    if(count == 0 && number >1){
//    System.out.println(number + "is a prime number");
//
//    }else{
//
//    System.out.println(number + "is not a prime number");
//        }
//    }
//}
    
    
    





            



//
//}
//for (int divisor = 2; divisor < number; divisor++) {
//
//            if (number % divisor == 0) {
//                count++;
//            }
//        }
//
//        if (count == 0 && number > 1) {
//            System.out.println(number + " is a prime number");
//        } else {
//            System.out.println(number + " is not a prime number");
//        }
//    }
//}
