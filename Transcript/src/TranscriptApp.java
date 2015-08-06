import java.util.*;

public class TranscriptApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String course, credits, grade;
		Transcript transcript = new Transcript();
		System.out.println("Welcome to the transcript application.\n");
		do {
			do {
				System.out.println("Enter course : ");
				course = sc.nextLine().trim();
			} while (!Validator.checkCourse(course));
			do {
				System.out.println("Enter credits : ");
				credits = sc.nextLine().trim();
			} while (!Validator.checkCredits(credits));
			do {
				System.out.println("Enter Grade : ");
				grade = sc.nextLine().trim();
			} while (!Validator.checkGrade(grade));
			transcript.addCourse(course, grade, Integer.parseInt(credits));
			System.out.println("Another Course? (y/n): ");
		} while (sc.nextLine().equalsIgnoreCase("y"));
		System.out.println(transcript);
	}
}
