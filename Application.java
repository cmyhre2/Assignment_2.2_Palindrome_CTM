/**
 * This class tests the functions of the Test class that checks words to see if their palindromes
 * 
 * @author Chris Myhre
 * @version 1.0 (CS-215 Module 2 Lab 2)
 * Fall 2023 (09/25/2023)
 */
public class Application {
	public static void main(String[]args) {
		Test word1 = new Test("vechicle"); //first Test instance created with the prefferred constructor with a word that isn't a palindrome
		word1.palindromeTest(); //first word tested to show a that vechicle isn't a palindrome
		Test word2 = new Test("racecar"); //second Test instance created with the prefferred constructor with a word that is a palindrome
		word2.palindromeTest(); //second word tested to show that racecar is a palindrome
		Test word3 = new Test(); //third Test instnace created with the default constructor, prompts the user to type a word to check if its a palindrome
		word3.palindromeTest(); //third word tested to show if it is or isn't a palindrome
	}//end main()
}//end Application class