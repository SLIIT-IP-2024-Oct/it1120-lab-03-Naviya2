import java.util.Scanner;

public class IT24103921Lab3Q1A{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The Price Of 1kg of Rice :");
		double price = input.nextDouble();
		System.out.println("Please Enter number of kilograms you want to buy :");
		double count = input.nextDouble();
		double totalAmount = price * count;
		System.out.println("Total Amount : "+totalAmount);
	}
}
		