package assignment2;
public class Square {
 
        public void calculation() {
            int side = 4;
            try {
                int area2, pereminter2;
                area2 = 4 * side;
                pereminter2 = 4 * side;
                System.out.println("area and permeter of sqaure is:" + area2 + pereminter2);

            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
        }
    }


