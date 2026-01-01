import java.util.Scanner;
public class BookKeeping{
    public static void main(String []args){

    Scanner input = new Scanner(System.in);
 
 
 String menu = """
1. Get Suggestion
2. Add Book
3. Remove Book
4. Update Book
5. Show all books
6. Exit

""";

 
System.out.print(menu);
System.out.print("Choose option:");
int choice = input.nextInt();


    switch (choice){
               case 1:
                   menu = """
                    Book of the day
                    Book Title: The Hobbit
                    page: 47
                       
""";

System.out.println("Would you like to get another suggestion? (yes/no)");
String choose = input.nextLine();

if(choose.equalsIgnoreCase("no"))

break;

                case 2:
                    System.out.print("Enter book name: ");
                    books[booksCount++] = input.nextLine();
                    System.out.println("Book added!");
                    break;
                case 3:
                    System.out.print("Enter book to remove: ");
                    String remove = input.nextLine();
                    for(int i = 0; 1< bookCount; i ++){
                       if (books[1].equalsIgnoreCase)(remove)) {
                       books[i] = books[bookCount -1];
                       bookCount--;
                       System.out.println("Book removed!");
                       break;
               }
        }
        break;
                case 4:
                
                        System.out.print("Old book name: ");
                        String oldBook = input.nextLine();
                        for (int i = 0; < bookCount; i++){
                            if (books[i].equalsIgnoreCase(oldBook)) {
                                System.out.print("new book name: ");
                                books[i] = input.nextLine();
                                System.out.println("Book updated!");
                                break;
              }
        }
        break;
                
                case 5:
                    System.out.println("All Books:");
                    for (int 1 = 0; 1 < bookCount; 1++){
                        System.out.println(i + 1) + ".    " + books [i]);
              }
              break;
                
                case 6:
                    System.out.println("Thank you!");
        return;

        

        default:
              

            System.out.println("Invalid choice");               

                input.close();


              }

            }       

       }

   






