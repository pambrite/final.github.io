import java.util.Scanner; //Ford Ambrite
public class lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle: ");
		
		int height = key.nextInt();
		
		for(int i = 1; i <= height; i++) //Builds the top half of the triangle
		{
			for(int j = 1; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i = height - 1 ; i >= 1; i--) //Builds the bottom half of the triangle
		{
			for(int j = 1; i >= j; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}	
	}}
		

	


