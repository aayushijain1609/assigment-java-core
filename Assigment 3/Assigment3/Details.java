package Assigment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Details{
public static void Searchdetails()throws IOException{
    System.out.println("enetr youre age??");
    Scanner sc =new Scanner(System.in);

    String search=sc.nextLine();
    BufferedReader readfile = new BufferedReader(new FileReader("C:\\Assigment 3\\Employee.txt\\Empolyee.txt"));
    boolean notfound=false;
    String str;

    while ((str = readfile.readLine()) != null) {
        String[] details = str.split(",  ");
        for (String in : details) {
            if (search.equals(in)) {
                System.out.println(str);
                notfound = true;
            }
        }
    }
    if (notfound == false) {
        System.out.println("\nSorry we do not found any employee with this Information\n");
    } else {
        System.out.println("These details are found.");
    }
}


}
