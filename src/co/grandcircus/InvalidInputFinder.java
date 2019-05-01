package co.grandcircus;

import java.util.Scanner;

public class InvalidInputFinder {

	public static void main(String[] args) {

		int[] studentNumber = { 1, 2, 3, 4, 5, 6 };
		String[] studentName = { "Luke", "Mary", "Chan", "Laura", "Alex", "Flora" };
		String[] homeTown = { "Detroit", "Michigan", "Livonia", "Troy", "Auburn Hills", "Pontiac" };
		String[] favoriteFood= {"Pizza","Chilly Chicken","Chips","cookies","Pies"};
		String prompt = "yes";
		String htown ;
		int number ;
		int index;
		Scanner scan = new Scanner(System.in);
		System.out.print("Welcome to our Java Class.Which student would you like to learn more about?");
		while (prompt.equalsIgnoreCase("yes"))
		{
			System.out.print("(enter a number 1-6):");
			number = scan.nextInt();
			index = number - 1;
			while(number<studentNumber.length) {//wh2
				System.out.print("Student " + studentNumber[index] + " is " + studentName[index] + ".");
				System.out.println(" What would you like to know about " + studentName[index]
						+ "? (enter hometown or favorite food) ");
				htown = scan.next();
					while(htown.equalsIgnoreCase("hometown"))//wh3
					{	
					System.out.print(studentName[index] + " is from " + homeTown[index]);
					//System.exit(0);
					while(htown.equalsIgnoreCase("favorite food")) {//wh4
						System.out.print(studentName[number]+" 's  favorite food is "+favoriteFood[number]);
						System.out.println("Would you like to know more ?(enter yes or no)");
						prompt = scan.next();
							}//wh4
					System.out.println("That data does not exist.Please try again .(enter home town or favorite food)");
					htown = scan.next();
					}//wh3
				System.out.print("That student does not exist.Please try again.");
				number = scan.nextInt();
			}//wh2
			
			number = scan.nextInt();
			System.out.println("Would you like to know more?(enter yes or no)");
			prompt = scan.next();
		}//wh1
			System.out.println("Thanks!");

			scan.close();
	}//psvm
}