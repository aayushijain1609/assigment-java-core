package assigment5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException; 


public class Serialization {

    /**
     * 
     */
    public static void Serializable() {

        try {
         File file =new File("output1.ser"); 
         File f=new File("output2.ser");
 
       
           
         Student s1 = new Student("Aayushi" ,"Indore", "M.P.", "16/09/2002", 4122, "India");
         Student s2 = new Student("Matiri", "Bhopal", "M.P.", "12/09/2002", 52005, "India");
         Student s3 = new Student("Disha" ,"Bhopal", "M.P.","1/06/2004" ,52002,  "India");
         Student s4 = new Student("Calra", "Chicago", "Illonies", "1/09/2002", 111, "USA");
         Student s5 = new Student("Jen", "Chicago", "Illonies." ,"12/09/2002", 1111, "USA");
           
            
         ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("assigment5//output1.ser"));
         ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream("assigment5//output2.ser")); 
            o.writeObject(s1);
            o.writeObject(s2);
            o.writeObject(s3);
            o.writeObject(s4);
            o.writeObject(s5);
            o.close();

            o1.writeObject(s1);
            o1.writeObject(s2);
            o1.writeObject(s3);
            o1.writeObject(s4);
            o1.writeObject(s5);
            o1.close();
           
        }
        catch (IOException | ParseException e) {
            System.out.println("error occur");
            System.out.println(e);
        }
    }
}
