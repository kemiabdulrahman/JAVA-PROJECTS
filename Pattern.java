public class Pattern {

	public static void main(String[] args){

pattern1(5);
System.out.println();
pattern2(5);
System.out.println();
pattern3(6);
System.out.println();
pattern4(5);
System.out.println();
pattern5(7);
System.out.println();
pattern28(7);
System.out.println();
mypattern(9);
	}	



/*
 * Explanation of the for loop:
 * row = 0
 * column = row * 3 = row (0) * 3 = 0
 * then the condition which says that (col) < row * 
 *
 *
 * Note that i has its own row and column;
 * j also has its own row and column;
 *
 * so if it is said that the column of (j) == (row of (j) * 3); 
 *
 *
 */








	static void mypattern(int n){
for (int row = 1; row <= n; row++) {
          //System.out.println(row); 
for (int col = (row * 4); col < (row * 4) + 4; col++) {
		System.out.print(col);
		
	}
	System.out.println();
	
}

	}





	static void pattern28(int n){
for (int row = 1; row <= 2 * n - 1; row++) {
      

	int totalColumnsInrows = row > n ? 2 * n - row: row;
     int noOfSpaces = n - totalColumnsInrows;
	for (int s = 0; s < noOfSpaces; s++) {
	  System.out.print(" ");	
	}


	for (int col = 1; col <= totalColumnsInrows; col++) {
		System.out.print("* ");
			
	}
	System.out.println();
	
}

	}












	static void pattern5(int n){
for (int row = 1; row <= 2 * n - 1; row++) {
int totalColumnsInrows = 2 * n - row;

	if (row > n) {
			totalColumnsInrows = 2 * n - row;
			
		} else {
		 totalColumnsInrows = row;
		
			
		}


	for (int col = 1; col <= totalColumnsInrows; col++) {
		System.out.print("* ");
			
	}
	System.out.println();
	
}

	}






	static void pattern4(int n){
for (int row = 1; row <= n; row++) {

	for (int col = 1; col <= row; col++) {
		System.out.print(col + " ");
		
	}
	System.out.println();
	
}

	}




	static void pattern3(int n){
for (int row = 1; row <= n; row++) {
          System.out.println(row);
	for (int col = 1; col <= n - row + 1; col++) {
		System.out.print("* ");
		
	}
	System.out.println();
	
}
	}



	static void pattern2(int n){
for (int row = 1; row <= n; row++) {

	for (int col = 1; col <= n; col++) {
		System.out.print("* ");
		
	}
	System.out.println();
}	
}





	static void pattern1(int n){
for (int row = 1; row <= n; row++) {
    System.out.println(row);       
	for (int col = 1; col <= row; col++) {
		System.out.print(col);
		
	}
	System.out.println();
	
}

	}
	}
	

