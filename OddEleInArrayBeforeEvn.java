package arrays;

import java.util.Arrays;

//welcome

public class OddEleInArrayBeforeEvn {

	public static int[] copy(int n[],int t[])
	{
		for(int i=0;i<n.length;i++)
		{
			n[i]=t[i];
			System.out.println(n[i]);
	
		}
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {4,3,1,0,6};
		int temp[]=new int[num.length];
		int j=0,k=num.length-1;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2!=0)
			{
				temp[j++]=num[i];
			}
			else
			{
				temp[k--]=num[i];
			}
		}
		
		num=copy( num, temp);
		System.out.println(Arrays.toString(num));
	}

}
