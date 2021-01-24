package io.basics.java;

public class SubClass {
    public static void main(String[] args){
    //text();
    //int C= sum();
    //System.out.println(sum());
        SubClass sc = new SubClass();
        System.out.println(sc.sum());

        SubClass2 dc = new SubClass2();
        System.out.println(dc.diff());

        System.out.println(SubClass2.diff());

    }

 /*   static void text(){
        System.out.println("Hello World");
    }

    static int sum(){
        int x = 2;
        int y = 3;
        int z = x + y;
        return z;
    }
*/
    public int sum(){
        int x = 2;
        int y = 3;
        int z = x + y;
        return z;
    }
}
