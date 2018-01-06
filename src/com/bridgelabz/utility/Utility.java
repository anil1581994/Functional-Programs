package com.bridgelabz.utility;

import java.io.PrintWriter;
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
	 * Repacle username wish message
	 * 
	 */
	public void getUserName(String userName) {
		int len = userName.length();
		if (len >= 3) {
			System.out.println("Hello.." + userName + "..How are You?");
		} else {
			System.out.println("something goes wrong");

		}
	}

	/*
	 * @param stake
	 * 
	 * @param goal
	 * 
	 * @param trial Logic to find the percentage of won and loss (Gambler
	 */
	public static void gambler(int stake, int goal, int trial) {

		int i, wins = 0, bets = 0;
		for (i = 0; i < trial; i++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {

				bets++;
				if (Math.random() < 0.5)
					cash++;// win
				else
					cash--;// loss
			}
			if (cash == goal) {
				// System.out.println("the cash value:"+cash);
				wins++;
			}

		} // for
			// System.out.println("the cash value:"+cash);
		System.out.println("the value of bets:" + bets);
		System.out.println(wins + " wins of " + trial);
		System.out.println("Number of Percentage won.........." + 100 * wins / trial);
		System.out.println("Average Number of bets......" + bets / trial);

	}

	/*
	 * @param numberOfTimeFlip
	 * 
	 * @logic to find percentage of head and tail
	 */
	public static void flipCoin(int numberTimeFlip) {
		Random random = new Random();
		int heads = 0;
		for (int i = 0; i < numberTimeFlip; i++) {
			int side = random.nextInt(2);// 0 to 1
			if (side == 1) {
				heads++;
			}
		}
		System.out.println("Times head was flipped:" + heads);
		System.out.println("Times tail was flipped:" + (numberTimeFlip - heads));
		int headPercent = (heads * 100) / 100;
		System.out.println("head percentage in given event:" + headPercent + "%");
		System.out.println("tail percentage in given event:" + (numberTimeFlip - headPercent) + "%");
	}

	static int digitNum = 0;

	public static void checkLeapYear(int y) {
		int temp = y;
		do {
			digitNum++;
			y = y / 10;

		} while (y != 0);
		// System.out.println("total digit in year is:"+digitNum);
		if (digitNum == 4) {
			if ((temp % 400 == 0) || (temp % 4 == 0) && (temp % 100 == 0)) {
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
	static int x = 2;

	public static void powerOfTwo(int n) {

		if (n > 0 && n <= 31) {
			for (int i = 0; i <= n; i++) {
				// System.out.println("the power of a:"+Math.pow(x,i));
				System.out.println(Math.pow(x, i) + " ");
			}
		} else
			System.out.println("the power value overflow");
	}

	/*
	 * @param distance logic to find the distance bet two point
	 */
	public void printDistance(double x, double y) {
		double result = Math.sqrt(x * x + y * y);// distance = sqrt(x*x + y*y)

		System.out.println("The Distance between x and y is origin x and y " + result);
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
	 * @param rows
	 * 
	 * @param columns
	 * 
	 * @logic to print 2D Array
	 */

	public <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(arrayElements[i][j] + " ");
				writer.flush();
			} // in for
			System.out.println();
		} // out for
	}

	/*
	 * @param intnumbers * logic to find the sum of three Integer
	 */
	public static void printAll(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						System.out.println(a[i] + " " + a[j] + " " + a[k]);
					}
				}
			}
		}
	}

	public static int count(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		return count;

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

	/*
	 * permutation function
	 * 
	 * @param str string to calculate permutation for
	 * 
	 * @param l starting index
	 * 
	 * @param r end index
	 */
	static int count=0;
	public static void permute(String str, int i, int n)
	{ 
		
		if (i == n)
		{
			count++;
			System.out.println(str);
			System.out.println(count);
		}
		else 
		{
			for (int j = i; j <= n; j++) 
			{
				str = swap(str, i, j);
				permute(str, i + 1, n);
				str = swap(str, i,j );//backtracking
			}
		}
	}

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
}// uend
