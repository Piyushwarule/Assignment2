import java.util.Scanner;

class task3 {
  
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the first point coordinate ");
        float x1= scan.nextFloat();
        float y1= scan.nextFloat();
        
        System.out.print("Enter the second point coordinate ");
        float x2= scan.nextFloat();
        float y2= scan.nextFloat();
        
        float slope=(y2 - y1) / (x2 - x1);
       
        System.out.println("Slope is "+slope);
    }
}