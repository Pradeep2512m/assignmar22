package com.harman.project;

import java.util.Scanner;

class Cosine extends Thread{
    int x;

    public Cosine(int x) {
        this.x = x;
    }
    @Override
    public void run() {
        try{
            System.out.println("Cosine value of given number: "+ Math.cos(x));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Tan extends Thread{
    int x;

    public Tan(int x) {
        this.x = x;
    }
    @Override
    public void run() {
        try{
            System.out.println("Tan value of given number: "+ Math.tan(x));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class Sine extends Thread{
    int x;

    public Sine(int x) {
        this.x = x;
    }
    @Override
    public void run() {
        try{
            System.out.println("Sine value of given number: "+ Math.sin(x));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class Trifunc {
    public static void main(String[] args) {
        int a;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a=input.nextInt();

        Cosine cosobj=new Cosine(a);
        Tan tanobj=new Tan(a);
        Sine sinobj=new Sine(a);

        cosobj.start();
        tanobj.start();
        sinobj.start();

    }
}



