import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in );
		System.out.print("Enter a number: ");
        int a=s.nextInt();
        
        if(a==-10 || a==-3 || a==7 || a==12 || a==22)
        {
            System.out.print("RED");
        }
        else if(a==11 || a==15 || a==19 || a==25 || a==32)
        {
           System.out.print("YELLOW");
        } 
        else if((a>=50 || a<=53) || (a>=60 || a<=63) )
        {
            System.out.print("BLUE");
        }
        else if(a==60 || a==100 || a==200 || a==210)
        {
            System.out.print("GREEN");
        }
       else
        {
        	System.out.print("BLACK");
        }
	}

}
