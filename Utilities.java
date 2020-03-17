import java.util.Arrays;
import java.util.Scanner;
public class Utilities {
	Scanner ohyeah = new Scanner(System.in);
	public int[] inputValues() {
		System.out.println("Please enter array length:");
		int read = ohyeah.nextInt();
		int myArray[] = new int [read];
		System.out.println("Please enter array values");
		for (int i = 0; i < myArray.length; i++){
			myArray[i] = ohyeah.nextInt();
			
	}
		return myArray;
	}
	public String printValues(int[] a) {
		return Arrays.toString(a);
	}
	
	public void circularShift(int [] a) {
		System.out.println("Please input number of rotations here");
		int t = ohyeah.nextInt();
		int n = t;
		for (int i= 0; i < n;i++){
			int last = a[a.length-1];
			 for(int j = a.length-1; j > 0; j--){ 
				 a[j] = a[j-1];  
			 }
			 a[0] = last;   
			}
		System.out.println(Arrays.toString(a));
	}
	public void isSymmetric(int [][] a) {
			//loop used to input values for matrix
			System.out.println("Please enter values for a 3x3 matrix");
		   for (int i = 0; i < 3; i++) {
		       for (int j = 0; j < 3; j++) {
		         a[i][j] = ohyeah.nextInt();
		       }
		       
		   }		
		   //loop used to print matrix
		   for (int i = 0; i < 3; i++){
				for (int j = 0; j < 3; j++){
				System.out.print(a[i][j]+ " ");
				}
				System.out.println();
			}
		   //loop to check if symmetric or not
		   boolean check = false;
		   for(int i = 0; i < 3; i++) {
			   for(int j = 0; j < 3; j++) {
				   if(a[i][j] != a[j][i]) {
					   check = true;
		  }
		}
	  }
		   if(check == true) {
			   System.out.println("This matrix is not symmetric");
		   }else {
			   System.out.println("This matrix is symmetric");
		   }
			   }
	public int[][] createoddSquare() {
		System.out.println("Please input odd number of rows and columns: ");
		int n = ohyeah.nextInt();
		int [][] magicSquare = new int [n][n];
		int i = n/2;
		int j = n-1;
		
		for(int k = 1; k <= n*n;) {
			//sets the current number to the position
			magicSquare[i][j] = k++;   
            j++;  
            i--;
            //checks if both i is negative and j is out of bounds
			 if (i == -1 && j == n) { 
	                j = n-2; 
	                i = 0; 
	            } 
			 //checks if j is out of bounds
	            if(j == n){ 
	              j = 0; 
	            } 
	         //checks if value of i is negative
	            if(i < 0){  
	            	i=n-1; 
	            } 
	         //checks if there is a number already at current position
	            if (magicSquare[i][j] != 0){ 
	                j -= 2; 
	                i++; 
	            }       

	}
		return magicSquare;
}
	public int[][] createdoublyevenSquare(){
		System.out.println("Please input even number of rows and columns divisible by 4: ");
		int n = ohyeah.nextInt();
		int [][] magicSquare = new int [n][n];
		//loop that fills square with numbers from 1 up to n * n
		for (int i = 0; i < n; i++){
	        for (int j = 0; j < n; j++){
	            magicSquare[i][j] = (n*i) + j + 1;  
	        }
	    }
		//top left corner
	    for (int i = 0; i < n/4; i++){
	        for (int j = 0; j < n/4; j++){
	        magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
	    }
	    }
	    //top right corner  
	    for (int i = 0; i < n/4; i++){
	        for (int j = 3* (n/4); j < n; j++){
	        magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
	    }
	    }
	    //bottom left corner 
	    for (int i = 3* n/4; i < n; i++){
	        for (int j = 0; j < n/4; j++) {
	        magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
	    }
	    } 
	    //bottom right corner
	    for (int i = 3* n/4; i < n; i++){
	        for (int j = 3* n/4; j < n; j++) {
	        magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
	    }
	    }
	    //middle of square
	    for (int i = n/4; i < 3* n/4; i++){
	        for (int j = n/4; j < 3* n/4; j++) {
	            magicSquare[i][j] = (n*n + 1) - magicSquare[i][j];
	    }
	}
	    return magicSquare;
	}
	public int[][] createsinglyevenSquare() {
		System.out.println("Please input even number of rows and columns not divisible by 4: ");
		int n = ohyeah.nextInt();
		int [][] magicSquare = new int [n][n];
		int i = n/2;
		int j = n-1;
		
		for(int k = 1; k <= n*n;) {
		//top Left quadrant
			
		//top Right quadrant
			
		//bottom left quadrant
			
		//bottom right quadrant

	}
		return magicSquare;
}
	public void printSquare(int[][] a) {
		for(int i = 0; i < a.length; i++) { 
			for(int j = 0; j < a.length; j++) 
                System.out.print(a[i][j]+" "); 
            System.out.println(); 
        } 
	}
}
	

