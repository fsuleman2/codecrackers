/******************************************************************************
Efficient way to sort a given list of numbers using Selection Sort

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void selectionSort(int a[])
    {
        int min;
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
            min=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int temp = a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
    public static void print(int a[])
    {
        int n = a.length;
        for(int i=0;i<n;++i)
        {
            System.out.print(a[i]+" ");
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
	   selectionSort(a);
	   print(a);
	}
}

