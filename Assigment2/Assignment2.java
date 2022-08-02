import java.util.*;
import assignment2.*;
public class Assignment2{
    public static void main(String[] args) {
        String choice = null;
    
        do{

                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println();
                    System.out.println("Types of Shape :\n\t1)Circle\n\t2)Recatangle\n\t3)Square\n\t4)Cube\n\t5)Triangle\n\t6)Sphere\n\t7)Cylinder\n\t8)exit the program\n\t");
                    System.out.print("Enter your choice(in numbers): ");
                    choice = sc.next();
                }
                switch (choice) {
                    case "1":
                        try {
                            
                            Cricle cricle = new Cricle();
                            cricle.calculation();
                        } 
                        catch (Exception e) {
                        
                            System.out.println("invaild");
                        }
                        break;

                    case "2":
                        try {
                            Rectangle re = new Rectangle();
                            re.calculation();

                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                        break;
                    case "3":
                        try {
                            Square sq = new Square();
                            sq.calculation();


                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                    case "4":
                        try {
                            Cube cube = new Cube();
                            cube.calculation();

                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                    case "5":
                        try {
                            Triangle triangle = new Triangle();
                            triangle.calculation();
                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                    case "6":
                        try {
                            Sphere sp = new Sphere();
                            sp.calculation();
                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                        break;
                    case "7":
                        try {
                            Cylinder cy = new Cylinder();
                            cy.calculation();

                        } catch (Exception e) {
                            System.out.println("invalid");
                        }
                        break;
                    case "8":
                        System.out.println("Exiting !!!");
                        break;
                    default:
                            System.out.println("invalid input");
                
            }
        }while (choice!="8");
    

    }
}
 

              
               
                
        
