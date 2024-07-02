import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      double wallHeight;
      double wallWidth;
      double cansNeeded;
      double wallArea;
      double gallonsPaintNeeded;
      double paintCost;
      double salesTax;
      double totalCost;
      
      wallHeight = scnr.nextDouble();
      wallWidth = scnr.nextDouble(); 
      wallArea = wallHeight * wallWidth;
      System.out.printf("Wall area: %.1f sq ft\n", wallArea);
      
      gallonsPaintNeeded= wallArea/350.0;
      System.out.printf("Paint needed: %.3f gallons\n", gallonsPaintNeeded);
      
     
     System.out.printf("Cans needed: " + (int) (Math.ceil (gallonsPaintNeeded)) + " can(s)\n");
     paintCost= scnr.nextDouble();
     System.out.printf("Paint cost: $%.2f\n", paintCost);
     salesTax= (7.0 * paintCost * gallonsPaintNeeded)/100.0;
     System.out.printf("Sales tax: $%.2f\n", salesTax);
     
   }
}
     