package javalab;

/*public class Array2d {

	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 7;
		
		
		arr[1][0] = 8;
		arr[1][1] = 6;
		
		
		arr[2][0] = 3;
		arr[2][1] = 2;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}

}*/



/*public class Array2d {

	public static void main(String[] args) {
		int[][] arr=new int[3][2];
		arr[0][0] = 1;
		arr[0][1] = 7;
		
		
		arr[1][0] = 8;
		arr[1][1] = 6;
		
		
		arr[2][0] = 3;
		arr[2][1] = 2;
		
		int size=0;
		for(int i=0;i<arr.length;i++) {
		size +=arr[i].length;
		}
		System.out.println(size);

		}
}*/


/*public class Array2d {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 7;
		arr[0][2] = 12;
		
		
		arr[1][0] = 8;
		arr[1][1] = 6;
		arr[1][2] = 54;
		
		
		arr[2][0] = 3;
		arr[2][1] = 2;
	    arr[2][2] = 98;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}*/


/*public class Array2d {

	public static void main(String[] args) {
		int[][] arr= {{2,3},{4,8},{7,10}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}*/



/*import java.util.Scanner;
public class Array2d{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int rows =s.nextInt();
		int cols =s.nextInt();
		int[][] arr=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
	}
}
}*/


/*import java.util.Scanner;
public class Array2d{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int rows =s.nextInt();
		int cols =s.nextInt();
		int[][] arr=new int[rows][cols];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int x=s.nextInt();
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(arr[i][j]==x) {
					System.out.println("x found at location ("+ i +","+ j +")");
				}
			}
	}
}
}*/