import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r=sc.nextInt();
		System.out.println("enter the no. of columns");
		int c=sc.nextInt();
		System.out.println("enter the"+r+"rows and"+c+"columns");
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
			System.out.println("the matrix before rotation");
		for(int i=0;i<r;i++)
		{
		    System.out.println();
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(a[i][j]);
		    }
		}
		System.out.println();
		
		System.out.println(" matrix after rotation");
		//System.out.println();
		    for(int j=r-1;j>=0;j--)
		    {
		        System.out.println();
		         for(int i=0;i<r;i++)
		         {
		            System.out.print(a[i][j]);
		         }
		        
		    }
		
	}
}

