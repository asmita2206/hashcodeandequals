package com.hashmap.hashcodeandequals.test;

import com.hashmap.hashcodeandequals.model.Human;

public class Test {

    public static void main(String[] args) {

        Human abhilash=new Human(1001,"Abhilash");
        int hashcodeVAlueOfAbhilashObject= abhilash.hashCode(); // hashcode is the method of Object class and it is a native method
        //native methods are methods which are declare,define and used in any different languages like c, c++
        // hashcode() creates/returns an unique number for each object
        System.out.println("abhilash object hashcode is : " +hashcodeVAlueOfAbhilashObject);

        Human abhi=new Human(1002,"Abhi");
        int hashcodeVAlueOfAbhiObject= abhi.hashCode();
        System.out.println("abhi object hashcode is : " +hashcodeVAlueOfAbhiObject);

        Human ashish=new Human(3003,"Ashish");
        int ashishVAlue= ashish.hashCode();
        System.out.println(ashishVAlue);

        String avinash= new String("Avinash");
        int aviHashcodeVAlue= avinash.hashCode();
        System.out.println("Hashcode value of avinash : "+aviHashcodeVAlue);

        String amit =new String("Amit");
        int amitHAshcode= amit.hashCode();
        System.out.println("amit hashcode : " + amitHAshcode);

        String str1 ="FB";
        String str2= "Ea";
        String str3= "Avinash";
        String str4= "EA";
        System.out.println(str1.hashCode() + " " + str2.hashCode() +" "+ str3.hashCode() + " "+ str4.hashCode()
        );
    }
}
