package assignment2;
public class Cube {
   
        public void calculation() {
            int len = 3;
            try {
                double surfacearea,volume;
                surfacearea = 6 * (len * len);
                volume = len * len * len;
                System.out.println("surface area of cube" +surfacearea);
                System.out.println("volume of cube"+volume);
            } 
            catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }

