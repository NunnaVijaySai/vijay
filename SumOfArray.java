package javalab;

public class SumOfArray {

	public static void main(String[] args) {
		        int [] j = new int [] {10,20,30,40,50,60,70,80,90,50};  
		        int sum = 0;  
		        //Loop through the array to calculate sum of elements  
		        for (int i = 0; i < j.length; i++) {  
		           sum = sum + j[i];  
		        }  
		        System.out.println("Sum of all the elements of an array: " + sum);  
		    }  
		}
