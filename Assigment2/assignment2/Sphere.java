package assignment2;
public class Sphere {
    public  void calculation() {
        int r = 3;
        double pie = 3.1415;
        try {
            double vol, sa;
            vol = (4.0 / 3.0) * pie * (r * r * r);
            sa = 4 * pie * (r * r);
            System.out.println("volume of sphere " + vol);
            System.out.println("surface area" + sa);
        } catch (Exception e) {
            System.out.println("error" + e);
        }
    }
} 
    

