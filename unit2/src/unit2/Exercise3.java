package unit2;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double grade;
		
		System.out.print("Enter your grade to see if you passed: ");
		grade = input.nextDouble();
		
		if (grade >= 60)
		
			System.out.printf("Congratultions, you passed");
		else
			System.out.printf("Sorry, you failed");
		
	}

}
