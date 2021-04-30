import java.util.Scanner;
public class task2 {
	
	public void checking(int a) 
	{
		if(a==0)
		{
			System.out.println("number is equal to zero");
		}else if(a>0)
		{
			System.out.println("number is postive");
		}else
		{
			System.out.println("number is negative");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Check whether a number is positive,negative or zero");
		System.out.println("Enter a number");
		
		int a=sc.nextInt();
		
		task2 obj=new task2();
		
		obj.checking(a);
		

	}

}
