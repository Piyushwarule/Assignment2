import java.util.Scanner;

public class task3 {
	
	public void checking(int a,int b,int c) 
	{
		int big,max;
		if(a>b)
		{
			big=a;
		}else
		{
			big=b;
		}
		if(big>c)
		{
			max=big;
		}else
		{
			max=c;
		}
		System.out.println("Largest number is "+max);
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Check which number is highest among given number");
		System.out.println("Enter three number");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		task3 obj=new task3();
		obj.checking(a,b,c);
	}

}
