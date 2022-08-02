package Assigment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeSet;

public class Sort {
    
    /**
     * @param sortchoice
     * @throws IOException
     */
    public static void sorting(int sortchoice)throws IOException{
        ArrayList<String>notarrange =new ArrayList<>();
        ArrayList<String>arrange=new ArrayList<>();
        List<ArrayList<String>> data=new ArrayList<>();
        List<ArrayList<String>> sort=new ArrayList<>();
        BufferedReader readfile = new BufferedReader(new FileReader("Assigment 3\\Employee\\Empolyee.txt"));
        String str;
        while((str=readfile.readLine()) != null){
            ArrayList<String> details=new ArrayList<>();
            String[] information=str.split(", ");
           for(String j:information){
            details.add(j);
           }
           data.add(details);
         }
         for(int i =0;i<data.size();i++){
            notarrange=data.get(i);
            arrange.add(notarrange.get(sortchoice)); 
              
         }
         ArrayList<String> sorting =new ArrayList<>();
       TreeSet<String> arrangeSet=new TreeSet<String>();
        for(ArrayList<String> l: sort){
         for(String s:arrangeSet){
            for(int i=0; i<data.size();i++){
                sorting=data.get(i);
                if(sorting.contains(s)){
                 sort.add(sorting);
                }

            }
         }
        }
         BufferedWriter write = new BufferedWriter(new FileWriter("Assigment 3\\Employee\\Empolyee.txt"));
         for(ArrayList<String> l:sort){
            for(String s:l){
                write.write( s+" ,");
            }
         }
        }
    }