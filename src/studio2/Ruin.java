package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);	
		System.out.println("How much do you want to gamble?");
		double startAmount = in.nextDouble();
		System.out.println("What is the win chance, as a decimal?");
		double winChance = in.nextDouble();
		double n1;
		System.out.println("How many days do you want to play?");
		int totalSimulations = in.nextInt();
		
	
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		
	
	
		
		
		for (int day = 0; day < totalSimulations; day++){
			for (int game = 0;(startAmount < winLimit) && (startAmount > 0); game++) {
			n1 = Math.random();
			if ((n1 < winChance)) {
				startAmount++;
			}
				else 
				{
					startAmount--;
					System.out.println(startAmount);
				}
			System.out.println("You played " + game + " times today.");
		
		}
			System.out.println("Day " + day);
			System.out.println("Money you have: " + startAmount);
			
	}
		
		
	}
}
		
		
	

