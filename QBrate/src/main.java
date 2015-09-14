import java.util.Scanner;

public class main {
	
	public static void QBrating() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many touchdowns?");
		int touchdowns = input.nextInt();
		
		System.out.println("How many total yards?");
		int totalYards = input.nextInt();
		
		System.out.println("How many interceptions?");
		int interceptions = input.nextInt();
		
		System.out.println("How many completions");
		int completions = input.nextInt();
		
		System.out.println("What is the total number of passes attempted?");
		int passesAttempted = input.nextInt();
		
		//arbitrary values for formula
		double a = (completions/passesAttempted-0.3)*5;
		double b = (totalYards/passesAttempted-0.3)*0.25;
		double c = (touchdowns/passesAttempted)*20;
		double d = 2.375-(interceptions/passesAttempted)*25;
		double passerRating = 100*(a+b+c+d)/6;
		System.out.println(passerRating);
	}
	
	public static void main(String [] args) {
		QBrating();
	}
}
