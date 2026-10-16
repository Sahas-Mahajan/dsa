package com.dsa;
import java.util.Scanner;
public class ArraysBasics {

	public static void main(String[] args) {
		//Initialization and Declaration
		
		int [] arr = {5,10,15};
//		int [] arr1 = new int[3]; // 3 is size of array
		
		//Accessing array elements
		
		System.out.println("Array access element:" + arr[1]); //access second element of array because index in array start from 0
		
		//Update array elements
		
		arr[0] = 8;
		System.out.println("Array update element: " + arr[0]); //update 5 with 8 at index 0
		
		//Traverse array - go through whole array elements
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		//Here, arr.length is size of array
		
		//Input in array
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int [] arr1 = new int [size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < size; i++) {
			arr1[i] = sc.nextInt();
		}
		sc.close();
		
		//Output in array
		System.out.println("Array elements are: ");
		for(int i = 0; i < size; i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
