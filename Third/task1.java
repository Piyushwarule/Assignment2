import java.util.Scanner;

public class task1 {
	
	public void oddoreven(int a)
	{
		if(a%2==0)
		{
			System.out.println(a+" is an even number");
		}else
		{
			System.out.println(a+" is an odd number");
		}
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check whether it is odd or even");
		int a=sc.nextInt();
		
		task1 obj=new task1();
		obj.oddoreven(a);
		

	}

}
