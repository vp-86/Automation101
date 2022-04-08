package a_coreJava;

import java.util.ArrayList;

public class A01_DataType {


    // explain method
    // if condition


    boolean flag = true;

    int age = 10;   // 32 bit info ; range >> -2,147,483,648 to 2,147,484,647

    double PI = 3.14159;

    char first = 'a'; // single quoated

    // class object
    String cityName = "NewYork";

    Integer amount = 10005;

    /* variable naming best practice

     + can be single letter of alphabet
     + can start with letter, underscore or $ sign ....but not digit
     + can have numeric value
     + can not have reserved keyword ..java static print

     1) Primitive data type :
       char byte short long float double int
      -- stores in memory , 16 bytes

     2) wrapper class
      Integer Character Byte Boolean
      -- internal class methods benefit
      -- stores as class object 64 bytes
     */


    public static void main(String[] args) {

        // Integer class methods

        Integer amount = 10005;

        System.out.println( Integer.MIN_VALUE );
        System.out.println( Integer.MAX_VALUE );

        // no use
        System.out.println( amount.compareTo(10005) ); // -1  0  1
        System.out.println( Integer.compare( 10,20));
        //++
        System.out.println( amount.equals(5000));

        System.out.println( Integer.TYPE ); // int
        System.out.println( Integer.max( 10,20));

        System.out.println( Integer.numberOfTrailingZeros( 1000500000 ));
        System.out.println( Integer.numberOfLeadingZeros( 00014141));

        System.out.println( Integer.getInteger( "2011") );
        System.out.println( Integer.valueOf("1011")); // returns Integer
        System.out.println( Integer.valueOf( 300000 )); // returns Integer
        System.out.println( Integer.parseInt("240" )); // returns int from string

        System.out.println( amount.toString()); // no use
        System.out.println( Integer.reverse( amount )); // no use


        //  Auto boxing : TODO explain after OOP
        Integer i = 10;   // supplied int value to wrapper class

        // Unboxing
        int k = i ;    // supplied Integer to int variable

        // Java handles autoboxing and unboxing itself
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);  //adding int value  list takes obj as Integer -- thats JAVA autoboxing

        // java handles unboxing
        for( Integer e : al ){
            if( e%2==0 )  {                       // unboxing itself
                System.out.println("even");
            } else if (e.intValue() == 100 ) {    //-- implicit autoboxing
                System.out.println("value is 100 ");
            }
        }

    }


}
