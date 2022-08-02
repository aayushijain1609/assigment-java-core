package Assigment3;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class addempolyeesdetails  {
  
        
    
    /**
     * @throws IOException
     */
    public static  void addempolyeesd() throws IOException {
        Scanner sc=new Scanner(System.in);
        String name,emailaddress,dob,age;
        
        
        String a[]={"0","1","2","3","4"};
        ArrayList<String>list=new ArrayList<String>();
        a1:while(true){
       
     System.out.println("enter the name");
     String temp =sc.next();
     for(String i:a){
         if(temp.contains(i)){
         System.out.println("invalid input");
        temp=null;
        continue a1;
        }
     
    }     
    name=temp.substring(0,1).toUpperCase()+temp.substring(1)+temp.toLowerCase();
      break a1;  
}    while (true) {

    try {
        System.out.print("\nEnter DOB (in \"dd/mm/yyyy\") : ");
        dob = sc.next();
        Date dOb = new SimpleDateFormat("dd/mm/yyyy").parse(dob);

        break;
    } catch (ParseException e) {
        System.out.println("Invalid Input !!\nEnter again !!");
        dob = null;
        continue;
    }
}
System.out.print("\nEnter age : ");
age = sc.next();

while (true) {
    System.out.print("\nEnter Email Id : ");
    emailaddress = sc.next();
    if (emailaddress.contains("@") && emailaddress.contains(".")) {
        emailaddress = emailaddress.toLowerCase();
        break;
    } 
    else {
        System.out.println("Invalid Input !!\nEnter again !!");
        emailaddress = null;
        continue;
    }
}
        list.add(name);
        list.add(emailaddress);
        list.add(dob);
        list.add(age);
    FileWriter addempolyeeedetails=new FileWriter("Assigment 3\\Employee\\Empolyee.txt",true);
    for(String s:list){
        addempolyeeedetails.write(s+ ",");
    
    }
addempolyeeedetails.write("\n");


 }

    private String toLowerCase() {
        return null;
    }
}