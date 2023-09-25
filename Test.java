/**
 * This class tests a user inputed word to see if it's a palindrome.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 2 Lab 2)
 * Fall 2023 (09/25/2023)
 */
import java.util.Scanner; //Scanner class to accept a user inputed word
import java.util.Stack; //Stack class to flip the order of Characters in a user inputed word
public class Test {
	String input; //String variable to store a word that is either passed in/inputted by the user
	/*
	 * Default constructor for Test()
	 * Asks the user to type a word to check if its a palindrome
	 */
	Test(){
		System.out.print("Please enter a word to check if it's a palindrome: ");
		Scanner scan = new Scanner(System.in); //Opens a scanner object to take in input
		input = scan.next(); //stores user input in String variable
		scan.close();
	}//end Test() default constructor
	
	/**
	 * Preffered constructor for Test()
	 * Takes the word passed in the parameter field to check if its a palindrome
	 * @param word
	 */
	Test(String word){
		System.out.println("Please enter a word to check if it's a palindrome: " + word);
		input = word;
	}//end Test() preffered constructor
	
	/*
	 * This method takes the word passed in/inputted by the user and checks if it's a palindrome + prints result.
	 */
	public void palindromeTest() {
		Stack<Character> stack = new Stack<Character>(); //stack is the Stack that will be used to flip the inputted word.
		char [] array = input.toCharArray(); //char array to break down the inputted word into its characters
		/*
		 * for loop to push each character in the inputted word onto the stack
		 */
		for(int i=0; i<array.length; i++) {
			stack.push(array[i]);
		}//end for loop
		StringBuilder sb = new StringBuilder(""); //StringBuilder variable to store each character as it's being popped off the stack.
		/*
		 * for loop to pop each character from the stack and append to a StringBuilder variable to store the flipped order
		 * of the inputted word.
		 */
		for(int i=0; i<array.length; i++) {
			sb.append(stack.pop()); //pops index i of the word and appends it onto the StringBuilder variable
		}//end for loop
		String result = sb.toString(); //converts the flipped word on StringBuilder to a String variable result
		/*
		 * if loop to test if the user inputed word is the same as the result of flipping the order of characters in 
		 * the inputed word.
		 */
		if(result.equals(input)) {
			System.out.println(input + " is a palindrome."); //if palindrome test is true, a statement is printed to confirm.
		}//end if statement if true
		else
			System.out.println(input + " is not a palindrome."); //if palindrome test is false, a statement is printed to deny.
	}//end palindromeTest()
}//end Test class