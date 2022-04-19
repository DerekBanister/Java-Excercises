package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraysPractice {

	public static void main(String[] args) {
		
//		Write a program that creates an array of integers with a length of 3. Assign the values 1, 2, and 3 to the indexes. Print out each array element.
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
//		Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
		ArrayList<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(13);
		numbers1.add(5);
		numbers1.add(7);
		numbers1.add(68);
		numbers1.add(2);
		numbers1.add(58);
		numbers1.add(12);
		numbers1.add(6);
		numbers1.add(333);
		
		int middleIndex = (numbers1.size() -1) / 2;
		int answer = numbers1.get(middleIndex);
		System.out.println(answer);
		
//		Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
		String [] color = {"red", "blue", "yellow", "green"};
		String [] copy = color.clone();
		System.out.println(color.length);
		System.out.println(Arrays.toString(copy));
		
//		Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.
		ArrayList<Integer> numbers2 = new ArrayList<Integer>();
		numbers2.add(3);
		numbers2.add(5);
		numbers2.add(7);
		numbers2.add(68);
		numbers2.add(60);
		int lastIndex = (numbers2.size() -1);
		int finalLastIndex = numbers2.get(lastIndex);
		System.out.println(numbers2.get(0));
		System.out.println(finalLastIndex);
		
//		Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(31);
		numbers3.add(54);
		numbers3.add(75);
		numbers3.add(6);
		numbers3.add(0);
		
		for(int i=0; i < numbers3.size(); i++) {
			System.out.println(numbers3.get(i));
		}
		
//		Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
		ArrayList<Integer> numbers4 = new ArrayList<Integer>();
		numbers4.add(31);
		numbers4.add(54);
		numbers4.add(75);
		numbers4.add(6);
		numbers4.add(0);
		
		for(int i=0; i < numbers4.size(); i++) {
			int currentValue = numbers4.get(i);
			System.out.println(currentValue * 2);
		}
		
//		Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.
		ArrayList<Integer> numbers5 = new ArrayList<Integer>();
		numbers5.add(3);
		numbers5.add(4);
		numbers5.add(5);
		numbers5.add(64);
		numbers5.add(10);
		
		int middleIndex1 = (numbers5.size() -1) / 2;
		int answer1 = numbers5.get(middleIndex1);
	
		for(int i=0; i < numbers5.size(); i++) {
			
			if(i == middleIndex1) {
				continue;
			} 
			System.out.println(numbers5.get(i));
		}
		
		
//		Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
		ArrayList<String> values = new ArrayList<String>();
		values.add("duck");
		values.add("pig");
		values.add("cow");
		values.add("horse");
		values.add("chicken");
		values.add("piglet");
		values.add("piglet2");
		
		int middleIndex3 = (values.size() -1) / 2;
			
			String value1 = values.get(middleIndex3);
			String value2 = values.get(0);
			values.remove(0);
			values.remove(middleIndex3);
			values.add(0, value1);
			values.add(middleIndex3, value2);
			System.out.println(values);
//		Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, print the smallest and the largest element of the array. The output will look like the following:
//		Array in ascending order: 0, 1, 2, 4, 9, 13
//		The smallest number is 0
//		The biggest number is 13
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(12);
			list.add(5);
			list.add(6);
			list.add(10);
			list.add(2);
			list.add(44);
			
			System.out.println("Before Sorting: "+ list); 
			
			Collections.sort(list);
			System.out.println("After Sorting: "+ list); 
			int firstIndexValue = list.get(0);
			System.out.println(firstIndexValue);
			int lastIndexValue = list.get(list.size() -1);
			System.out.println(lastIndexValue);
			
			
//		Create an array that includes an integer, 3 strings, and 1 double. Print the array.
			Object[] arr = new Object[5];
			arr[0] = new String("Duck");
			arr[1] = new String ("David's Domain");
			arr[2] = new String("Junho's Jungle");
			arr[3] = new Integer(40);
			arr[4] = new Double(4.03);
			
			System.out.println((String)arr[0]);
			System.out.println((String)arr[1]);
			System.out.println((String)arr[2]);
			System.out.println((Integer)arr[3]);
			System.out.println((Double)arr[4]);
			
	}

}
