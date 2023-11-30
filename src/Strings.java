public class Strings {

    public static void main(String[] args) {
        
        /* 
        String str1="Catching";
        String str2="Batching";
        String str3="Hatching";

        //length of the string
        System.out.println(str1.length());
        //character at index i
        System.out.println(str1.charAt(2));
        //add two strings
        System.out.println(str1.concat(str2));
        //check for a character
        System.out.println(str1.contains("atch"));
        //equality based on ascii values
        System.out.println(str1.equals(str3));
        //return index of first occuring character
        System.out.println(str3.toLowerCase().indexOf('h'));
        //replacing occurance of all characters
        System.out.println(str3.replace('H', 'L'));
        //split a string into character array
        System.out.println(str1.split("Latch"));
        //convert to upper case
        System.out.println(str1.toUpperCase());
        //comparing two strings based on ascii values
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        //substring of a string
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(2, 7));

        //comparisons of strings in arrays
        String s1="abc";
        String s2="abc";
        String s3= new String("def");
        String s4= new String("def");

        if(s1==s2){System.out.println("abc's are equal");}
        else{System.out.println("abc's are not equal");}

        if(s3==s4){System.out.println("def's are equal");}
        else{System.out.println("def's are not equal");}
*/

        //String buffer - Immutable sequence of strings
        String str = "abc";
        StringBuffer str1 = new StringBuffer("abc");

        System.out.println("String: "+str);
        System.out.println("StringBuffer: "+str1);
        System.out.println("Address of String: "+System.identityHashCode(str));
        System.out.println("Address of StringBuffer: "+System.identityHashCode(str1));

        str+='b';       // modification is done after storing in new mwmory address
        str1.setCharAt(0, 'b'); //modification done in same address in buffer

        System.out.println("String: "+str);
        System.out.println("StringBuffer: "+str1);
        System.out.println("Address of String: "+System.identityHashCode(str));
        System.out.println("Address of StringBuffer: "+System.identityHashCode(str1));
    }
    
}
