package a_coreJava;

public class A07_Constructor {
    // purpose ( encapsulation )
    // default
    // parameterized

/*
    Constructor: --- why we need
   * default constructor >> as to encapsulation - not want to expose behavior of class
	                        -- Private member being initialized
   * Parameter constructor >> to force user to initialize required variable
*/



    public class test{

         private int test_id ;
         // default constructor
         public test(){
             test_id = 101;
         }

        // parameterized constructor
         public test(int a){
             test_id = a;
         }

         public int getTest_id(){
             return test_id;
         }
    }

    public static void main(String[] args) {

    }

}

