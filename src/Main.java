import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Rock-Scissors-Paper Game
		
			
		Scanner scan = new Scanner(System.in);
		
		// Array with 3 items-choices
		String [] choices = {"Rock","Scissors", "Paper"};
		
		//index to get an item from an array
		int index = (int) (Math.random() * 3); 
		
		// input choice of user
		int inputIndex;
		
		//computers choice
		String compChoice = choices[index];
		
		System.out.println("Hi, what is your name?");
		
		String name = scan.nextLine();
		
		
		System.out.println(name + " make your choice: ");
		
		inputIndex = scan.nextInt();
		String choice = choices[inputIndex];
		
		
		if (choice == "Rock" && compChoice == "Rock") {
			System.out.println("It's draw");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Rock" && compChoice == "Scissors") {
			System.out.println("You won");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Rock" && compChoice == "Paper") {
			System.out.println("I won");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Scissors" && compChoice == "Paper") {
			System.out.println("You won");
			System.out.println(choice +" " +compChoice);
		}	else if(choice == "Scissors" && compChoice == "Scissors") {
			System.out.println("It's draw");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Scissors" && compChoice == "Rock") {
			System.out.println("I won");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Paper" && compChoice == "Paper") {
			System.out.println("It's draw");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Paper" && compChoice == "Scissors") {
			System.out.println("I won");
			System.out.println(choice +" " +compChoice);
		} else if(choice == "Paper" && compChoice == "Rock") {
			System.out.println("You won");
			System.out.println(choice +" " +compChoice);
		}
		else {
			System.out.println("You entered incorrect number");
		}
			

	}

}
