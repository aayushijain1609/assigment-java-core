package assigment5;
import java.io.Serializable;

public class address implements Serializable{
    String state,country,city;
    int pincode;

public address( String city, String state, String country,int pincode){
 this.city=city;
 this.state=state;
 this.country=country;
 this.pincode=pincode;
}
}