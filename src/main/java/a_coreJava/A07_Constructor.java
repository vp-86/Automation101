package a_coreJava;

public class A07_Constructor {

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

