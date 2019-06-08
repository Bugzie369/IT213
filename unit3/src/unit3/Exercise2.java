package unit3;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			float sum = 0;
			float count = 0;
			
		for (int i=1; i <= 100; i++)
		{
				System.out.printf("%d\n", i);
				sum = sum + i;
				count = count +1;
				
		}
		System.out.printf("The sum = %.0f\n", sum);
		System.out.printf("The average = %.1f\n ", sum / count);
		
		
	}

}
