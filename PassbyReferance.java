package arrays;
//hello
public class PassbyReferance {
	public static void change(int num[])
	{
		num[0]=1;
		num[1]=0;
	}
	public static void printArray(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]+ " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {0,1};
		change(num);
		printArray(num);
		

	}

}
