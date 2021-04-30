import java.util.Scanner;
import java.util.Arrays;   

public class task4 {
	
	public int average(int a,int b,int c)
	{
	    int avg=(a+b+c)/3;
	    return avg;
	}

	public static void main(String[] args) {
		
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the 3 internal subject marks of a student");
		for(int i=0; i<3; i++)  
		{  
		   
		arr[i]=sc.nextInt();  
		}  
		Arrays.sort(arr); 
		
		
		
		int a=arr[1];
		int b=arr[2];
		
		System.out.println("Input the external subject mark of a student");
		int d=sc.nextInt();
		task4 obj =new task4();
		
		int marks=obj.average(a, b, d);
		
		   
		
		 if(marks>=86)
	        {
	            System.out.print("A");
	        }
	        else if(marks>=76 && marks<86)
	        {
	           System.out.print("B");
	        } 
	        else if(marks>=66 && marks<76)
	        {
	            System.out.print("C");
	        }
	        else if(marks>=50 && marks<66)
	        {
	            System.out.print("D");
	        }else
	        {
	        	System.out.print("F");
	        }
	}

}
