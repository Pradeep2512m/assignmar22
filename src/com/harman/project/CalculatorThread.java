package com.harman.project;
import java.util.Scanner;
class AddOperation extends Thread {
    int x, y;

    public AddOperation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try {
            System.out.println("Addition : ");
            System.out.println(x + y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class SubOperation extends Thread
{
    int x,y;
    public SubOperation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public void run() {
        try {
            System.out.println("Subtraction : ");
            System.out.println(x + y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MulOperation extends Thread
{
    int x,y;
    public MulOperation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public void run() {
        try {
            System.out.println("Multiplication : ");
            System.out.println(x * y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class DivOperation extends Thread
{
    int x,y;
    public DivOperation(int x, int y) {
        this.x = x;
        this.y = y;

    }
    @Override
    public void run() {
        try {
            System.out.println("Division : ");
            System.out.println(x / y);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


public class CalculatorThread {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st Number");
        a=input.nextInt();
        System.out.println("Enter 2nd Number");
        b=input.nextInt();


        AddOperation addobj=new AddOperation(a,b);
        SubOperation subobj=new SubOperation(a,b);
        MulOperation mulobj=new MulOperation(a,b);
        DivOperation divobj=new DivOperation(a,b);

        addobj.start();
        subobj.start();
        mulobj.start();
        divobj.start();
    }
}
