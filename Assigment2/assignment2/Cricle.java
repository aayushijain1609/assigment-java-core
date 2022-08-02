package assignment2;
public class Cricle {
    
    public void calculation() {
        int radius = 5;
        try {

            double area, perimeter;
            area = 3.14 * radius * radius;
            perimeter = 2 * 3.14 * radius;

            System.out.println("Area of Circle: " + area);
            System.out.println("Perimeter of Circle: " + perimeter);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

    }
}

