

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import assigment5.Student;



public class Deserialization  {
    /**
     * 
     */
   
    public static void Deserialization1(){
 try{
    File file=new File("output2.ser");
    ObjectInputStream oin=  new ObjectInputStream(new FileInputStream("assigment5\\output2.ser"));
    for( int i=0; i<5;i++){
        Student s= (Student) oin.readObject();
        System.out.println(s);
    }
 }
 catch( IOException|ClassNotFoundException e){
    System.out.println("error occured !!!");
    System.out.println(e);
 }
    }
   
        

    
      public static void Deserialization2(){
     try{
      
       File file =new File("output2.ser");
        ObjectInputStream oin=  new ObjectInputStream(new FileInputStream("assigment5\\output2.ser"));
        for( int i=0; i<5;i++){
            Student s= (Student) oin.readObject();
            System.out.println(s);
        }
     }
     catch( IOException|ClassNotFoundException e){
        System.out.println("error occured !!!");
        System.out.println(e);
     }
        }

      }