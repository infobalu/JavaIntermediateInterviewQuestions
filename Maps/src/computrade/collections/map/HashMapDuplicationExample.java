package computrade.collections.map;
import java.util.HashMap;
import java.util.Map;

import computrade.Student;

public class HashMapDuplicationExample {
    public static void main(String[] args) {
    	
        // Instantiate a HashMap with Integer as the key type and Student as
        // the object type.
        Map<Integer, Student> students = new HashMap<Integer, Student>();
        // Instantiate three Students; the constructor arguments are 
        // used to initialize Student attributes studentId and studentName
        Student s1 = new Student(12345, "Fred");
        Student s2 = new Student(98765, "Barney");
        Student s3 = new Student(71024, "Wilma");

        // Insert all three Students into the HashMap.
        students.put(s1.getStudentID(), s1);
        students.put(s2.getStudentID(), s2);
        students.put(s3.getStudentID(), s3);
        
        Student s4 = new Student(98765, "New Barney");//override the previous value
        Student previous = students.put(s4.getStudentID(), s4);
       
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Strudent: " + entry.getValue() );
        }
        
        System.out.println("The previous student is returned: " + previous);
        
        students.put(null, previous);
        
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Strudent: " + entry.getValue() );
        }
        
        Student nullStudent =  students.get(null);
        System.out.println("\nThis is the NULL student: " + nullStudent);
        
        //it is possible to set a value to null as well
        students.put(888, null);
        
        System.out.println("\nIterate through the HashMap to process all Entries (Id, Student):");
        for (Map.Entry<Integer,Student> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() +  " Strudent: " + entry.getValue() );
        }
        
    }
}
