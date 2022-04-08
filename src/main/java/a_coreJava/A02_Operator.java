package a_coreJava;

public class A02_Operator {

    /*
         unary operator
            i++ i--

         Binary operator
            + - / *  %

         Ternary operator : takes three argument
           ? :




        Assignment Operators : =

        Arithmetic Operators: - + * / % ++ --

        Relational Operators : > < >= <= == !=

        Logical Operators : && || & | ! ^

        Conditional Operator : ?

        Bitwise Operator : & | ^ >> >>>

        Compound Assignment Operators :  += -= *= /= %=

     */


    public static void main(String[] args) {
       int a = 10;
       int b = 20;

       String firstname = "john";
       String lastname  = "doe";
        int sum = a + b;
        int deduction = b-a;
        int multiple = a*b;
        int div = b/a;
        int mod = b%5;

        System.out.println( "sum of a and b : " + sum );
        System.out.println( "ded of a and b : " + deduction);
        System.out.println( "mul of a and b : " + multiple);
        System.out.println( "div of a and b : " + div);
        System.out.println( "mod of a and b : " + mod);

        a++;
        System.out.println( "value of a after ++ " + a);

        b--;
        System.out.println( "value of b after -- " + b);



        // relational operator
        if( a > 10 ){
            System.out.println( "hey a is bigger than 10");
        } else {
            System.out.println( "a is smaller than 10");
        }

        if(b>=19) { System.out.println("value of b " + b); }
        if(b==10) System.out.println(" comparision ");

        if( a>0 && b>0){
            // both matched
            System.out.println( "a & b both positive number");
        }


        // conditional operator
        int Ten = 10;
        int Five = 5;

        if( Ten >= 10 || Five >= 10 ){
            System.out.println("verified - one of the condition or both matched ");
        }

        if( Five!= 6 ){
            System.out.println( " Five is not 6");
        }

        int dayCount = "Today".equalsIgnoreCase("tod") ?  2 :  4;

    }


}
