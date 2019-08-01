import java.util.Scanner;
public class sumAllEclipse {

	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		sumAllThese(x,y);
	}
	
	static int sumAllThese(int a, int b){
		
		int max;
		System.out.print("Please enter the max number: ");
		Scanner scan = new Scanner (System.in);
		max = scan.nextInt();
		
		int x = 0;
		int sum = 0;
		while(x<=max) {
			System.out.println("Number " + x);
			sum += x;
			x++;
		}
		System.out.println("Sum of All is " + sum);
		

		scan.close();
		return sum;
	}

}