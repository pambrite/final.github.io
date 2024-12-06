import java.util.Scanner; //Ford Ambrite 
public class lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in the first matrix: ");
		
		int row1 = key.nextInt();
		
		System.out.println("Enter the number of columns in first matrix: ");
		
		int cols1 = key.nextInt();
		
		//First matrix
		int[][] matrix1 = new int[row1][cols1];
		System.out.println("Enter the numbers of the first matrix: ");
		for(int i = 0; i < row1; i++)
		{
			for(int j = 0; j < cols1; j++)
			{
				matrix1[i][j] = key.nextInt();
			}
		}
		
		
		//Second matrix
		int[][] matrix2 = new int[row1][cols1];
		while(true)
		{
			System.out.println("Enter the number of rows for the second matrix: ");
			int row2 = key.nextInt();
			System.out.println("Enter the columns for the second matrix: ");
			int cols2 = key.nextInt();
			
			if(row2 == row1 && cols2 == cols1)
			{
				matrix2 = new int[row2][cols2];
				break;
			} else {
				System.out.println("Dimension mismatch! Re enter values! ");
			}
		}
		
		//Gets values of the second matrix
		System.out.println("Enter values of second matrix: ");
		for(int i = 0; i < matrix2.length; i++)
		{
			for(int j = 0; j < matrix2[i].length; j++)
			{
				matrix2[i][j] = key.nextInt();
			}
		}
		
		//Adds the sum of the matrices 
		int[][] matrix3 = new int[row1][cols1];
		for(int i = 0; i < row1; i++)
		{
			for(int j = 0; j < cols1; j++)
			{
				matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//Prints final answer
		System.out.println("Sum of the matrices: ");
		for(int i = 0; i < matrix3.length; i++)
		{
			for(int j = 0; j < matrix3[i].length; j++)
			{
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
