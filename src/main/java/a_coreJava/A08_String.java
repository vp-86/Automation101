package a_coreJava;

public class A08_String {
 /*
     String vs StringBuilder vs StringBuffer

      String : non-mutable
      StringBuilder: Mutable NonSynchronized NonThreadSafe faster 1.5
      StringBuffer : Mutable    Synchronized    ThreadSafe Slower 1.0

     Heap vs Pool
        String name = "Mike"   --- String literal
          * when created JVM checks in String Pool memory ? return existing : create new ;
          * This process called String interning

        String name = new String("test");  -- creates new Object; -- same string value obj not same

        Garbage Collection :
         Before Java7 -- limited memory space of String Pool...issue : out of memory
         with Java7 -- String Pool included in HEAP, Garbage collection - no more momory issue


     String class methods :

        1. concat , +
        2. length() --   vs length ( for array )

        3. toLowerCase
        4. toUpperCase
         . toCharArray
         .

        5. contains
        6. equalsTo , equalsIgnoreCase
         . startsWith
         . endsWith

        7. charAt

            String text = "I live in USA"
        8. indexOf("i") >> 0
         . indexOf("live") >> result first char index : 2
         . indexOf("i",5) >> ans: 7
         . lastIndexOf("i")  >> 7
         . lastIndexOf("k",5) >> 3
        9. substring( 2,5  I,E) >> : Ans 2 3 4   liv
       10. split(' ')  -- ["I", "live", "in", "USA" ]

       11. replace,
         . replaceFirst
       12. reverse

       ToDO: reverse string diff way
  */

    public static void main(String[] args) {
        //Declaring the String
        String sPopularTopic_1 = "Selenium Automation Framework";
        String sPopularTopic_2 = "Basic Java Tutorial";

        //Compare two String: This would compare two strings
        //If the twos strings are equal, it will return 'true' else it will return 'false'
        boolean bCompareResult = sPopularTopic_1.equals(sPopularTopic_2);
        System.out.println("The result of String Comparison is : " + bCompareResult);

        //Character at: This would return the single character at index value from the String
        char cIndex = sPopularTopic_1.charAt(5);
        System.out.println("The fifth character of Popular Topic 1 is : " + cIndex);

        //Contains: This would return 'true' if the passed string is contained in the another String
        boolean bContainResult = sPopularTopic_1.contains("Framework");
        System.out.println("The result of string Framework is contained in the String sPopularTopic_1 is : " + bContainResult);

        //Index of: This would return the starting index of the passed string
        int iIndex = sPopularTopic_1.indexOf("Framework");
        System.out.println("The start index of the string Framework is : " + iIndex);

        //Sub String First index: This would return the sub string of the string from the passed index number
        String sSubString = sPopularTopic_1.substring(iIndex);
        System.out.println("The sub string from the index number is : " + sSubString);

        //Sub String First & Last index: This would return the sub string from first index to end index
        sSubString = sPopularTopic_1.substring(8, 19);
        System.out.println("The sub string of Popular Topic 1 from index 8 to 18 is : " + sSubString);

        //To Lower Case: It would return the complete string in the lower case
        String sLowerCase = sPopularTopic_1.toLowerCase();
        System.out.println("The lower case of the Popular Topic 1 is : " + sLowerCase);

        //Split: It breaks the string into two parts from the passed argument and stores it into an array
        String [] aSplit = sPopularTopic_1.split("Automation");
        System.out.println("The first part of the array is : " + aSplit[0]);
        System.out.println("The last part of the array is : " + aSplit[1]);

    }


}
