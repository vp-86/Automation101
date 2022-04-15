package a_coreJava;

import java.util.Arrays;

public class A04_Array {


    // index
    // storing multiple element
    // assign value two way
    // size , last element, accessElement
    // method ref
    // return from method


    // assing value directly

    Integer[] rollNo = {10,20,30};

    public void setArrayData(){
        // define
        String[] carType = new String[3];
        carType[0]= "Toyota";
        carType[1]= "Honda";
        carType[2]= "BMW";

        // define and declare
        Integer[] nums = new Integer[]{1,2,3,};


        // size on an array
        int size = carType.length;
        System.out.println("length of an carType array is : " + size );



        //access array
        System.out.println("firstvalue of an carType array is : " + carType[0] );


        //last element :  size -1


        //print all element using foreach
           // TODO - complete for loop


        // method referrence
        getOutput( nums );

        // return array
        getArray();

    }


    public void getOutput(Integer[] arr){
        System.out.println(  Arrays.toString( arr ) );
    }

    public Integer[] getArray( ){
        Integer[] arrInt = new Integer[]{ 10,20,30 };
        return arrInt ;
    }

}
