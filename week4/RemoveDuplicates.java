package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,2,4,8,2,1,4,1,2};
		Arrays.sort(arr);
		
		System.out.println("This is sorted array"+arr);
		
		List<Integer> output = new ArrayList<Integer>(); 
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != arr[i+1]) {
				output.add(arr[i]);
			}
		}
		
		for(int value: output) {
			System.out.print(value + " ");
		}
		

	}

}
