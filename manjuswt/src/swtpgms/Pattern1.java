package swtpgms;

public class Pattern1 {

	public static void main(String[] args) {
		int i, j, row=6;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line a   fter printing each line  
		System.out.println();  

	}

	}         
}
