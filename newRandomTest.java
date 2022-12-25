/*
CS211 Assignment 1
Younes Lahrichi
Phone Number: 425-445-9590
Student ID: 950-708-891
10-06-2020, Fall Quarter 2020
This program tests all of the methods that I wrote to extend the JAVA "random" class.
*/
public class newRandomTest {

	public static void main(String[] args) {
		newRandom rand = new newRandom();
		//This tests the first method that I wrote to get a random number from within an inclusive range
		System.out.println("\n1) Test: nextInt(4, 10)");
		for (int i = 0; i < 10; i++) {
			int a = rand.nextInt(4, 10);
			System.out.println(a);
		}
		//This tests the second method that I wrote to get a random even number within a range
		System.out.println("\n2) Test: nextEven(4, 10)");
		for (int i = 0; i < 10; i++) {
			int a = rand.nextEven(4, 10);
			System.out.println(a);
		}
		//This tests the third method that I wrote to get a random odd number within a range
		System.out.println("\n3) Test: nextOdd(4, 10)");
		for (int i = 0; i < 10; i++) {
			int a = rand.nextOdd(4, 10);
			System.out.println(a);
		}
		//This tests the fourth method that I wrote to get a random captial letter
		System.out.println("\n4) Test: nextCharCap");
		for (int i = 0; i < 10; i++) {
			char a = rand.nextCharCap();
			System.out.println(a);
		}
		//This tests the fifth method that I wrote to get a random lowercase letter
		System.out.println("\n5) Test: nextCharLow");
		for (int i = 0; i < 10; i++) {
			char a = rand.nextCharLow();
			System.out.println(a);
		}
		//This tests the sixth method that I wrote to get a random captial letter from within a range of letters
		System.out.println("\n6) Test: nextCharCap");
		for (int i = 0; i < 10; i++) {
			char a = rand.nextCharCap('A','K');
			System.out.println(a);
		}
		//This tests the seventh method that I wrote. This method generates random word (uppercase and lowercase letters) with the number of letters that is passed though it
		System.out.println("\n7) Test: nextWord");
		for (int i = 0; i < 10; i++) {
			String a = rand.nextWord(5);
			System.out.println(a);
		}
	}
}
