public class PatternThree3 {
    public static void main(String[] args) {

        for (int row = 0; row < 7; row++) {
            for (int column = 0; column < 7; column++) {

                if (row == 0 || row == 6 || column == 0 || (column == 6 && row == 1)) {
                    System.out.print("4 ");
                } 
                else if (row >= 1 && row <= 1){
                    System.out.print("3 ");
                } 
                else if (row == 2 && column >= 1 && column <= 3) {
                    System.out.print("2 ");
                }
                else if ((row >= 2 && row <= 2) && (column == 5)) {
                    System.out.print("4 ");
                } 
                else if ((row >= 2 && row <= 2) && (column == 4)) {
                    System.out.print("3 ");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}






























//
//    for(int rowNumber = 1;rowNumber <= numberOfRows; rowNumber++){
//
//       for(int rowNumber --1;rowNumber -- numberOfRows; rowNumber--){
//
//        for(int count = rowNumber; count >=1; count--){
//        
//            System.out.print(count);
//            }
//
//
//    }
//
//    System.out.println();
//
//
//}
//
//
//System.out.print("  ");
//
//
//
//
//
//}
//}

//            System.out.print(1);
//     }
//    System.out.println();
//
//
//    }
//
//
//
//
//
//
//
//
//}
//}
//
//



//
//    
//    for(int row = 0; row <=5; row++){
//    
//    System.out.println();     
//   
//        for(int numberOfRows = 1; rows >= 0; rows--){
//            
//            System.out.println();
//
//
//
//    }
//
//
//
//    }
//
//
//}
//}
//
//
//
//
//
















//
//}
//    }
//    
//    int value =1;
//    int index = 0;
//    
//    for(int row = 1; row <= 5; row++){
//
//        for(int index = 5; index >= 5; index++){
//
//            value = value /1;
//            
//            
//            System.out.print(value);
//            }
//
//                }
// System.out.println(index +" ");
//
//    }
//
//
//
//    }

//
//
//             int value = 1;
//            for (int index = 0; index <= row; index++) {
//                System.out.print(value + "  ");
//                value *= 1;
//
//            System.out.println();
//}
//    }
//
//}
