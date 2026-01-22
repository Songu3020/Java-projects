public class TaskArray{
   public static void main(String[]args){
    
int[] score = {4,5,7,23,44,55,65,76,22,12,0};
    
    for(int counter =0;counter<score.length;counter++){
    
    int mini = counter;

    
        for(int index=counter+1; index<score.length;index++){
        if(scores[index] < score[mini]){
        
            mini = index;
    
   
          }
    
}
int tempValue = score [mini];

    score[mini]= score[count];
    score[count] = tempValue;
    
}
for(int count = 0;count< score.length; count++){
    System.out.print(score[count]+ "");
}

}
}













//
//    System.out.print("Enter first integer ");
//    int number1 = input.next int();
//
//    System.out.print("Enter second integer ");
//    int number2 = input.nextInt();
//
//    int[]scores= new int[10];
//for(int scores = 0;scores <=10; scores++){
//    
//
//
//





//}
