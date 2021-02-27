package main;

import java.util.Scanner;
import programs.Calculator;
import programs.Testing;

public class MainProgram {
	
	static String userName = "";
	
	public static void main(String[] args) {
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    boolean hasNoUserName = userName.isEmpty();
	    if (hasNoUserName) {
	    	System.out.println("Hi User, please enter your name:");
		    userName = myObj.nextLine();  // Read user input
	    }
		System.out.println("Hello " + userName + "!");
		System.out.println("Which program do you want to enter (please type in number):\n"
				+ "Calculator > 1\n"
				+ "While Loop Generator > 2\n");
	    int program = Integer.parseInt(myObj.nextLine());  // Read user input
	    
	    /*
	     * Chose program
	     */
	    switch(program) {
	    case 1: 
	    	System.out.println("What method of calculation? (please type in number)\n"
	    			+"Addition > 1\n"
	    			+"Subtraction > 2\n"
	    			+"Multiplication > 3\n"
	    			+"Division > 4"
	    			);
	    	int calcMethod = Integer.parseInt(myObj.nextLine());
	    	System.out.println("Type first number:");
	    	int numberOne = Integer.parseInt(myObj.nextLine());
	    	System.out.println("Type second number:");
	    	int numberTwo = Integer.parseInt(myObj.nextLine());
	    	MainProgram.openCalculator(calcMethod, numberOne, numberTwo);
	    	break;
	    case 2:
	    	System.out.println("How many loops?\n");
	    	int noOfLoops = Integer.parseInt(myObj.nextLine());
	    	MainProgram.openWhileSchleife(noOfLoops);
	    	break;
	    default:
	    	System.out.println("Program not found!");
	    };
	    String exit = "";
	    do {
	    	System.out.println("Exit Program? Please enter \"y\" or \"n\"");
		    exit = myObj.nextLine();
	    }
	    while (!(exit.toLowerCase().equals("y")) && !(exit.toLowerCase().equals("n")) );
		    
	    
	    if (exit.equals("y")) {
	    	System.out.println("Goodbye "+ userName + "!");
	    	myObj.close();
	    }
	    if (exit.equals("n")) {
	    	args = new String[] {userName};
	    	System.out.println("### Open TestApp.jar ###");
	    	Main.main(args);
	    	System.out.println("### Exit TestApp.jar ###");
			MainProgram.main(args);
	    }
		//myObj.close();
		
		// 01 Print in static method #######
		//HelloName.PrintHelloName();
		
		// 02 Calculation #######
		
		// 03 == vs equals
		//Testing.compareTest();
		
		// 04 Klassenvariable aufrufen
		//System.out.println(Testing.var_class);
		
		// 05 Konstruktor Überladung
//		MyFirstObject obj1 = new MyFirstObject("blue");
//		MyFirstObject obj2 = new MyFirstObject();
//		System.out.println(obj1.getColor());
//		System.out.println(obj2.getColor());´
		
		// 06 Balance Account
//		BalanceAccount newAccount = new BalanceAccount(500.40);
//		System.out.println(newAccount.getBalance());
//		newAccount.deposit(40.60);
//		System.out.println(newAccount.getBalance());
//		newAccount.withdraw(81);
//		System.out.println(newAccount.getBalance());
		
		
		
	}
	
	public static void openCalculator(int calcMethod, int numberOne, int numberTwo) {
		Calculator calc = new Calculator();
		int result = 0;
		switch(calcMethod) {
		case 1: 
			result = calc.add(numberOne, numberTwo);
			break;
		case 2: 
			result = calc.subtract(numberOne, numberTwo);
			break;
		case 3: 
			result = calc.multiply(numberOne, numberTwo);
			break;
		case 4: 
			result = calc.divide(numberOne, numberTwo);
			break;
		default:
			System.out.println("Calculation method not found!");
		}
		System.out.println("Result: " + result);
	}
	
	public static void openWhileSchleife(int noOfLoops) {
		Testing.whileSchleifenNummer(noOfLoops);
	}
}
