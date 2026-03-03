import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marksMath;
        int marksPhysics;
        int marksChemistry;
        int totalMarks;
        double averageMarks;
        String grade;

        System.out.print("Enter Maths Marks: ");
        marksMath = input.nextInt();

        System.out.print("Enter Physics Marks: ");
        marksPhysics = input.nextInt();

        System.out.print("Enter Chemistry Marks: ");
        marksChemistry = input.nextInt();

        totalMarks = marksMath + marksPhysics + marksChemistry;
        averageMarks = totalMarks / 3.0;

        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 75) {
            grade = "B";
        } else if (averageMarks >= 60) {
            grade = "C";
        } else if (averageMarks >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}