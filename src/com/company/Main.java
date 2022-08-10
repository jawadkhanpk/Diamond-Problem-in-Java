package com.company;

class A
{
    public void display()
    {
        System.out.println("class A display() method called");
    }
}
class B extends A
{
    @Override
    public void display()
    {
        System.out.println("class B display() method called");
    }
}
class C extends A
{
    @Override
    public void display()
    {
        System.out.println("class C display() method called");
    }
}

//not supported in Java
//public class Main extends B,C{
//
//    public static void main(String[] args) {
//	    // write your code here
//        D d = new D();    // uncomment this line
////        creates ambiguity which display() method to call
////        d.display();      // uncomment this line
//    }
//}


/*
Uncomment Above code from line no 27 to 36, but it will not run as multi inheritance is not
supported in java.
 */