package com.company;

interface DemoInterface
{
    //default method
    default void display()
    {
        System.out.println("The dispaly() method invoked");
    }
}
//interface without default method
interface DemoInterface1 extends DemoInterface
{

}
//interface without default method
interface DemoInterface2 extends DemoInterface
{

}

public class DiamondProblemSolution implements DemoInterface1, DemoInterface2{
    public static void main(String args[]){

        DiamondProblemSolution obj = new DiamondProblemSolution();
        
//calling method
        obj.display();
    }
}

