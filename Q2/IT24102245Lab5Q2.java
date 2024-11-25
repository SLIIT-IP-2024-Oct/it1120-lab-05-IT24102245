import java.util.Scanner;

public class IT24102245Lab5Q2 {

   public static void main(String[] args) {

     
     Scanner scanner = new Scanner(System.in);

     
     System.out.print("Enter the number of new members introduced: ");
     int numMembers = scanner.nextInt();

     
     if (numMembers < 0) {
         System.out.println("Invalid input. The number of new members cannot be negative.");
     } else {
        
         
           switch (numMembers) {
             case 0:
                 System.out.println(); 
                 System.out.println("No Prize");
                 break;
             case 1:
                 System.out.println(); 
                 System.out.println("Prize is a: Pen");
                 break;
             case 2:
                 System.out.println(); 
                 System.out.println("Prize is a: Umbrella");
                 break;
             case 3:
                 System.out.println(); 
                 System.out.println("Prize is a: Bag");
                 break;
             case 4:
                 System.out.println(); 
                 System.out.println("Prize is a: Travelling Chair");
                 break;
             default:
                 System.out.println(); 
                 System.out.println("Prize is a: Headphone");
                 break;
         }
     }

    
     scanner.close();
   }
}
