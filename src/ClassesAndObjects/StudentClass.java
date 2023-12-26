package ClassesAndObjects;
/* This a java class that has been use for purpose of templating objects */

public class StudentClass {
    
    private String name ;       //By default the value is null(non-primitive type)
    private int rollNumber;     //By default the valur is 0 (int-primitive type)
                                //private indicates the access is only within the package
    
    public int getRollNumber()
    {
        return rollNumber;      //getter function for private variable
    }

    public void setRollNumber(int num)
    {
        if(num<=0)
        {
            return;
        }
        rollNumber = num;        //setter function for private variable
    }

    public String getName()
    {
        return this.name;       //"this" is not really needed as there is no local variable but considered as good practice
    }

    public void setName(String name)
    {
        if(name=="")
        {
            return ;
        }
        this.name = name ;  //"this" - keyword helps the method to find the variable "name" as object.data
                            // instesd of finding the variable "name" as local variable to the method.
    }
}
