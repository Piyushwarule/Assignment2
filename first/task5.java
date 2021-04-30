import java.lang.Math.*;
import java.util.Scanner;
public class task5 {

	public static void main(String[] args) {

        float r;
        double area, circum;
        
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Radius of Circle : ");
        r = scan.nextFloat();
		
        area = Math.PI*r*r;
        circum = 2*Math.PI*r;
		
        System.out.print("Area of Circle = " +area);
		
        System.out.print("\nCircumference of Circle = " +circum);

	}

}
