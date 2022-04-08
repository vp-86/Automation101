package a_coreJava;

public class A05_Loops {

    public static void main(String[] args) {

        //for loop
        for(int i=0; i< 5;  i++){
            System.out.println( i );
        }

        //do while -- eat while you are hungry
        int k=10;
        do{
            k=k-3;
            System.out.println( k );
        }while(k>0);


       // while loop -- while carHasPatrol >> lets drive
       int p=10;
       while(p>0){
           p=p-3;
           System.out.println( p );
       }

       //enhanced for loop -- Complete Array forloop
       String[] days = new String[]{"Mon","Tues","Wed","Thur","Fri"};

       for( String sDay: days ){
           System.out.println( sDay );
       }

    }

}
