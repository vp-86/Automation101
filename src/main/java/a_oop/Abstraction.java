package a_oop;

 abstract class Abstraction {

     /*
          hiding data only showing imp information to user
          100% abstraction via interface , partially using abstract class
          abstract class - can not create instance , restricted class, must be inherited from another class
          abstract method - no body , sub class need to provide body

         AC partially implemented or not implented at all
         AC allows you to create functionality that subclass can implement or override
         AC to design component and specify some common functionality. - code re usability
     */


     public abstract void animal(); // no body


     private String city="columbus";
     int age = 10;


     private String getName(){
         return "test";
     }

     void perform(){
     }

     public void printData(){
     }

}
