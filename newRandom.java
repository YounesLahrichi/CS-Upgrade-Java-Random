/*
CS211 Assignment 1
Younes Lahrichi
Phone Number: 425-445-9590
Student ID: 950-708-891
10-06-2020, Fall Quarter 2020
This program is an extension to the already exsisting JAVA "random" class.
*/
import java.util.*;

public class newRandom extends Random {
	//this method generates a random number from within an inclusive range
	public int nextInt(int low, int high) {
		int n = nextInt(high - low + 1) + low;
		return n;
	}
	// this method generates random even numbers from within a range
	public int nextEven(int low, int high) {
		int n = 0;
		boolean even = false;
		while (even == false) {
			n = nextInt(low, high);
			if (n % 2 == 0) {
				even = true;
			}
		}
		return n;
	}
	// this method generates random odd numbers from within a range
	public int nextOdd(int low, int high) {
		int n = 0;
		boolean odd = false;
		while (odd == false) {
			n = nextInt (low, high);
			if (n % 2 == 1) {
				odd = true;
			}
		}
		return n;
	}
	//this method generates random Capital letters
	public char nextCharCap() {
		int c = nextInt(90 - 65 + 1) + 65;
		char n = (char)c;
		return n;
	}
	//this method generates random lowercase letters
	public char nextCharLow() {
		int c = nextInt(122 - 97 + 1) + 97;
		char n = (char)c;
		return n;
	}
	//this method generates a random Capital letter from within a range of letters
	public char nextCharCap(char from, char to) {
		int a = from;
		int b = to;
		int c = nextInt(a,b);
		char n = (char)c;
		return n;
	}
	//this method generates a random word (uppercase and lowercase) with the same amount of letters that is passed through the method
	public String nextWord(int length) {
		String n = "";
		char z = 0;
		for (int i = 0; i <= length; i++) {
			int b = nextInt(1,2);
			if(b == 1) {
				z = nextCharCap();
			}
			if(b == 2) {
				z = nextCharLow();
			}
			n += z;
		}
		return n;
	}
	
	public static void main(String[] args) {
	}

}
