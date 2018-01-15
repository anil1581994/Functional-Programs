package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.next();
	}

	public int getInteger() {
		return scanner.nextInt();
	}

	public double getDouble() {
		return scanner.nextDouble();
	}

	public boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public void displayDetails(String Message) {
		System.out.println(Message);
	}

	/*
	 * @param distance logic to find the distance bet two point
	 */
	public void printDistance(double x, double y) {
		double result = Math.sqrt(x * x + y * y);// distance = sqrt(x*x + y*y)

		System.out.println("The Distance between x and y is origin x and y " + result);
	}

	/*
	 * @diplay the prime factor foer the given number
	 */
	public void diplayPrimeFactors(int n) {
		// for each potential factor
		for (int factor = 2; factor * factor <= n; factor++) {

			// if factor is a factor of n, repeatedly divide it out
			while (n % factor == 0) {
				System.out.print(factor + " ");
				n = n / factor;
			}
		}

		// if biggest factor occurs only once, n > 1
		if (n > 1)
			System.out.println(n);
		else
			System.out.println();
	}

	/*
	 * @param numberOfTimeFlip
	 * 
	 * @logic to find percentage of head and tail
	 */
	public static void flipCoin(int numberTimeFlip) {
		Random random = new Random();
		int heads = 0;
		int tails = 0;
		for (int i = 0; i < numberTimeFlip; i++) {
			double side = Math.random();// 0 to 1
			if (side > 0.5) {
				heads++;
			} else {
				tails++;
			}
		}
		System.out.println("Times head was flipped:" + heads);
		System.out.println("Times tail was flipped:" + tails);
		int headPercent = (heads * 100) / numberTimeFlip;
		int tailPercentage = (tails * 100) / numberTimeFlip;
		System.out.println("head percentage in given event:" + headPercent + "%");
		System.out.println("tail percentage in given event:" + tailPercentage + "%");
	}

	/*
	 * @param stake==amount
	 * 
	 * @param goal
	 * 
	 * @param trial Logic to find the percentage of won and loss (Gambler
	 */
	public static void gambler(int stake, int goal, int trial) {

		int i, wins = 0, bets = 0, cash = 0;
		;
		for (i = 0; i < trial; i++) {
			cash = stake;
			while (cash > 0 && cash < goal)
			{

				bets++;
				if (Math.random() < 0.5)
					cash++;// win
				else
					cash--;// loss
			}
			if (cash == goal) {
				
				wins++;
			}

		} // for
		
		System.out.println(wins + " wins of " + trial);
		System.out.println("Number of Percentage won.........." + 100 * wins / trial + "%");
		System.out.println("Average Number of bets......" + 100 * bets / trial);

	}
	// cupon number

	private static int getCoupon() {
		Random r = new Random();
		return r.nextInt((25 - 1) + 1) + 1;
	}

	public static int PrintDistinctCoupon(int numberOfCoupon) 
	{
		int[] value = new int[numberOfCoupon];

		int count = 0;// number of card count
		int pointer = 1;//distinct card

		value[0]= getCoupon();
		
		while(pointer<value.length) {
			int newCupon=getCoupon();
			
			if(value[pointer-1]!= newCupon) {
				value[pointer] = newCupon;
				pointer++;
			}
			
			count++;
			
		}
		for (int integer : value) {
			System.out.print(integer+"\t");
			
		}
		System.out.println("\n");
		return count;
	}

	/*
	 * @param number logic to find the harmonic series
	 */
	public static void harmonicSeries(int number) {
		double result = 0.0;
		while (number > 0) {
			result = result + (double) 1 / number;
			number--;
		}
		System.out.println("Output of Harmonic Number is " + result);
	}

	/*
	 * Replaceusername wish message
	 * 
	 */
	/*
	 * public String getUserName(String userName) { int len = userName.length(); if
	 * (len >= 3) { System.out.println("Hello.." + userName + "..How are You?"); }
	 * else { System.out.println("something goes wrong");
	 * 
	 * } }
	 */

	public static String replaceUser(String userName) {
		String str1 = "";
		userName = userName.replaceAll("name ", userName);

		if (userName.length() <= 3) {
			System.out.println("Hello " + userName + " How are you ?");
		}
		return userName;
	}

	/*
	 * @ Enter year and ensure it must contain 4 digit
	 * 
	 * @ check leap year o r not
	 */
	static int digitNum = 0;

	public static void checkLeapYear(int y) {
		int temp = y;
		do {
			digitNum++;
			y = y / 10;

		} while (y != 0);
		// System.out.println("total digit in year is:"+digitNum);
		if (digitNum == 4) {
			if (temp % 4 == 0) {
				System.out.println("it is leap year");
			} else {
				System.out.println("not a leap year");
			}

		} // if...num
		else {
			System.out.println("not a valid number");

		}
	}

	/*
	 * @param power of 2
	 * 
	 * @logic to find the power of 2
	 */

	public static void powerOfTwo(int n) {
		int i = 0;
		int power = 1;

		System.out.println("Powers of 2 that are less than 2^" + n);
		while (i <= n) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;
		}
	}
	/*
	 * @param double value1
	 * 
	 * @param double value2
	 * 
	 * @param double value3 logic to find the roots of the equation a*x*x + b*x + c.
	 */

	public static void quadratic(double value1, double value2, double value3) {
		double root1, root2;
		double delta = (value2 * value2 - 4 * value1 * value3);
		System.out.println("---------->" + delta);

		if (delta > 0) {

			System.out.println("Roots are real and unequal");
			root1 = (-value2 + Math.sqrt(delta)) / (2 * value1);
			root2 = (-value2 - Math.sqrt(delta)) / (2 * value1);
			System.out.println("First root is:" + root1);
			System.out.println("Second root is:" + root2);
		}

		else if (delta == 0) {
			System.out.println("Roots are real and equal");
			root1 = (-value2 + Math.sqrt(delta)) / (2 * value1);
			System.out.println("Root:" + root1);
		} else {
			System.out.println("Roots are imaginary");
		}
	}
	/*
	 * @param startTime
	 * 
	 * @param endTime
	 * 
	 * @logic to find elapsed time
	 * 
	 */

	public long startTimer = 0;
	public long stopTimer = 0;
	public long elapsed;

	// to start timer
	public void start() {
		startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
	}

	// to stop timer
	public void stop() {
		stopTimer = System.currentTimeMillis();
		System.out.println("Stop Time is: " + stopTimer);
	}

	public long getElapsedTime() {
		elapsed = stopTimer - startTimer;
		return elapsed;
	}

	/*
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * 
	 * @param l starting index
	 * 
	 * @param r end index
	 */
	static int count = 0;

	public static void recursivePermutation(String str, int i, int n) {

		if (i == n) {
			count++;
			System.out.println(str);
			System.out.println(count);
		} else {
			for (int j = i; j <= n; j++) {
				str = swap(str, i, j);
				recursivePermutation(str, i + 1, n);
				str = swap(str, i, j);// backtracking
			}
		}
	}

	// iterative permutation
	public static int fact(int length) {
		return (length == 1) ? 1 : length * fact(length - 1);
	}

	public static void iterativPermute(String str, int i, int n) {
		int length = str.length();
		int totalPermutation = fact(length);
		int j = 1;// point to second position
		int m = 0;// to fix the position
		int perm_count;
		String per_s = str;
		for (perm_count = 0; perm_count <= totalPermutation; perm_count++) {
			int k = 0;// no of iteration for current first character
			while (k != totalPermutation / length) {
				while (j != length - 1) {
					System.out.println(per_s);
					per_s = swap(per_s, j, j + 1);
					j++;
					k++;
					perm_count++;
				} // w-1
				j = 1;

			} // w-2

			m++;// move to next character to be fixed in str[]
			if (m == length) {
				break;
			}
			per_s = swap(per_s, 0, m);
		} // for

	}// m

	/*
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * 
	 * @param i position 1
	 * 
	 * @param j position 2
	 * 
	 * @return swapped string
	 */
	public static String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

	/*
	 * @param intnumbers * logic to find the sum of three Integer
	 */
	public static void triplets(int[] a) {

		// int a[] = { 0, -1, 2, -3, 1 };

		int i, j, k;
		int count = 0;
		boolean found = false;

		for (i = 0; i < a.length - 2; i++) {
			for (j = i + 1; j < a.length - 1; j++) {
				for (k = j + 1; k < a.length; k++) {
					if (a[i] + a[j] + a[k] == 0) {

						System.out.println(a[i] + " " + a[j] + " " + a[k]);
						found = true;
						count++;

					}
				}
			}
		}
		System.out.println("number of triplets:" + count);
		if (found == false)
			System.out.println("Sum of Triplets Not Found......");
	}

	/*
	 * @param rows
	 * 
	 * @param columns
	 * 
	 * @logic to print 2D Array
	 */

	public <T> void print2DArray(T[][] arrayElements, int rows, int columns) {

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				System.out.print(arrayElements[i][j] + " ");

			}
			System.out.println();
		} // out for
	}

	/*
	 * @param temprature
	 * 
	 * @param velocity
	 * 
	 * @write program to find windchill for respective temprature and velocity
	 */
	public static void windChill(double temperature, double velocity) {
		double windChill = 0;
		if (temperature <= 50.0 && (velocity >= 3 && velocity <= 120))
			windChill = (35.47 + 0.6251 + (0.4275 * temperature - 35.75)) * Math.pow(velocity, 0.16);

		System.out.println("temprature is......" + temperature);
		System.out.println("wind Speed is......" + velocity);
		System.out.println("wind chill is......" + windChill);
	}

}// uend
