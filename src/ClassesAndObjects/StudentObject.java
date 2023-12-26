package ClassesAndObjects;
/* This is an istance from the class - StudentClass */

public class StudentObject{

    public static void main(String[] args) {

        //Creating objects out of student class
        StudentClass s1 = new StudentClass();
        s1.setName("Sujith");
        s1.setRollNumber(40); 

        StudentClass s2 = new StudentClass();
        s2.setName("Yashwanth");
       // s2.rollNumber = 48;

       System.out.println("I am "+s1.getName()+" and my roll umber is "+s1.getRollNumber());
        //System.out.println("I am "+s2.name+" and my roll umber is "+s2.rollNumber);
        //System.out.println(s1); //address of s1 object
        //System.out.println(s2); //address of s2 object
    }
}