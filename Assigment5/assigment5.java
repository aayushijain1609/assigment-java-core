import assigment5.Serialization;

class assigment5{
public static void main(String[] args) {
    System.out.println("Serializing \"output1.ser\" : \n");
        Serialization.Serializable();
        System.out.println("\nSerialization done !!\n");
 
       
        Deserialization.Deserialization1();
        System.out.println("\nDESerialization done !!\n");

        System.out.println("Serializing \"output2.ser\" : \n");
        Deserialization.Deserialization2();
        System.out.println("\nDESerialization done !!\n");
    }
}
