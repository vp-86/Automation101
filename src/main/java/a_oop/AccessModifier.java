package a_oop;

import b_selenium.TC03;

public class AccessModifier extends TC03 {

    /*
        Final : can't redefine, can't extend, can't override

        private   : same class
        default   : same package
        protected : same package as extended class
        public    : any package in project

     */

    public static void main(String[] args) {
        // default not found here
        // protected not found here if we remove Inheritance
        TC03.I_am_public = "";
        TC03.I_am_protected="";
    }


}
