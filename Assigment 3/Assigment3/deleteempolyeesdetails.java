package Assigment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deleteempolyeesdetails {
    
    public static void deleteempolyeesd()throws IOException{
        Scanner sc=new Scanner(System.in);
        String name,emailaddress,dob,age;
       String delete =sc.next();
        BufferedReader readfile=new BufferedReader(new FileReader("Assigment 3\\Employee.txt\\Employee.txt"));
        String str;
        List<ArrayList<String>>list1=new ArrayList<ArrayList<String>>();
        boolean notfound = true;
        while ((str = readfile.readLine()) != null) {
            boolean found = false;
            String[] details = str.split(",  ");
            if (details[0].contains(delete)) {
                System.out.println(str);
                found = true;
                notfound = false;
            }
            ArrayList<String> detail = new ArrayList<>();
            for (String temp : details) {
                detail.add(temp);
            }
            if (found == false) {
                list1.add(detail);
            }if (notfound == true) {
            System.out.println("\nSorry we do not found any employee with this Information\n");
        } else {
            System.out.println("Deleting these details !! ");
            BufferedWriter write = new BufferedWriter(new FileWriter("Assigment3\\Employee.txt"));
            for (ArrayList<String> l : list1) {
                for (String s : l) {
                    write.write(s + ",  ");
                }
              write.newLine();
            }
            write.flush();
            write.close();
        }
    }
}

    }

