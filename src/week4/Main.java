package week4;

public class Main {

	    public static void main(String[] args) {
	        // Step 1
	        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
	        int lastMinusFirst = ages[ages.length - 1] - ages[0];
	        System.out.println("Last minus first: " + lastMinusFirst);

	        int[] agesNew = {3, 9, 23, 64, 2, 8, 28, 93, 50};
	        int lastMinusFirstNew = agesNew[agesNew.length - 1] - agesNew[0];
	        System.out.println("Last minus first in new array: " + lastMinusFirstNew);

	        int ageSum = 0;
	        for (int age : ages) {
	            ageSum += age;
	        }
	        double averageAge = (double) ageSum / ages.length;
	        System.out.println("Average age: " + averageAge);

	        // Step 2
	        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	        int totalLetters = 0;
	        for (String name : names) {
	            totalLetters += name.length();
	        }
	        double averageLetters = (double) totalLetters / names.length;
	        System.out.println("Average letters per name: " + averageLetters);

	        StringBuilder allNames = new StringBuilder();
	        for (String name : names) {
	            allNames.append(name).append(" ");
	        }
	        System.out.println("All names: " + allNames);

	        // Step 3 & 4
	        System.out.println("Last element: " + ages[ages.length - 1]);
	        System.out.println("First element: " + ages[0]);

	        // Step 5 & 6
	        int[] nameLengths = new int[names.length];
	        int nameLengthsSum = 0;
	        for (int i = 0; i < names.length; i++) {
	            nameLengths[i] = names[i].length();
	            nameLengthsSum += nameLengths[i];
	        }
	        System.out.println("Sum of name lengths: " + nameLengthsSum);

	        // Step 7
	        System.out.println(repeatWord("Hello", 3));

	        // Step 8
	        System.out.println(fullName("Jimmy", "Dean"));

	        // Step 9
	        System.out.println(isSumGreaterThan100(ages));

	        // Step 10
	        double[] doubles = {1.1, 2.2, 3.3};
	        System.out.println(averageDouble(doubles));

	        // Step 11
	        double[] doubles2 = {4.4, 5.5, 6.6};
	        System.out.println(isFirstAverageGreater(doubles, doubles2));

	        // Task 12
	        System.out.println(willBuyDrink(true, 11.50));

	        // Step 13
	        // This method checks if an integer array contains any negative numbers
	        // Created to validate that arrays only contain positive numbers for certain calculations
	        System.out.println(containsNegative(ages));
	    }

	    public static String repeatWord(String word, int n) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            sb.append(word);
	        }
	        return sb.toString();
	    }

	    public static String fullName(String firstName, String lastName) {
	        return firstName + " " + lastName;
	    }

	    public static boolean isSumGreaterThan100(int[] arr) {
	        int sum = 0;
	        for (int num : arr) {
	            sum += num;
	        }
	        return sum > 100;
	    }

	    public static double averageDouble(double[] arr) {
	        double sum = 0;
	        for (double num : arr) {
	            sum += num;
	        }
	        return sum / arr.length;
	    }

	    public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
	        return averageDouble(arr1) > averageDouble(arr2);
	    }

	    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
	        return isHotOutside && moneyInPocket > 10.50;
	    }

	    public static boolean containsNegative(int[] arr) {
	        for (int num : arr) {
	            if (num < 0) {
	                return true;
	            }
	        }
	        return false;
	    } 
	}

