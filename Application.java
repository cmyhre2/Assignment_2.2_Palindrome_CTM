/**
 * This class tests a user inputed word to see if it's a palindrome.
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 2 Lab 2)
 * Fall 2023 (09/25/2023)
 */
import java.util.Scanner; //Scanner class to accept a user inputed word
import java.util.Stack; //Stack class to flip the order of Characters in a user inputed word
public class Application {
	public static void main(String[]args) {
		Stack<Character> stack = new Stack<Character>(); //stack is the Stack that will be used to flip the user inputted word.
		System.out.print("Please enter a word to check if it's a palindrome: ");
		Scanner scan = new Scanner(System.in); //Opens a scanner object to take in input
		String input = scan.next(); //stores user input in String variable
		char [] array = input.toCharArray(); //char array to break down the user inputted word into its characters
		/*
		 * for loop to push each character in the user inputted word onto the stack
		 */
		for(int i=0; i<array.length; i++) {
			stack.push(array[i]);
		}//end for loop
		StringBuilder sb = new StringBuilder(""); //StringBuilder variable to store each character as it's being popped off the stack.
		/*
		 * for loop to pop each character from the stack and append to a StringBuilder variable to store the flipped order
		 * of the user inputted word.
		 */
		for(int i=0; i<array.length; i++) {
			sb.append(stack.pop()); //pops index i of the word and appends it onto the StringBuilder variable
		}//end for loop
		String result = sb.toString(); //converts the flipped word on StringBuilder to a String variable result
		scan.close(); //closes scanner object to close memory leak
		/*
		 * if loop to test if the user inputed word is the same as the result of flipping the order of characters in 
		 * the user inputed word.
		 */
		if(result.equals(input)) {
			System.out.println(input + " is a palindrome."); //if palindrome test is true, a statement is printed to confirm.
		}//end if statement if true
		else
			System.out.println(input + " is not a palindrome."); //if palindrome test is false, a statement is printed to deny.
	}//end main()
}//end Application class
