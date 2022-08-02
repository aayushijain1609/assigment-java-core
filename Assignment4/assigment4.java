import java.util.Scanner;

import assigment4.*;

public class assigment4{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String choice=null;
    System.out.print("1) Run AccountOverdrawDemo \n2) Run2 AccountOverdrawSafeDemo\n 3) Exit \nEnter Choice : ");
    choice = sc.next();
    switch(choice){
        case "1":
        System.out.println("account acesses \n");
          accountoverload a1 =new accountoverload();
            Thread t1= new Thread(a1);
            Thread t2= new Thread(a1);
            Thread t3= new Thread(a1);
            t1.setName("Aayushi");
            t2.setName("Anushree");
            t3.setName("Aadhya");
            t1.start();
            t2.start();
            t3.start();

      break;
      case "2":
     System.out.println("for overloadsaftey:\n");
     accountoverloadsafedemo a2=new accountoverloadsafedemo();
     Thread t4= new Thread(a2);
     Thread t5= new Thread(a2);
     Thread t6= new Thread(a2);
     t4.setName("Aayushi");
     t5.setName("Anushree");
     t6.setName("Aadhya");
     t4.start();
     t5.start();
     t6.start();
     break;

     case"3":
     System.out.println(" exit thank you for visting !!!"); break;
    
     default:
     System.out.println("!! Invalid Input !! Try Again !!");
    }
    
}
}