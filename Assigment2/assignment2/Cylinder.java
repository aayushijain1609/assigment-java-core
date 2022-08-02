package assignment2;
public class Cylinder {
    /**
     * 
     */
    public void calculation() {


        int height = 5;
        int radus = 10;
        float p = 3.14f;

        try {
            double v, sua;
            v = p * (radus * radus) * height;
            sua = 2 * p * radus * (height + radus);
            System.out.println("vol of cy" + v);
            System.out.println("vol of sua" + sua);

        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    }

    

