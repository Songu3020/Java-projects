import java.util.Scanner;
public class StudentsGrade{
    public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of students ");
    int numberofStudent = input.nextInt();

    System.out.print("Enter number of subjects ");
    int numberofSubject = input.nextInt();


   int[][] scores = new int[numberofStudent][numberofSubject];

        for (int student = 0; student < numberofStudent; student++) {

            System.out.println("Entering score for student " + (student + 1) + ":");

            for (int subject = 0; subject < numberofSubject; subject++) {
                int score;
                do {
                    System.out.print("Enter score for subject " + (subject + 1) + " (0-100): ");
                    score = input.nextInt();

                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Must be between 0 and 100.");
                    }
                } while (score < 0 || score > 100);

                scores[student][subject] = score;
            }
        }

}
}


