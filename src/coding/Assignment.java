package coding;


public class Assignment {

	public static void main(String[] args) {
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] age = {3, 9, 23, 64, 2, 8, 28, 93, 33};
		
		//a. Programmatically subtract the value of the first element in the array from the value in the 
		//last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		System.out.println(age[age.length-1] - age[0]);
		
		//c. Use a loop to iterate through the array and calculate the average age. 
		//Print the result to the console.
		double sum=0;
		for (int i=0; i< age.length; i++) {
			sum += age [i];
		}
		
		System.out.println(sum / age.length);
		
		//2. Create an array of String called names that contains the following values:
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String [] name = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//a. Use a loop to iterate through the array and calculate the average number 
		//of letters per name. Print the result to the console.
		double letters=0;
		for (int i = 0; i< name.length;i ++) {
			letters += name[i].length();
			
		}
		System.out.println(letters / name.length);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
		String concateArray = " ";
		for (int i = 0; i< name.length;i ++) {
			concateArray += name [i] + " ";
			}
		
		System.out.println(concateArray);
		
		//3. How do you access the last element of any array?
		//System.out.println(age[age.length-1] - age[0]);
		//4. How do you access the first element of any array?
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the 
		//previously created names array and add the length of each name to the nameLengths array.
		 int [] nameLengths = new int [6];
		 for (int i=0; i< 6; i++) {
			 nameLengths [i] = name[i].length();
		 }
		 //6. Write a loop to iterate over the nameLengths array and calculate the sum of all 
		 //the elements in the array. Print the result to the console.
		 double sumLength =0;
		 for (int i =0; i< nameLengths.length; i++) {
			 sumLength += nameLengths[i];
		 }
		 System.out.println(sumLength);
		// System.out.print(concatenated("hello", 3));
		 //System.out.print(fullname ("Pato", "Loco"));	
		 //System.out.println(sumOfTheNumbers (age));
		double[] price = {2.5,2,2.1,2.6};
		// System.out.println(doubleAverage(price));
		double[] array2 = {5,2,2.1,2.6};
		System.out.println(greaterArray(price,array2));
		System.out.println (willBuyDrink (true,11));
		boolean happyWife = false;
		System.out.println(happyDay(happyWife));
	}
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the 
	 //word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect 
	 //the method to return “HelloHelloHello”).
	public static String concatenated (String word, int n) {
		String conca = " ";
		for (int i =0; i<= n; i++) {
			conca += word;
		}
		return conca;
	}
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
	//(the full name should be the first and the last name as a String separated by a space).
	public static String fullname (String firstName, String lastName) {
		
		return firstName + " " + lastName;
	}
	//9. Write a method that takes an array of int and returns true if the sum of all the ints 
	//in the array is greater than 100.

	public static boolean sumOfTheNumbers (int []numbers) {
		
		int x =0;
		for (int i=0; i < numbers.length; i++) {
			x += numbers[i];
		}
		return (x >100);
	}
	//10. Write a method that takes an array of double and returns the average of all the 
	//elements in the array.
	public static double doubleAverage (double []price) {
		
		double sum=0;
		double average=0;
		for (int i =0; i<price.length; i++) {
			sum += price [i];
		}
		average = sum / price.length;
		return average;
	}
	//11. Write a method that takes two arrays of double and returns true if the average of 
	//the elements in the first array is greater than the average of the elements in the second array.
	
	public static boolean greaterArray (double []array1, double []array2) {
		double sum=0;
		double sum2=0;
		double average=0;
		double average2=0;
		for (int i =0; i<array1.length; i++) {
			sum += array1 [i];
		}
		average = sum / array2.length;
		for (int i =0; i<array2.length; i++) {
			sum2 += array2 [i];
		}
		average2 = sum2 / array2.length;
		return average > average2;
	}
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.

	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		return isHotOutside = true && moneyInPocket > 10.5;
	}
	//13. Create a method of your own that solves a problem. In comments, write what the method does 
	//and why you created it.

	public static String happyDay (boolean happyWife) {
		if (happyWife == true) {
			return "have a great day!!";
		} else{
			return "Run away and God bless you!!";
		}
	}

}

