package assigment5;

import java.io.File;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Student implements Serializable {
    
     File file= new File("output1.ser");
     File f= new File("output2.ser");
   
    String firstName;
    Date dateOfBirth;
    address ad;
    

    public Student(String firstName, String city, String state, String dateOfBirth, int pinCode, String country)throws ParseException{
        this.firstName=firstName;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        ad= new address(city, state, country, pinCode);
        
    }
    
}

    
