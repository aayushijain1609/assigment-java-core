package assignment2;
public class Triangle {
  
        public  void calculation() {
            int bh = 3;
            int h = 2;
            try {
                int area3;
                area3 = (bh * h) / 2;
                System.out.println("area of triangle is:" + area3);
            } catch (Exception e) {
                System.out.println("error" + e);
            }
        }
    }

