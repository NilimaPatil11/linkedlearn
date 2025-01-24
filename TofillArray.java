package arrays;

import java.util.Scanner;
//welcome

public class TofillArray {
	public static void fill(int num[])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num.length;i++)
		{	
			System.out.println("Enter the value");
			num[i]=sc.nextInt();
		}
	}
	public static void printArray(int num[])
	{
		for (int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many numbers you want to print");
		n=sc.nextInt();
		if(n<1||n>20)
		{
			System.out.println("Not in range,Plz enter between 1 to 20");
			n=sc.nextInt();
		}
		int num[]=new int[n];
		fill(num);
		printArray(num);
	}

}
