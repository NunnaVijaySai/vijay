package javalab;

public class MinEx {
		public static void main(String[] args){
		int[] a= {90,100,102,190,40};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min =a[i];
		}
		System.out.println(min);
		}

		}
	