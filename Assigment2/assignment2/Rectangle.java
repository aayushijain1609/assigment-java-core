package assignment2;
public class Rectangle {
    public void calculation() {
        int l = 2, b = 4;
        try {
            int area1, pereminter1;
            pereminter1 = 2 * (l + b);
            area1 = l * b;
            System.out.println("perimeter of rectangle " + pereminter1);
            System.out.println("area of rectangle" + area1);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}

