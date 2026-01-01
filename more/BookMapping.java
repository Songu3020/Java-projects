import java.util.Scanner;

public class BookApp{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] books = new String[100];
        int bookCount = 0;

        String menu = """
        1. Get Suggestion
        2. Add Book
        3. Remove Book
        4. Update Book
        5. Show all books
        6. Exit
        """;

        while (true) {
            System.out.print(menu);
            System.out.print("Choose option: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.println("""
                    Book of the day
                    Book Title: The Hobbit
                    Page: 47
                    """);

                    System.out.print("Would you like another suggestion? (yes/no): ");
                    String choose = input.nextLine();
                    if (choose.equalsIgnoreCase("no")) {
                        break;
                    }
                    break;

                case 2:
                    System.out.print("Enter book name: ");
                    books[bookCount++] = input.nextLine();
                    System.out.println("Book added!");
                    break;

                case 3:
                    System.out.print("Enter book to remove: ");
                    String remove = input.nextLine();

                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equalsIgnoreCase(remove)) {
                            books[i] = books[bookCount - 1];
                            bookCount--;
                            System.out.println("Book removed!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Old book name: ");
                    String oldBook = input.nextLine();

                    for (int i = 0; i < bookCount; i++) {
                        if (books[i].equalsIgnoreCase(oldBook)) {
                            System.out.print("New book name: ");
                            books[i] = input.nextLine();
                            System.out.println("Book updated!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("All Books:");
                    for (int i = 0; i < bookCount; i++) {
                        System.out.println((i + 1) + ". " + books[i]);
                    }
                    break;

                case 6:
                    System.out.println("Thank you!");
                    input.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

